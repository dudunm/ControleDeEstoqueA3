package model;

import java.sql.SQLException;
import java.util.ArrayList;
import dao.ProdutoDAO;
public class Produto {
    
    // atributos da classe produto
    
    private int idProduto;
    private String nome;
    private double precoUnitario;
    private String unidade;
    private int quantidadeEstoque;
    private int quantidadeMinima;
    private int quantidadeMaxima;
    private String categoria;
    
    private final ProdutoDAO dao;
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
    
     public Produto() {
         
         this.dao = new ProdutoDAO();
     }

    // Aqui os getters e setters

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
     public int maiorID() throws SQLException{
        return dao.pegarMaiorID();
    }
    
    public ArrayList pegarLista(){
        return dao.getMinhaLista();
    }
    public boolean insertCategoria(String nome, Double precoUnitario, String unidade, int quantidadeEstoque, int quantidadeMinima, int quantidadeMaxima, String categoria) throws SQLException{
        int idProduto = this.maiorID()+1;
        Produto objeto = new Produto(idProduto, nome, precoUnitario, unidade, quantidadeEstoque, quantidadeMinima, quantidadeMaxima, categoria);
        dao.create(objeto);
        return true;
    }
}