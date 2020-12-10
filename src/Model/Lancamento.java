
package Model;

import java.util.Calendar;


public class Lancamento {
    private int idLancamento;
    private String descricao;
    private String tipo;
    private double valor;
    private String categoria;
    private String data;
    private int parcela;
    private String forma_pagamento;
    private int idRenda;
    
    public Lancamento() {
        
    }
    
    public Lancamento(int idMovimentacao, String descricao, String tipo, double valor, String categoria,
            String data, int parcela, String f_pagamento, int idRenda) {
        this.idLancamento = idMovimentacao;
        this.descricao       = descricao;
        this.tipo            = tipo;
        this.valor           = valor;
        this.categoria       = categoria;
        this.data            = data;
        this.parcela         = parcela;
        this.forma_pagamento = f_pagamento;
        this.idRenda         = idRenda;
    }

    public int getIdMovimentacao() {
        return idLancamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    public int getIdRenda() {
        return idRenda;
    }

}
