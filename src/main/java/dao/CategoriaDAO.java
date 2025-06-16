package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import model.Categoria;

public class CategoriaDAO {
    
    public static ArrayList<Categoria> MinhaLista = new ArrayList<>();
    
    public CategoriaDAO(){}
    
    public int pegarMaiorID() throws SQLException{
        int maior = 0;
        try{
            Connection conexao = ConexaoDAO.getConnection();
            if(conexao != null){
                try(Statement stm = conexao.createStatement()){
                    ResultSet res =  stm.executeQuery("SELECT MAX(idCategoria) idCategoria from categoria");
                    res.next();
                    maior = res.getInt("idCategoria");
                }
            }
        } catch(SQLException ex){
        } return maior;
    }
    
    public ArrayList getMinhaLista() {
        MinhaLista.clear();
        try {
            Connection conexao = ConexaoDAO.getConnection();
            if (conexao != null) {
                Statement conexaoxao = conexao.createStatement();
                ResultSet resposta = conexaoxao.executeQuery("SELECT * FROM categoria");
                while (resposta.next()) {
                    int idCategoria = resposta.getInt("idCategoria");
                    String nome = resposta.getString("nome");
                    String tamanho = resposta.getString("tamanho");
                    String embalagem = resposta.getString("embalagem");

                    Categoria objeto = new Categoria(idCategoria, nome, tamanho, embalagem);
                    MinhaLista.add(objeto);
                }
                conexaoxao.close();
            }

        } catch (SQLException ex) {
            //caso de erro
        }
        return MinhaLista;
    }

    public void create(Categoria c) throws SQLException {
        String sql = "INSERT INTO categoria (idCategoria, nome, tamanho, embalagem) " + "VALUES (DEFAULT, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTamanho());
            stmt.setString(3, c.getEmbalagem());
            stmt.executeUpdate();
        }
    }
    
    public ArrayList<Categoria> getNomesCategorias() {
        ArrayList<Categoria> nomes = new ArrayList<>();
        try (Connection conn = ConexaoDAO.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet res = stmt.executeQuery("SELECT nome, embalagem, tamanho FROM categoria")) {

            while (res.next()) {
                
                Categoria c = new Categoria();
                
                c.setIdCategoria(res.getInt("idCategoria"));
                c.setNome(res.getString("nome"));
                c.setTamanho(res.getString("tamanho"));
                c.setEmbalagem(res.getString("embalagem"));
            }
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex);
        }
        return nomes;
    }
    
    public void update(Categoria c) throws SQLException {
            
            String sql = "UPDATE categoria SET nome=?, tamanho=?, embalagem=? WHERE idCategoria=?";
            
            try (Connection conn = ConexaoDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getTamanho());
            stmt.setString(3, c.getEmbalagem());
            stmt.setInt(4, c.getIdCategoria());
            stmt.executeUpdate();  
            }
        }
        
        public void delete(int idCategoria) throws SQLException {
            String sql = "DELETE FROM categoria WHERE idCategoria=?";
            try (Connection conn = ConexaoDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                    
            stmt.setInt(1, idCategoria);
            stmt.executeUpdate();
        }    
    }
}
