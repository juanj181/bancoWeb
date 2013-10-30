/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jj
 */
public class ConnectionFactoryImplJDBC implements ConnectionFactory {
    
    
    
    
    @Override
    public Connection getConnection() {
        
        try {       
       Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
           // Logger.getLogger(ConnectionFactoryImplJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco","banco","banco");
        } catch (SQLException ex) {
         //  Logger.getLogger(ConnectionFactoryImplJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
return conexion;
    }        
    
}
