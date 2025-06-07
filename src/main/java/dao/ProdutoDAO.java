package dao;

import model.Produto;
import model.Categoria;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    // Cadastrar novo produto;
    public boolean cadastrar(Produto produto) {
        String sql = "INSERT INTO produtos (nome, precoUnitario, unidade, quantidadeEstoque, "
                   + "quantidadeMinima, quantidadeMaxima, idCategoria) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setInt(5, produto.getQuantidadeMinima());
            stmt.setInt(6, produto.getQuantidadeMaxima());
            
            if (produto.getCategoria() != null) {
                stmt.setInt(7, produto.getCategoria().getIdCategoria());
            } else {
                stmt.setNull(7, Types.INTEGER);
            }
            
            stmt.executeUpdate();
            
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    produto.setIdProduto(rs.getInt(1));
                }
            }
            return true;
            
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar produto: " + e.getMessage());
            return false;
        }
    }

    // Buscar produto por ID;
    public Produto buscarPorId(int id) {
        String sql = "SELECT p.*, c.nome AS categoria_nome FROM produtos p "
                   + "LEFT JOIN categoria c ON p.idCategoria = c.idCategoria "
                   + "WHERE p.idProduto = ?";
        
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return mapearProduto(rs);
                }
            }
            
        } catch (SQLException e) {
            System.err.println("Erro ao buscar produto: " + e.getMessage());
        }
        return null;
    }

    // Listar todos os produtos;
    public List<Produto> listarTodos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT p.*, c.nome AS categoria_nome FROM produtos p "
                   + "LEFT JOIN categoria c ON p.idCategoria = c.idCategoria";
        
        try (Connection conn = ConexaoDAO.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                produtos.add(mapearProduto(rs));
            }
            
        } catch (SQLException e) {
            System.err.println("Erro ao listar produtos: " + e.getMessage());
        }
        return produtos;
    }

    // Atualizar produto;
    public boolean atualizar(Produto produto) {
        String sql = "UPDATE produtos SET nome = ?, precoUnitario = ?, unidade = ?, "
                   + "quantidadeEstoque = ?, quantidadeMinima = ?, quantidadeMaxima = ?, "
                   + "idCategoria = ? WHERE idProduto = ?";
        
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPrecoUnitario());
            stmt.setString(3, produto.getUnidade());
            stmt.setInt(4, produto.getQuantidadeEstoque());
            stmt.setInt(5, produto.getQuantidadeMinima());
            stmt.setInt(6, produto.getQuantidadeMaxima());
            
            if (produto.getCategoria() != null) {
                stmt.setInt(7, produto.getCategoria().getIdCategoria());
            } else {
                stmt.setNull(7, Types.INTEGER);
            }
            
            stmt.setInt(8, produto.getIdProduto());
            
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar produto: " + e.getMessage());
            return false;
        }
    }

    // Remover produto
    public boolean remover(int id) {
        String sql = "DELETE FROM produtos WHERE idProduto = ?";
        
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.err.println("Erro ao remover produto: " + e.getMessage());
            return false;
        }
    }

    // Método auxiliar para mapear ResultSet - Produto
    private Produto mapearProduto(ResultSet rs) throws SQLException {
        Produto produto = new Produto();
        produto.setIdProduto(rs.getInt("idProduto"));
        produto.setNome(rs.getString("nome"));
        produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
        produto.setUnidade(rs.getString("unidade"));
        produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
        produto.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
        produto.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
        
        if (rs.getObject("idCategoria") != null) {
            Categoria cat = new Categoria();
            cat.setIdCategoria(rs.getInt("idCategoria"));
            cat.setNome(rs.getString("categoria_nome"));
            produto.setCategoria(cat);
        }
        return produto;
    }

    // Listar produtos com estoque abaixo do mínimo
    public List<Produto> listarEstoqueBaixo() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos WHERE quantidadeEstoque < quantidadeMinima";
        
        try (Connection conn = ConexaoDAO.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                produtos.add(mapearProduto(rs));
            }
            
        } catch (SQLException e) {
            System.err.println("Erro ao listar estoque baixo: " + e.getMessage());
        }
        return produtos;
    }                
} 
