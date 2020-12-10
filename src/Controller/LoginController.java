
package Controller;
import DAO.DAOCliente;
import Model.Cliente;

public class LoginController {
    private static Cliente cliente;
    private static boolean logado;
    
    public LoginController() {
        this.cliente = null;
        this.logado = false;
    }
    
    public static boolean autenticaCliente(String login, String senha) {
        DAOCliente daoCliente = new DAOCliente();
        cliente = daoCliente.buscaCliente(login, senha);
        
        if(cliente != null) {
            setUsuario(cliente);
            LoginController.logado = true;
        }
        
        return isLogado();
    }
    
    public static boolean isLogado() {
        return logado;
    }
    
    public static void setUsuario(Cliente cliente) {
	LoginController.cliente = cliente;
    }
    
    public static Cliente getCliente() {
	return cliente;
    }
}
