/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb;

import java.sql.Connection;



/**
 *
 * @author alumno
 */
public interface ConnectionFactory{
  
    Connection getConnection();
    
}
