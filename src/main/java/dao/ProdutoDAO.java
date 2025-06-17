package dao;

import model.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

   
    public static ArrayList<Produto> MinhaLista = new ArrayList<>();
    
    public ProdutoDAO(){}
    
    public int pegarMaiorID() throws SQLException{
        int maior = 0;
        try{
            Connection conexao = ConexaoDAO.getConnection();
            if(conexao != null){
                try(Statement stm = conexao.createStatement()){
                    ResultSet res =  stm.executeQuery("SELECT MAX(idProduto) idProduto from produtos");
                    res.next();
                    maior = res.getInt("idProduto");
                }
            }
        } catch(SQLException ex){
        } return maior;
    }

    public Produto buscarPorId(int idProduto) throws SQLException {
        String sql = "SELECT * FROM produtos WHERE idProduto = ?";
        try (Connection conn = ConexaoDAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
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
    
    public ArrayList getMinhaLista() {
        MinhaLista.clear();
        try {
            Connection conexao = ConexaoDAO.getConnection();
            if (conexao != null) {
                Statement conexaoxao = conexao.createStatement();
                ResultSet resposta = conexaoxao.executeQuery("SELECT * FROM produtos");
                while (resposta.next()) {
                    int idProduto = resposta.getInt("idProduto");
                    String nome = resposta.getString("nome");
                    Double precoUnitario = resposta.getDouble("precoUnitario");
                    String unidade = resposta.getString("unidade");
                    int quantidadeEstoque = resposta.getInt("quantidadeEstoque");
                    int quantidadeMinima = resposta.getInt("quantidadeMinima");
                    int quantidadeMaxima = resposta.getInt("quantidadeMaxima");
                    String categoria = resposta.getString("categoria");
                    

                    Produto objeto = new Produto(idProduto, nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, quantidadeMaxima, categoria); 
                    MinhaLista.add(objeto);
                }
                conexaoxao.close();
            }

        } catch (SQLException ex) {
            //caso de erro
        }
        return MinhaLista;
    }

    public void create(Produto p) throws SQLException {
        String sql = "INSERT INTO produtos (idProduto, nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, quantidadeMaxima, categoria ) " + "VALUES (DEFAULT, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPrecoUnitario());
            stmt.setString(3, p.getUnidade());
            stmt.setInt(4, p.getQuantidadeEstoque());
            stmt.setInt(5, p.getQuantidadeMinima());
            stmt.setInt(6, p.getQuantidadeMaxima());
            stmt.setString(7, p.getCategoria());
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
                lista.add(p);
            }
        }
        return lista;
    }
    public void update(Produto p) throws SQLException {
            
            String sql = "UPDATE produtos SET nome=?, precoUnitario=?, unidade=?, quantidadeEstoque=?, quantidadeMinima=?, quantidadeMaxima=?, categoria=? WHERE idProduto=?";
            
            try (Connection conn = ConexaoDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                
             stmt.setString(1, p.getNome());
            stmt.setDouble(2, p.getPrecoUnitario());
            stmt.setString(3, p.getUnidade());
            stmt.setInt(4, p.getQuantidadeEstoque());
            stmt.setInt(5, p.getQuantidadeMinima());
            stmt.setInt(6, p.getQuantidadeMaxima());
            stmt.setString(7, p.getCategoria());
            stmt.setInt(8, p.getIdProduto());
            stmt.executeUpdate();  
            }
        }
        
        public void delete(int idProduto) throws SQLException {
            String sql = "DELETE FROM produtos WHERE idProduto=?";
            try (Connection conn = ConexaoDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                    
            stmt.setInt(1, idProduto);
            stmt.executeUpdate();
        }
 
        }
      public Produto buscarPorNome(String nome) throws SQLException {
       String sql = "SELECT * FROM produtos WHERE TRIM(LOWER(nome)) = TRIM(LOWER(?))";

    try (Connection conn = ConexaoDAO.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            Produto p = new Produto();
            p.setIdProduto(rs.getInt("idProduto"));
            p.setNome(rs.getString("nome"));
            p.setPrecoUnitario(rs.getDouble("precoUnitario"));
            p.setUnidade(rs.getString("unidade"));
            p.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
            p.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
            p.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
            return p;
        }
    }

    return null;
}

    }

