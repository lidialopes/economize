
package DAO;

import java.sql.*;

/*
MUDE A PORTA DA VARIÁVEL "porta" conforme a porta do seu XAMPP. EX:
public static String porta = "3306"
*/
public class Conexao {
    public static String user = "root";
    public static String password = "1234";
    public static String ip = "localhost";
    public static String porta = "3306";
    public static String name = "economize";
    
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://" +
                ip + ":" + porta + "/", user, password);
        
        conn.setCatalog(name);
        System.out.println("Conectado!");
        
        return conn;
    }
    
    public static void main(String[] args) {
        try {
            Connection conn = Conexao.getConnection();
            Statement query = conn.createStatement();
            String sql = "select * from cliente";
            ResultSet result = query.executeQuery(sql);
            
            if(result.next()) System.out.println(result.getString("Cliente.Nome"));
            else System.out.println("Cliente não encontrado.");
            
            conn.close();
        } catch (SQLException e) {
            System.out.println("Erro - Conexão com o banco de dados");
            e.printStackTrace();
        }
    }
}
