/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Saimeen
 */
public class DAOMeta {
    
    public boolean salvaMeta(String categoria, double valor, String limite, int idCliente) {
        try{
            Connection conn = Conexao.getConnection();
            String sql = "INSERT INTO `economize`.`meta` (`Categoria`, `Valor`, `Limite`, `Cliente_idCliente`) "
                    + "VALUES ('"+categoria+"', '"+valor+"', '"+limite+"', '"+idCliente+"');";
					
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
