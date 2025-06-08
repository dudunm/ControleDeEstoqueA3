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
    private ProdutoDAO produtoDAO;

    public MovimentacaoDAO(Connection conexao) {
        this.conexao = conexao;
        this.produtoDAO = new ProdutoDAO();
    }

    public String registrarMovimentacao(Movimentacao movimentacao) throws SQLException {
        String mensagemAlerta = null;
        boolean autoCommitOriginal = conexao.getAutoCommit();

        try {
            conexao.setAutoCommit(false);

            Produto produto = produtoDAO.buscarPorId(movimentacao.getId_produto());
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
            produtoDAO.atualizar(produto);

            // Registra a movimentação
            String sql = "INSERT INTO movimentacao (data, tipo, quantidade, id_produto) VALUES (?, ?, ?, ?)";

            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setObject(1, movimentacao.getData());
                stmt.setString(2, tipo);
                stmt.setInt(3, movimentacao.getQuantidade());
                stmt.setInt(4, movimentacao.getId_produto());
                stmt.executeUpdate();
            }

            conexao.commit();
            return mensagemAlerta;

        } catch (SQLException e) {
            conexao.rollback();
            throw e;
        } finally {
            try {
                conexao.setAutoCommit(autoCommitOriginal);
            } catch (SQLException e) {
                // Logar erro se necessário
            }
        }
    }

    public List<Movimentacao> listarPorProduto(int idProduto) throws SQLException {
        String sql = "SELECT * FROM movimentacao WHERE id_produto = ? ORDER BY data DESC";
        List<Movimentacao> movimentacoes = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setInt(1, idProduto);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    Movimentacao mov = new Movimentacao();
                    mov.setData(rs.getObject("data", LocalDateTime.class));
                    mov.setTipo(rs.getString("tipo"));
                    mov.setQuantidade(rs.getInt("quantidade"));
                    mov.setId_produto(rs.getInt("id_produto"));

                    movimentacoes.add(mov);
                }
            }
        }
        return movimentacoes;
    }

    public List<Movimentacao> listarTodas() throws SQLException {
        String sql = "SELECT * FROM movimentacao ORDER BY data DESC";
        List<Movimentacao> movimentacoes = new ArrayList<>();

        try (PreparedStatement stmt = conexao.prepareStatement(sql); ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setData(rs.getObject("data", LocalDateTime.class));
                mov.setTipo(rs.getString("tipo"));
                mov.setQuantidade(rs.getInt("quantidade"));
                mov.setId_produto(rs.getInt("id_produto"));

                movimentacoes.add(mov);
            }
        }
        return movimentacoes;
    }
}




