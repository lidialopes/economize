/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Lancamento;
import com.mysql.fabric.xmlrpc.base.Data;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Saimeen
 */
public class DAOLancamento {
    
    public void salvaLancamento(String descricao, int tipo, double valor, String categoria,
            String data, int parcela, String f_pagamento, int idRenda) {  
        try{
            Connection conn = Conexao.getConnection();            
            String sql = 
                    "INSERT INTO `lancamento` (`Descricao`, `Tipo`, `Valor`, `Categoria`, `Data`, `Parcela`, `Forma_Pagamento`, `idRenda`)"             
            		+ " VALUES("
			+ "'" + descricao  + "',"
			+ "'" + tipo + "',"
                        + "'" + valor + "',"
                        + "'" + categoria + "',"
                        + "'" + data + "',"
                        + "'" + parcela + "',"
                        + "'" + f_pagamento + "',"
                        + "'" + idRenda + "'"
			+ ");";
					
            PreparedStatement Statement = conn.prepareStatement(sql); 
            Statement.executeUpdate();
        }	
	catch(SQLException e){			
            e.printStackTrace();
	} 
    }
    
    public ArrayList<Lancamento> buscaLancamentos(int idRenda){
        ArrayList<Lancamento> dados = new ArrayList<Lancamento>();
        Statement query;
	Connection conn           = null;
        Lancamento lancamento = null;
	int idLancamento        = 0;
        double valor              = 0;
        String categoria          = "";
        String descricao          = "";
        int tipo                  = 0;
        Date dataMySQL            = null;
        int parcela               = 0;
        String f_pagamento        = "";
        String data               = "";
	
	try {
            conn = Conexao.getConnection();
	    query = (Statement) conn.createStatement();
	    	  
	    String sql = 
            "SELECT * FROM economize.lancamento where idRenda = '"+idRenda+"';";
	    	     
	    ResultSet rs = query.executeQuery(sql);  
		         
	    while(rs.next()){
                idLancamento  = rs.getInt("lancamento.idLancamento");	        		
	       	descricao        = rs.getString("lancamento.Descricao"); 
	       	tipo             = rs.getInt("lancamento.Tipo");
	       	valor            = rs.getDouble("lancamento.Valor");
	       	categoria        = rs.getString("lancamento.Categoria");
	       	dataMySQL        = rs.getDate("lancamento.Data");
	       	parcela          = rs.getInt("lancamento.Parcela");
	       	f_pagamento      = rs.getString("lancamento.Forma_Pagamento");
                idRenda          = rs.getInt("lancamento.idRenda");
                
	       	data = convertDataMySQLparaString(dataMySQL);
                String tipoLancamento = defineTipoLancamento(tipo);
                lancamento = new Lancamento(idLancamento, descricao, tipoLancamento, valor, categoria, data, parcela, f_pagamento, idRenda);
                dados.add(lancamento);
	    }
	    conn.close();
	} 
        catch (SQLException e) {  
            e.printStackTrace();   
	}
    return dados;
    }
    
    public double somaLancamentosMensais(int tipo, int mes, String dataLimite, int idRenda){
        Statement query;
	Connection conn = null;
        double valorTotal = 0;
              
	try {
            conn = Conexao.getConnection();
	    query = (Statement) conn.createStatement();
	    	  
	    String sql = 
            "SELECT sum(Valor) FROM economize.lancamento where tipo = "+tipo+" and data between '2019-"+mes+"-01' and '2019-"+mes+"-31' and idRenda = "+idRenda+";";	    	     
	    ResultSet rs = query.executeQuery(sql);  
		         
	    while(rs.next()){
	       	valorTotal = rs.getDouble("sum(Valor)");
	    }
	    conn.close();
	} 
        catch (SQLException e) {  
            e.printStackTrace();   
	}
        return valorTotal;
    }
    
