    /**
     * Classe que representa a entidade Movimentacao no sistema.
     * Contém os atributos e métodos relacionados a movimentações de estoque.
     */

package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author leoclasen
 */
public class Movimentacao {

    private LocalDateTime data;
    private String tipo;
    private int quantidade;
    private int idProduto;

    public Movimentacao() {
        this(LocalDateTime.now(), "", 0, 0);
    }
    
    /**
     * Construtor com parâmetros
     * @param data Data e hora da movimentação.
     * @param tipo Tipo de movimentação (entrada/saida).
     * @param quantidade Quantidade movimentada.
     * @param idProduto ID do produto movimentado.
     */

    public Movimentacao(LocalDateTime data, String tipo, int quantidade, int idProduto) {
        this.data = data;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
    }
    
    // Getters e setters.

    public LocalDateTime getData() {
        return data;
    }
    
    public void setData(LocalDateTime data) {
        this.data = data;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public int getIdProduto() {
        return idProduto;
    }
    
   public void setIdProduto(int id_produto) {
    this.idProduto = id_produto;
}
   
   // Fim dos getters e setters.
    
}
