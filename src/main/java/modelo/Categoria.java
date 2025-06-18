    /**
     * Classe que representa a entidade Categoria no sistema.
     * Contém os atributos e métodos relacionados a categorias de produtos.
     */

package modelo;

import java.sql.SQLException;
import dao.CategoriaDAO;
import java.util.ArrayList;

public class Categoria {

    private int idCategoria;
    private String nome;
    private String tamanho;
    private String embalagem;
    
    private final CategoriaDAO dao;
    
    public Categoria(){
        this.dao = new CategoriaDAO();
    }

    /**
     * Construtor com parâmetros.
     * @param idCategoria ID da categoria.
     * @param nome Nome da categoria.
     * @param tamanho Tamanho característico da categoria.
     * @param embalagem Tipo de embalagem característico da categoria.
     */
    
    public Categoria( int idCategoria, String nome, String tamanho, String embalagem) {
        this.dao = new CategoriaDAO();
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    // Getters e setters.
    
    public int getIdCategoria() {
        return idCategoria;
    }
    
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getEmbalagem() {
        return embalagem;
    }
    
    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }
    
    // Fim dos getters e setters.
    
    /**
     * Deleta uma categoria especÍfica pelo seu ID.
     * @param id Id da categoria a ser excluída.
     * @return Verdadeiro ou falso se conseguiu fazer a exclusão.
     */
    
    public boolean deleteCategoria(int id) throws SQLException {
        dao.delete(id);
        return true;
    }

    /**
     * Atualiza uma categoria especÍfica pelo seu ID.
     * @param id O id da categoria.
     * @param nome O nome da categoria.
     * @param embalagem A embalagem da categoiria.
     * @param tamanho O tamanho da categoira.
     * @return Verdadeiro ou falso se conseguiu fazer a inclusão.
     */
    
    public boolean updatecategoria(int id, String nome, String embalagem, String tamanho) throws SQLException{
        Categoria objeto = new Categoria(id, nome, embalagem, tamanho);
        dao.update(objeto);
        return true;
    }
    
    /**
     * Obtém o maior ID de categoria cadastrado no banco de dados.
     * @return O maior ID encontrado.
     * @throws SQLException Em caso de erro na consulta.
     */
    
    public int maiorID() throws SQLException{
        return dao.pegarMaiorID();
    }
    
    /**
     * Obtém todas as categorias cadastradas no banco de dados.
     * @return Lista de todas as categorias.
     */
    
    public ArrayList<Categoria> getMinhaLista() {
        return dao.getMinhaLista();
    }

    /**
     * Insere uma nova categoria no banco de dados.
     * @param nome Nome da nova categoria.
     * @param tamanho Tamanho característico da nova categoria.
     * @param embalagem Tipo de embalagem característico da nova categoria.
     * @return true se a inserção der certo.
     * @throws SQLException em caso de erro na inserção.
     */
    
    public boolean insertCategoria(String nome, String tamanho, String embalagem) throws SQLException{
        int idCategoria = this.maiorID()+1;
        Categoria objeto = new Categoria(idCategoria, nome, tamanho, embalagem);
        dao.create(objeto);
        return true;
    }
}
