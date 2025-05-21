package model;

public class Produto {
    
    private String nome;
    private String categoria;
    private int quantidade;
    private double precoUnitario;
    
    public Produto(String nome, String categoria, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }
    
     public Produto() {
         
         this("", "", 0, 0.0);
     }

    // Aqui vai os get e os set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public double calcularValorTotal() {
        return this.quantidade * this.precoUnitario;
    }
    
    @Override 
    public String toString() {
        return nome + " | " + categoria + " | Qtd: " + quantidade + " | Preço: R$" + precoUnitario;
    }
}