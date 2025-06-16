package model;

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

    public Categoria( int idCategoria, String nome, String tamanho, String embalagem) {
        this.dao = new CategoriaDAO();
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    
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
    
     /**
     * Deleta uma categoria especÍfica pelo seu ID.
     *
     * @param id Id da categoria a ser excluída.
     * @return Verdadeiro ou falso se conseguiu fazer a exclusão.
     */
    public boolean deleteCategoria(int id) throws SQLException {
        dao.delete(id);
        return true;
    }

    /**
     * Edita uma categoria especÍfica pelo seu ID.
     *
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
    
    public int maiorID() throws SQLException{
        return dao.pegarMaiorID();
    }
    
    public ArrayList<Categoria> getMinhaLista() {
        return dao.getMinhaLista();
    }

    public boolean insertCategoria(String nome, String tamanho, String embalagem) throws SQLException{
        int idCategoria = this.maiorID()+1;
        Categoria objeto = new Categoria(idCategoria, nome, tamanho, embalagem);
        dao.create(objeto);
        return true;
    }
}