     public ArrayList<Lancamento> filtraLancamentos(int mes, int ano, int tipo, int idRenda){
        ArrayList<Lancamento> dados = new ArrayList<Lancamento>();
        Statement query;
	Connection conn           = null;
        Lancamento lancamento     = null;
	int idLancamento          = 0;
        double valor              = 0;
        String categoria          = "";
        String descricao          = "";
        Date dataMySQL            = null;
        int parcela               = 0;
        String f_pagamento        = "";
        String data               = "";
	
	try {
            conn = Conexao.getConnection();
	    query = (Statement) conn.createStatement();
	    ResultSet rs;	  
	    String sql = 
            "SELECT * FROM economize.lancamento where Data between '"+ano+"-"+mes+"-01' and '"+ano+"-"+mes+"-31' and idRenda ="+idRenda+" and tipo ="+tipo+";";
            String sql2 =
            "SELECT * FROM economize.lancamento where Data between '"+ano+"-"+mes+"-01' and '"+ano+"-"+mes+"-31' and idRenda ="+idRenda+";";
	    
            if(tipo == 2){	     
                rs = query.executeQuery(sql2);  
            }else{
                rs = query.executeQuery(sql); 
            }
	    while(rs.next()){
                idLancamento     = rs.getInt("lancamento.idLancamento");	        		
	       	descricao        = rs.getString("lancamento.Descricao"); 
	       	tipo             = rs.getInt("lancamento.Tipo");
	       	valor            = rs.getDouble("lancamento.Valor");
	       	categoria        = rs.getString("lancamento.Categoria");
	       	dataMySQL        = rs.getDate("lancamento.Data");
	       	parcela          = rs.getInt("lancamento.Parcela");
	       	f_pagamento      = rs.getString("lancamento.Forma_Pagamento");
                idRenda          = rs.getInt("lancamento.idRenda");
                
	       	data = convertDataMySQLparaString(dataMySQL);
                String tipoLancamento = defineTipoLancamento(tipo);
                lancamento = new Lancamento(idLancamento, descricao, tipoLancamento, valor, categoria, data, parcela, f_pagamento, idRenda);
                dados.add(lancamento);
	    }
	    conn.close();
	} 
        catch (SQLException e) {  
            e.printStackTrace();   
	}
    return dados;
    }
    
    

    public Lancamento atualizaLancamento(int id) {
        Statement query;
	Connection conn           = null;
        Lancamento lancamento     = new Lancamento();
	int idLancamento        = 0;
        double valor              = 0;
        String categoria          = "";
        String descricao          = "";
        int tipo                  = 0;
        Date dataMySQL            = null;
        int parcela               = 0;
        String f_pagamento        = "";
        String data               = "";
        int idRenda               = 0;
	
	try {
            conn = Conexao.getConnection();
	    query = (Statement) conn.createStatement();
	    	  
	    String sql = 
            "SELECT * FROM economize.lancamento where idLancamento = '"+id+"';";
	    	     
	    ResultSet rs = query.executeQuery(sql);  
		         
	    while(rs.next()){
                idLancamento     = rs.getInt("lancamento.idLancamento");
	       	descricao        = rs.getString("lancamento.Descricao"); 
	       	tipo             = rs.getInt("lancamento.Tipo");
	       	valor            = rs.getDouble("lancamento.Valor");
	       	categoria        = rs.getString("lancamento.Categoria");
	       	dataMySQL        = rs.getDate("lancamento.Data");
	       	parcela          = rs.getInt("lancamento.Parcela");
	       	f_pagamento      = rs.getString("lancamento.Forma_Pagamento");
                idRenda          = rs.getInt("lancamento.idRenda");	
                
                String tipoLancamento = defineTipoLancamento(tipo);
                String dataLancamento = convertDataMySQLparaString(dataMySQL);              
	       	lancamento            = new Lancamento(idLancamento, descricao, tipoLancamento, valor, categoria, dataLancamento, parcela, f_pagamento, idRenda);
	    }
	    conn.close();
	} 
        catch (SQLException e) {  
            e.printStackTrace();   
	}
    return lancamento;

    }

    private String convertDataMySQLparaString(Date dataMySQL){
        String data;
        data = dataMySQL.toString();
        String dia = data.substring(8); 
        String mes = data.substring(5, 7); 
        String ano = data.substring(0, 4);
        String dataLancamento = dia+"/"+mes+"/"+ano;
        return dataLancamento;
    }

    private String defineTipoLancamento(int tipo) {
        if(tipo == 0)
            return "GASTO";
        return "GANHO";
    }
    
}
