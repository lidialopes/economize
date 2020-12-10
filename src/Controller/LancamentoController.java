/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOLancamento;
import Model.Lancamento;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Saimeen
 */
public class LancamentoController {
    
    private DAOLancamento daoLancamento;
    private Calendar data;
    
    public LancamentoController(){
        this.daoLancamento = new DAOLancamento();
        this.data = GregorianCalendar.getInstance();
    }
    
    public String convertFormatoDataParaMySQL(String data){
        String dia = data.substring(0,2); 
        String mes = data.substring(3, 5); 
        String ano = data.substring(6);
        String dataMySQL = ano+"-"+mes+"-"+dia;
        return dataMySQL;
    }
    
    public boolean enviaLancamento(String descricao, int tipoLancamento, double valor, 
            String categoria, String data, int parcela, String f_pagamento, int codRenda){      

        String dataMySQL = convertFormatoDataParaMySQL(data);
        this.daoLancamento.salvaLancamento(descricao, tipoLancamento, valor, categoria, dataMySQL, parcela, f_pagamento, codRenda);
        return true;
    }
    
    public double getGastosHome(int idRenda){
        String dataLimite = ""+data.get(Calendar.YEAR)+"-"+(data.get(Calendar.MONTH)+1)+"-"+data.get(Calendar.DATE);
        double gastos = this.daoLancamento.somaLancamentosMensais(0, (data.get(Calendar.MONTH)+1), dataLimite, idRenda);
        return gastos;
    }
    public double getGanhosHome(int idRenda){
        String dataLimite = data.get(Calendar.YEAR)+"-"+(data.get(Calendar.MONTH)+1)+"-"+data.get(Calendar.DATE);
        double ganhos = this.daoLancamento.somaLancamentosMensais(1, (data.get(Calendar.MONTH)+1), dataLimite, idRenda);
        return ganhos;
    }
    public double getSaldoFinalHome(int idRenda){
        double sobrou = getGanhosHome(idRenda) + getGastosHome(idRenda);
        return sobrou;
    }
    
    public double getSaldoInicialHome(int idRenda){
        double saldoInicial = 0;
        double saldoFinal = getSaldoFinalHome(idRenda);
        if(saldoFinal < 0){
            saldoFinal = (saldoFinal * -1);
            double gastos  = getGastosHome(idRenda);
            saldoInicial = gastos + saldoFinal;
        }
        double ganhos  = getGanhosHome(idRenda) * -1;
        saldoInicial   = saldoInicial - ganhos;
        return saldoInicial;
    }
    
    public double CalculoDosLancamentosHome(int idRenda){        
        double sobrou = 0;
        Calendar hoje = Calendar.getInstance();
        String dataLimite = hoje.get(Calendar.YEAR)+"-"+(hoje.get(Calendar.MONTH)+1)+"-"+hoje.get(Calendar.DATE);
        double gastos = this.daoLancamento.somaLancamentosMensais(0, (hoje.get(Calendar.MONTH)+1), dataLimite, idRenda);
        double ganhos = this.daoLancamento.somaLancamentosMensais(1, (hoje.get(Calendar.MONTH)+1), dataLimite, idRenda);
        return sobrou = ganhos + gastos;
    }
   
    public void buscaLancamentos(){
        int idRenda = 1;
        ArrayList<Lancamento> lancamentos = new ArrayList<>();
        Lancamento mov = new Lancamento();
        
        lancamentos = this.daoLancamento.buscaLancamentos(idRenda);
        
        String teste = "";
	Iterator<Lancamento> it = lancamentos.iterator();
	while(it.hasNext()){
            mov = (Lancamento) it.next();
            teste = ""
	    +  "\nDescricao: "+mov.getDescricao()
            +  "\nTipo: "+mov.getTipo()
            +  "\nValor: "+mov.getValor()
            +  "\nCategoria: "+ mov.getCategoria()
            +  "\nData: "+mov.getData()
            +  "\nForma de pagamento: "+mov.getForma_pagamento()
            +"";
            JOptionPane.showMessageDialog(null, ""+teste);
                 
	}
    }
    
}