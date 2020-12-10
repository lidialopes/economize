/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Saimeen
 */
public class PrincipalController {
    private ClienteController clienteController;
    private RendaController rendaController;
    private LancamentoController lancamentoController;
    private MetaController metaController;
    private TabelaRelatorio tabelaRelatorio;
    
    public PrincipalController(){
        this.clienteController      = new ClienteController();
        this.rendaController        = new RendaController();
        this.lancamentoController   = new LancamentoController();
        this.metaController         = new MetaController();
    }

    public boolean encaminhaInsercaoCliente(String nome, String senha, String email) {
        if(this.clienteController.insereCliente(nome, senha, email)){
            int codCliente = this.clienteController.getID_Cliente(nome, senha);
            this.rendaController.insereRenda(codCliente);            
            
            return true;
        }
        else
            return false;
    }
    
    public boolean encaminhaMovimentacao(String descricao, int tipoLancamento, double valor, String categoria, String data, int parcela, String f_pagamento){
        if(tipoLancamento == 0)
            valor = -valor;
        int codRenda = this.rendaController.getID_Renda(LoginController.getCliente().getIdCliente());
        this.lancamentoController.enviaLancamento(descricao, tipoLancamento, valor, categoria, data, parcela, f_pagamento, codRenda);
        this.rendaController.atualizaRenda(valor, codRenda);
        return true;
    }
    
    public double getSaldoIncial(){
        int codRenda = this.rendaController.getID_Renda(LoginController.getCliente().getIdCliente());
        return this.lancamentoController.getSaldoInicialHome(codRenda);
    }
    
    public double getSaldoFinalHome(){
        int codRenda = this.rendaController.getID_Renda(LoginController.getCliente().getIdCliente());
        return this.lancamentoController.getSaldoFinalHome(codRenda);
    }
    public double getGanhosHome(){
        int codRenda = this.rendaController.getID_Renda(LoginController.getCliente().getIdCliente());
        return this.lancamentoController.getGanhosHome(codRenda);
    }
    public double getGastosHome(){
        int codRenda = this.rendaController.getID_Renda(LoginController.getCliente().getIdCliente());
        return this.lancamentoController.getGastosHome(codRenda);
    }

    public boolean encaminhaMeta(String categoria, double valor, int limite) {
        if(this.metaController.insereMeta(categoria, valor, limite, LoginController.getCliente().getIdCliente()))
            return true;
        return false;
    }
    
    public void mostraMovimentacoes(){
        this.lancamentoController.buscaLancamentos();
    }

    public TabelaRelatorio iniciaTabela() {
        int idRenda = this.rendaController.getID_Renda(LoginController.getCliente().getIdCliente());
        this.tabelaRelatorio = new TabelaRelatorio(idRenda);
        return this.tabelaRelatorio;
    }

    public TabelaRelatorio filtrarTabela(int mes, int ano, int tipo){      
        int idRenda = this.rendaController.getID_Renda(LoginController.getCliente().getIdCliente());
        this.tabelaRelatorio = new TabelaRelatorio();
        this.tabelaRelatorio.filtrarTabela(mes, ano, tipo, idRenda);
        return this.tabelaRelatorio;
    }
    
}
