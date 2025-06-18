/**
 * Classe responsável por operar os dados para a entidade Movimentacao.
 * Gerencia o registro e consulta de movimentações de estoque.
 */

package dao;

import modelo.Movimentacao;
import modelo.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leoclasen
 */
public class MovimentacaoDAO {

    private Connection conexao;
    
    public MovimentacaoDAO(Connection conexao) {
        this.conexao = conexao;
        new ProdutoDAO();
    }

    public MovimentacaoDAO() {
        new ProdutoDAO();
    }
    
    /**
     * Registra uma nova movimentação no estoque.
     * @param movimentacao Objeto Movimentacao contendo os dados da movimentação.
     * @return Mensagem de alerta caso haja estoque mínimo/máximo atingido, ou null.
     * @throws SQLException em caso de erro no registro.
     */

    public String registrarMovimentacao(Movimentacao movimentacao) throws SQLException {
        String mensagemAlerta = null;
        Connection conn = null;
        boolean autoCommitOriginal = true;

        try {
            conn = (this.conexao != null) ? this.conexao : ConexaoDAO.getConnection();
            autoCommitOriginal = conn.getAutoCommit();
            conn.setAutoCommit(false);

            Produto produto = buscarProdutoPorId(movimentacao.getIdProduto(), conn);
            if (produto == null) {
                throw new SQLException("Produto não encontrado!");
            }

            // Verificar estoque mínimo.
            int novaQuantidade = produto.getQuantidadeEstoque();
            String tipo = movimentacao.getTipo().toUpperCase();

            if (tipo.equals("ENTRADA")) {
                novaQuantidade += movimentacao.getQuantidade();
            } else if (tipo.equals("SAIDA")) {
                novaQuantidade -= movimentacao.getQuantidade();
                if (novaQuantidade < 0) {
                    throw new SQLException("Quantidade insuficiente em estoque!");
                }

                // Verificar estoque mínimo.
                if (novaQuantidade < produto.getQuantidadeMinima()) {
                    mensagemAlerta = "ALERTA: Estoque abaixo do mínimo!\n";
                }
            } else {
                throw new SQLException("Tipo de movimentação inválido! Use 'ENTRADA' ou 'SAIDA'");
            }

            // Verifica quantidade máxima.
            if (tipo.equals("ENTRADA") && novaQuantidade > produto.getQuantidadeMaxima()) {
                mensagemAlerta = "ALERTA: Estoque acima do máximo!\n";
            }

            // Atualiza o produto.
            produto.setQuantidadeEstoque(novaQuantidade);
            atualizarProduto(produto, conn);

            // Registra a movimentação.
            String sql = "INSERT INTO movimentacao (data, tipo, quantidade, idProduto) VALUES (?, ?, ?, ?)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setObject(1, movimentacao.getData());
                stmt.setString(2, tipo);
                stmt.setInt(3, movimentacao.getQuantidade());
                stmt.setInt(4, movimentacao.getIdProduto());
                stmt.executeUpdate();
            }

            conn.commit();
            return mensagemAlerta;

        } catch (SQLException e) {
            if (conn != null) {
                conn.rollback();
            }
            throw e;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(autoCommitOriginal);

                    if (this.conexao == null) {
                        conn.close();
                    }
                } catch (SQLException e) {
                    // Logar erro se necessário.
                }
            }
        }
    }

    /**
     * Busca um produto pelo ID no banco de dados.
     * @param idProduto ID do produto a ser buscado.
     * @param conn Conexão com o banco de dados.
     * @return Objeto Produto encontrado ou null se não existir.
     * @throws SQLException em caso de erro na consulta.
     */
    
    private Produto buscarProdutoPorId(int idProduto, Connection conn) throws SQLException {
        String sql = "SELECT * FROM produtos WHERE idProduto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idProduto);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Produto produto = new Produto();
                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
                    produto.setUnidade(rs.getString("unidade"));
                    produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                    produto.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                    produto.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                    produto.setCategoria(rs.getString("categoria"));
                    return produto;
                }
            }
        }
        return null;
    }
    
    /**
     * Atualiza os dados de um produto no banco de dados.
     * @param produto Objeto Produto com os dados atualizados.
     * @param conn Conexão com o banco de dados.
     * @throws SQLException em caso de erro na atualização.
     */

    private void atualizarProduto(Produto produto, Connection conn) throws SQLException {
        String sql = "UPDATE produtos SET quantidadeEstoque = ? WHERE idProduto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, produto.getQuantidadeEstoque());
            stmt.setInt(2, produto.getIdProduto());
            stmt.executeUpdate();
        }
    }

    /**
     * Lista todas as movimentações de um produto específico.
     * @param idProduto ID do produto para filtrar as movimentações.
     * @return Lista de movimentações do produto, ordenadas por data.
     * @throws SQLException em caso de erro na consulta.
     */
    
    public List<Movimentacao> listarPorProduto(int idProduto) throws SQLException {
        String sql = "SELECT * FROM movimentacao WHERE idProduto = ? ORDER BY data DESC";
        List<Movimentacao> movimentacoes = new ArrayList<>();

        try (Connection conn = ConexaoDAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idProduto);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Movimentacao mov = new Movimentacao();
                    mov.setData(rs.getObject("data", LocalDateTime.class));
                    mov.setTipo(rs.getString("tipo"));
                    mov.setQuantidade(rs.getInt("quantidade"));
                    mov.setIdProduto(rs.getInt("IdProduto"));

                    movimentacoes.add(mov);
                }
            }
        }
        return movimentacoes;
    }

    /**
     * Lista todas as movimentações registradas no sistema.
     * @return Lista de todas as movimentações, ordenadas por data.
     * @throws SQLException em caso de erro na consulta.
     */
    
    public List<Movimentacao> listarTodas() throws SQLException {
        String sql = "SELECT * FROM movimentacao ORDER BY data DESC";
        List<Movimentacao> movimentacoes = new ArrayList<>();

        try (Connection conn = ConexaoDAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setData(rs.getObject("data", LocalDateTime.class));
                mov.setTipo(rs.getString("tipo"));
                mov.setQuantidade(rs.getInt("quantidade"));
                mov.setIdProduto(rs.getInt("IdProduto"));

                movimentacoes.add(mov);
            }
        }
        return movimentacoes;
    }
    
    /**
     * Registra uma movimentação usando o nome do produto em vez do ID.
     * @param nomeProduto Nome do produto a ser movimentado.
     * @param movimentacao Objeto Movimentacao com os dados da movimentação.
     * @return Mensagem de alerta caso haja estoque mínimo/máximo atingido, ou null.
     * @throws SQLException em caso de erro no registro.
     */
    
    public String registrarMovimentacaoPorNome(String nomeProduto, Movimentacao movimentacao) throws SQLException {
    String mensagemAlerta = null;
    Connection conn = null;
    boolean autoCommitOriginal = true;

    try {
        conn = (this.conexao != null) ? this.conexao : ConexaoDAO.getConnection();
        autoCommitOriginal = conn.getAutoCommit();
        conn.setAutoCommit(false);

        // Busca direta pelo nome.
        Produto produto = null;
        String sqlBusca = "SELECT * FROM produtos WHERE TRIM(LOWER(nome)) = TRIM(LOWER(?))";
        try (PreparedStatement stmt = conn.prepareStatement(sqlBusca)) {
            stmt.setString(1, nomeProduto);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    produto = new Produto();
                    produto.setIdProduto(rs.getInt("idProduto"));
                    produto.setNome(rs.getString("nome"));
                    produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
                    produto.setUnidade(rs.getString("unidade"));
                    produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                    produto.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                    produto.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                    produto.setCategoria(rs.getString("categoria"));
                }
            }
        }

        if (produto == null) {
            throw new SQLException("Produto não encontrado!");
        }

        int novaQuantidade = produto.getQuantidadeEstoque();
        String tipo = movimentacao.getTipo().toUpperCase();

        if (tipo.equals("ENTRADA")) {
            novaQuantidade += movimentacao.getQuantidade();
        } else if (tipo.equals("SAIDA")) {
            novaQuantidade -= movimentacao.getQuantidade();
            if (novaQuantidade < 0) {
                throw new SQLException("Quantidade insuficiente em estoque!");
            }

            if (novaQuantidade < produto.getQuantidadeMinima()) {
                mensagemAlerta = "ALERTA: Estoque abaixo do mínimo!\n";
            }
        } else {
            throw new SQLException("Tipo de movimentação inválido! Use 'ENTRADA' ou 'SAIDA'");
        }

        if (tipo.equals("ENTRADA") && novaQuantidade > produto.getQuantidadeMaxima()) {
            mensagemAlerta = "ALERTA: Estoque acima do máximo!\n";
        }

        // Atualiza o estoque.
        produto.setQuantidadeEstoque(novaQuantidade);
        atualizarProduto(produto, conn);

        // Registra movimentação.
        String sqlInsert = "INSERT INTO movimentacao (data, tipo, quantidade, idProduto) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sqlInsert)) {
            stmt.setObject(1, movimentacao.getData());
            stmt.setString(2, tipo);
            stmt.setInt(3, movimentacao.getQuantidade());
            stmt.setInt(4, produto.getIdProduto());
            stmt.executeUpdate();
        }

        conn.commit();
        return mensagemAlerta;

    } catch (SQLException e) {
        if (conn != null) conn.rollback();
        throw e;
    } finally {
        if (conn != null) {
            conn.setAutoCommit(autoCommitOriginal);
            if (this.conexao == null) conn.close();
        }
    }
}

}




