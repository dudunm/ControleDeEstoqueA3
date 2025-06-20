    /**
     * Classe que representa a entidade Produto no sistema.
     * Contém os atributos e métodos relacionados aos produtos do estoque.
     */

package modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import dao.ProdutoDAO;
public class Produto {
    
    // Atributos da classe produto.
    
    private int idProduto;
    private String nome;
    private double precoUnitario;
    private String unidade;
    private int quantidadeEstoque;
    private int quantidadeMinima;
    private int quantidadeMaxima;
    private String categoria;
    
    private final ProdutoDAO dao;
    
    /**
     * Construtor com parâmetros.
     * @param idProduto ID do produto.
     * @param nome Nome do produto.
     * @param precoUnitario Preço unitário do produto.
     * @param unidade Unidade de medida do produto.
     * @param quantidadeEstoque Quantidade atual em estoque.
     * @param quantidadeMinima Quantidade mínima em estoque.
     * @param quantidadeMaxima Quantidade máxima em estoque.
     * @param categoria Categoria do produto.
     */
    
    public Produto(int idProduto, String nome, double precoUnitario, String unidade, int quantidadeEstoque, int quantidadeMinima, int quantidadeMaxima, String categoria) {
        this.dao = new ProdutoDAO();
        this.idProduto = idProduto;
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.unidade = unidade;
        this.quantidadeEstoque = quantidadeEstoque;
        this.quantidadeMinima = quantidadeMinima;
        this.quantidadeMaxima = quantidadeMaxima;
        this.categoria = categoria;

    }
    
    /**
     * Construtor padrão que inicializa o DAO.
     */
    
     public Produto() {
         
         this.dao = new ProdutoDAO();
     }

    // Getters e setters.

     public int getIdProduto() {
         return idProduto;
     }
     
     public void setIdProduto( int idProduto) {
         this.idProduto = idProduto;
     }
     
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public String getUnidade() {
        return unidade;
    }
    
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
   
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }
   
    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
    
    public int getQuantidadeMaxima() {
        return quantidadeMaxima;
    }
   
    public void setQuantidadeMaxima(int quantidadeMaxima) {
        this.quantidadeMaxima = quantidadeMaxima;
    }
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    // Fim dos getters e setters.
    
     /**
     * Deleta uma categoria especÍfica pelo seu ID.
     *
     * @param id Id da categoria a ser excluída.
     * @return Verdadeiro ou falso se conseguiu fazer a exclusão.
     */
    public boolean deleteProduto(int id) throws SQLException {
        dao.delete(id);
        return true;
    }

    /**
     * Edita uma categoria especÍfica pelo seu ID.
     *
     * @param idProduto O id do produto.
     * @param nome O nome do produto.
     * @param precoUnitario O nome do produto.
     * @param unidade O nome do produto. 
     * @param quantidadeEstoque O nome do produto.
     * @param quantidadeMinima O nome do produto.
     * @param quantidadeMaxima O nome do produto.
     * @param categoria O nome do produto.
     * @return Verdadeiro ou falso se conseguiu fazer a inclusão.
     */
    public boolean updateProduto(int idProduto, String nome, Double precoUnitario, String unidade, int quantidadeEstoque, int quantidadeMinima, int quantidadeMaxima, String categoria ) throws SQLException{
        Produto objeto = new Produto(idProduto, nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, quantidadeMaxima, categoria);
        dao.update(objeto);
        return true;
    }
    
    /**
     * Obtém o maior ID de produto cadastrado no banco de dados.
     * @return O maior ID encontrado.
     * @throws SQLException Em caso de erro na consulta.
     */
    
     public int maiorID() throws SQLException{
        return dao.pegarMaiorID();
    }
    
    /**
     * Obtém todos os produtos cadastrados no banco de dados.
     * @return Lista de todos os produtos.
     */
     
    public ArrayList<Produto> getMinhaLista() {
        return dao.getMinhaLista();
    }
    
    /**
     * Insere um novo produto no banco de dados.
     * @param nome Nome do novo produto.
     * @param precoUnitario Preço unitário do novo produto.
     * @param unidade Unidade de medida do novo produto.
     * @param quantidadeEstoque Quantidade inicial em estoque.
     * @param quantidadeMinima Quantidade mínima em estoque.
     * @param quantidadeMaxima Quantidade máxima em estoque.
     * @param categoria Categoria do novo produto.
     * @return true se a inserção foi bem-sucedida.
     * @throws SQLException em caso de erro na inserção.
     */
    
    public boolean insertProduto(String nome, Double precoUnitario, String unidade, int quantidadeEstoque, int quantidadeMinima, int quantidadeMaxima, String categoria) throws SQLException{
        int idProduto = this.maiorID()+1;
        Produto objeto = new Produto(idProduto, nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, quantidadeMaxima, categoria);
        dao.create(objeto);
        return true;
    }
}