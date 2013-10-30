/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb.datos;

import fpmislata.com.bancoWeb.negocio.EntidadBancaria;



/**
 *
 * @author alumno
 */
public interface EntidadBancariaDAO  {
    
 
     void read(int idEntidadBancaria);
     void delete(int idEntidadBancaria);
     void update(EntidadBancaria entidadBancaria);
     void insert(EntidadBancaria entidadBancaria);
    
    

}
