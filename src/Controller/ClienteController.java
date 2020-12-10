/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DAOCliente;

/**
 *
 * @author Saimeen
 */
public class ClienteController {
    
    private DAOCliente daoCliente;

    public ClienteController(){
        this.daoCliente = new DAOCliente();
    }
    
    public boolean insereCliente(String nome, String senha, String email) {
        return this.daoCliente.salvaCliente(nome, senha, email);
    }
    
    public int getID_Cliente(String nome, String senha){
        return this.daoCliente.getID_Cliente(nome, senha);
    }
    

    
}
