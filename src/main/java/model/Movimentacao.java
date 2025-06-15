package model;

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

    public Movimentacao(LocalDateTime data, String tipo, int quantidade, int idProduto) {
        this.data = data;
        this.tipo = tipo;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
    }

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
        this.idProduto = idProduto;
    }
}
