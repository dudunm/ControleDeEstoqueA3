    /**
     * Classe responsável pelas operações de acesso a dados para a entidade Produto.
     * Realiza operações CRUD (Create, Read, Update, Delete) no banco de dados.
     */

package dao;

import modelo.Produto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Categoria;

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

    /**
     * Obtém o maior ID de produto cadastrado no banco de dados.
     * @return O maior ID encontrado.
     * @throws SQLException em caso de erro na consulta no banco de dados.
     */
    
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
    
    /**
     * Obtém todos os produtos cadastrados no banco de dados.
     * @return ArrayList contendo todos os produtos.
     */
    
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
            // Caso de erro.
        }
        return MinhaLista;
    }
    
    /**
     * Insere um novo produto no banco de dados.
     * @param p Objeto Produto a ser inserido.
     * @throws SQLException em caso de erro na inserção.
     */

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
    
    /**
     * Obtém todos os produtos cadastrados no banco de dados.
     * @return Lista de todos os produtos.
     * @throws SQLException em caso de erro na consulta.
     */

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
    
    /**
     * Atualiza um produto existente no banco de dados.
     * @param p Objeto Produto com os dados atualizados.
     * @throws SQLException em caso de erro na atualização.
     */
    
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
    
    /**
     * Remove um produto do banco de dados.
     * @param idProduto ID do produto a ser removido.
     * @throws SQLException em caso de erro na remoção.
     */
        
        public void delete(int idProduto) throws SQLException {
            String sql = "DELETE FROM produtos WHERE idProduto=?";
            try (Connection conn = ConexaoDAO.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
                    
            stmt.setInt(1, idProduto);
            stmt.executeUpdate();
        }
 
        }
        
    /**
     * Busca um produto pelo nome no banco de dados.
     * @param nome Nome do produto a ser buscado.
     * @return Objeto Produto encontrado ou null se não existir.
     * @throws SQLException em caso de erro na consulta.
     */
        
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
       /**
       * Mapeia os dados de um ResultSet para um objeto Produto.
       * @param rs ResultSet contendo os dados do produto.
       * @return Objeto Produto preenchido.
       * @throws SQLException em caso de erro no mapeamento.
       */
      
      private Produto mapearProduto(ResultSet rs) throws SQLException {
           Produto p = new Produto();
           p.setIdProduto (rs.getInt("idproduto"));
           p.setNome(rs.getString("nome"));
           p.setPrecoUnitario(rs.getDouble("precoUnitario"));
           p.setUnidade(rs.getString("unidade"));
           p.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
           p.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
           p.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
           
           if (rs.getObject("idCategoria") != null){
               p.setCategoria(rs.getString("categoria_nome"));   
           }
           return p;  
       }
      
    /**
     * Lista todos os produtos com estoque abaixo da quantidade mínima.
     * @return Lista de produtos com estoque abaixo do mínimo.
     */
       
       public List<Produto>listEstoqueAbaixoMinimo(){
           List<Produto> produtos = new ArrayList<>();
           String sql = "SELECT * FROM produtos Where quantidadeEstoque < quantidadeMinima";
           
           try(Connection conn = ConexaoDAO.getConnection();
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(sql)){
               
               while(rs.next()){
                   produtos.add(mapearProduto(rs));
                   
               }
           }catch(SQLException e){
               System.err.println("Erro ao listar estoque abaixo do minimo:" + e.getMessage());
               
           }
           return produtos;
       }
       
    /**
     * Lista todos os produtos com estoque acima da quantidade máxima.
     * @return Lista de produtos com estoque acima do máximo.
     */
       
       public List<Produto>listEstoqueAcimaMaximo(){
           List<Produto> produtos = new ArrayList<>();
           String sql = "SELECT * FROM produtos Where quantidadeEstoque > quantidadeMaxima";
           
           try(Connection conn = ConexaoDAO.getConnection();
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(sql)){
               
               while(rs.next()){
                   produtos.add(mapearProduto(rs));
                   
               }
            }catch(SQLException e){
               System.err.println("Erro ao listar estoque acima do maximo:" + e.getMessage());
        }
           return produtos;
       }
       
    /**
     * Lista a quantidade de produtos por categoria.
     * @return Lista de arrays de strings, onde o array contém o nome da categoria e a quantidade de produtos.
     */
       
       public List<String[]> listarQuantidadeProdPorCategoria(){
           List<String[]> lista = new ArrayList<>();
           String sql = "SELECT categoria, COUNT(*) AS total FROM produtos GROUP BY categoria ORDER BY categoria";
           
           try(Connection conn = ConexaoDAO.getConnection();
               Statement stmt = conn.createStatement();
               ResultSet rs = stmt.executeQuery(sql)){
               
               while(rs.next()){
                   String categoria = rs.getString("categoria");
                   String total = String.valueOf(rs.getInt("total"));
                   lista.add(new String[]{categoria,total});
               }
           }catch(SQLException e){
               System.out.println("Erro ao contar produtos por categoria:" + e.getMessage());
               
           }
           return lista;
       }
       
    public List<Produto> listarProdutosOrdemAlfabetica() throws SQLException {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos ORDER BY nome ASC";

        try (Connection conn = ConexaoDAO.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Produto produto = new Produto();
                produto.setIdProduto(rs.getInt("idProduto"));
                produto.setNome(rs.getString("nome"));
                produto.setPrecoUnitario(rs.getDouble("precoUnitario"));
                produto.setQuantidadeEstoque(rs.getInt("quantidadeEstoque"));
                produto.setQuantidadeMinima(rs.getInt("quantidadeMinima"));
                produto.setQuantidadeMaxima(rs.getInt("quantidadeMaxima"));
                produto.setUnidade(rs.getString("unidade"));
                produto.setCategoria(rs.getString("categoria"));

                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar produtos em ordem alfabética: " + e.getMessage());
            throw e;
        }
        return produtos;
    }
           
      
}

