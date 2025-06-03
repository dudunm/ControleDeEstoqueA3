package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import model.Produto;
import model.Categoria;

public class ProdutoDAO {
    
    public void create(Produto p) throws SQLException {
        String sql = "INSERT INTO produtos (nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, quantidadeMaxima, idCategoria) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); 
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPrecoUnitario());
            stmt.setString(3, p.getUnidade());
            stmt.setInt(4, p.getQuantidadeEstoque());
            stmt.setInt(5, p.getQuantidadeMinima());
            stmt.setInt(6, p.getQuantidadeMaxima());
            stmt.setInt(7, p.getCategoria().getIdCategoria());
            stmt.executeUpdate();  
        }
    }
    
    public List<Produto> readAll() throws SQLException {
        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        
            try (Connection conn = ConexaoDAO.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            
            
            while (rs.next()) {
                
                Produto p = new Produto();
                
                p.setIdProduto(rs.getInt("idProduto"));
                p.setNome(rs.getString("nome"));
                p.setPrecoUnitario(rs.getDouble("precoUnitario"));
                p.setUnidade(rs.getString("unidade"));
                p.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                p.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                p.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                
                
                Categoria c = new Categoria();
                c.setIdCategoria(rs.getInt("idCategoria"));
                p.setCategoria(c);
                
                lista.add(p);
            }
        }
        
        return lista;
    }
        
        public void update(Produto p) throws SQLException {
            
            String sql = "UPDATE produtos SET nome=?, precoUnitario=?, unidade=?, quantidadeEstoque=?, quantidadeMinima=?, quantidadeMaxima=?, idCategoria=? WHERE idProduto=?";
            
            try (Connection conn = ConexaoDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                
              stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPrecoUnitario());
            stmt.setString(3, p.getUnidade());
            stmt.setInt(4, p.getQuantidadeEstoque());
            stmt.setInt(5, p.getQuantidadeMinima());
            stmt.setInt(6, p.getQuantidadeMaxima());
            stmt.setInt(7, p.getCategoria().getIdCategoria());
            stmt.setInt(8, p.getIdProduto());
            stmt.executeUpdate();  
            }
        }
        
        public void delete(int idProduto) throws SQLException {
            String sql = "DELETE FROM produtos WHERE idproduto=?";
            try (Connection conn = ConexaoDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                    
            stmt.setInt(1, idProduto);
            stmt.executeUpdate();
        }    
    }
}

