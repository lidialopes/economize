
package DAO;

import Model.Cliente;
import java.sql.*;

public class DAOCliente {
    
    public DAOCliente() {
        
    }
    
    public int getID_Cliente(String login, String senhaCliente){
        int idCliente = -1;
        Connection conn;
        String sql = "";        
        try {
            conn = Conexao.getConnection();
            Statement query = conn.createStatement();
            sql = "select idCliente from cliente where (nome = '"+login+"' and senha = '"+senhaCliente+"');";            
            ResultSet resultado = query.executeQuery(sql);
            
            if(resultado.next()) {
                idCliente = resultado.getInt("cliente.idCliente");        
                conn.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }        
        return idCliente;
    }
    
    public Cliente buscaCliente(String login, String senhaCliente) {
        int idCliente;
        String nome;
        String senha;
        String email = "";
        
        Connection conn;
        String sql = "";
        Cliente cliente = null;
        
        try {
            conn = Conexao.getConnection();
            Statement query = conn.createStatement();
            sql = "select * " +
                    "from Cliente where nome = '" + login +
                    "' and senha = '" + senhaCliente + "'";
            
            ResultSet resultado = query.executeQuery(sql);
            
            if(resultado.next()) {
                idCliente = resultado.getInt("cliente.idCliente");
                nome = resultado.getString("cliente.nome");
                senha = resultado.getString("cliente.senha");
                email = resultado.getString("cliente.email");
                
                cliente = new Cliente(idCliente, nome, senha, email);
                conn.close();
            }
        } catch(SQLException e) {
            System.out.println("Erro ao buscar Cliente: " + sql);
            e.printStackTrace();
        }
        
        return cliente;
    }

    public boolean salvaCliente(String nome, String senhaCliente, String email) {
        try{
            Connection conn = Conexao.getConnection();
            String sql =  "INSERT INTO `cliente` (`nome`, `senha`, `email`)"
            		+ " VALUES("
			+ "'" + nome  + "',"
			+ "'" + senhaCliente + "',"
			+ "'" + email +"'"
			+ ");";
					
            PreparedStatement Statement = conn.prepareStatement(sql); 
            Statement.executeUpdate();
            return true;
        }	
	catch(SQLException e){			
            e.printStackTrace();
            return false;
	}        
    }
}
