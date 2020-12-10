
package Model;

import java.util.Date;

public class Meta {
    private int idMeta;
    private String categoria;
    private double valor;
    private Date limite;
    private int cliente_idCliente;
    
    public Meta() {
        
    }
    
    public Meta(int id, String categoria, double valor, Date limite, int idCliente) {
        this.idMeta = id;
        this.categoria = categoria;
        this.valor = valor;
        this.limite = limite;
        this.cliente_idCliente = idCliente;
    }

    public int getIdMeta() {
        return idMeta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getLimite() {
        return limite;
    }

    public void setLimite(Date limite) {
        this.limite = limite;
    }

    public int getCliente_idCliente() {
        return cliente_idCliente;
    }
}
