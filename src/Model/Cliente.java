
package Model;

public class Cliente {
    private int idCliente;
    private String nome;
    private String senha;
    private String email;
    
    
    public Cliente(int id, String nome, String senha, String email) {
        this.idCliente = id;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
