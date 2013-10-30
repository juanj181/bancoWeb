/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb.presentacion;

import fpmislata.com.bancoWeb.negocio.EntidadBancaria;
import fpmislata.com.bancoWeb.datos.EntidadBancariaDAO;
import fpmislata.com.bancoWeb.datos.EntidadBancariaDAOImplJDBC;
import fpmislata.com.bancoWeb.negocio.TipoEntidadBancaria;
import java.sql.SQLException;

/**
 *
 * @author alumno
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        EntidadBancariaDAO entidadBancariaDAO=new EntidadBancariaDAOImplJDBC();
        
        entidadBancariaDAO.read(1);


        EntidadBancaria entidadBancaria1 = new EntidadBancaria(99, "025", "CajaMar", "456789CC", TipoEntidadBancaria.COOPERATIVASCREDITO);
        entidadBancariaDAO.insert(entidadBancaria1);

        EntidadBancaria entidadBancaria2 = new EntidadBancaria(52, "121", "CajaBarranco", "923424C", TipoEntidadBancaria.ESTABLECIMIENTOSFINANCIEROS);
        entidadBancariaDAO.update(entidadBancaria2);

    }
}
