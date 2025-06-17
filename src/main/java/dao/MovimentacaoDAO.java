package dao;

import model.Movimentacao;
import model.Produto;
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

            int novaQuantidade = produto.getQuantidadeEstoque();
            String tipo = movimentacao.getTipo().toUpperCase();

            if (tipo.equals("ENTRADA")) {
                novaQuantidade += movimentacao.getQuantidade();
            } else if (tipo.equals("SAIDA")) {
                novaQuantidade -= movimentacao.getQuantidade();
                if (novaQuantidade < 0) {
                    throw new SQLException("Quantidade insuficiente em estoque!");
                }

                // Verificar estoque mínimo
                if (novaQuantidade < produto.getQuantidadeMinima()) {
                    mensagemAlerta = "ALERTA: Estoque abaixo do mínimo!\n";
                }
            } else {
                throw new SQLException("Tipo de movimentação inválido! Use 'ENTRADA' ou 'SAIDA'");
            }

            // Verifica quantidade máxima
            if (tipo.equals("ENTRADA") && novaQuantidade > produto.getQuantidadeMaxima()) {
                mensagemAlerta = "ALERTA: Estoque acima do máximo!\n";
            }

            // Atualiza o produto
            produto.setQuantidadeEstoque(novaQuantidade);
            atualizarProduto(produto, conn);

            // Registra a movimentação
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
                    // Logar erro se necessário
                }
            }
        }
    }

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

    private void atualizarProduto(Produto produto, Connection conn) throws SQLException {
        String sql = "UPDATE produtos SET quantidadeEstoque = ? WHERE idProduto = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, produto.getQuantidadeEstoque());
            stmt.setInt(2, produto.getIdProduto());
            stmt.executeUpdate();
        }
    }

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
}




