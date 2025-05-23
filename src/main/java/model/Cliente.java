package model;

public class Cliente {
    
    private String nome;
    private String email;
    private String cpf;
    private int idCliente;
    
    public Cliente(){
        this("","","", 0);
    }
    
    public Cliente(String nome, String email, String cpf, int idCliente) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
