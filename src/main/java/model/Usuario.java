package model;

public class Usuario {
    
    private String nome;
    private String email;
    private String cpf;
    private int idUsuario;
    
    public Usuario(){
        this("","","", 0);
    }
    
    public Usuario(String nome, String email, String cpf, int idUsuario) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.idUsuario = idUsuario;
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
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}