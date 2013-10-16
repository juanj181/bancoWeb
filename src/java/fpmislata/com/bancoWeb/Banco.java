/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb;

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

        EntidadBancariaDAO.read(1);


        EntidadBancaria entidadBancaria1 = new EntidadBancaria(99, "025", "CajaMar", "456789CC", TipoEntidadBancaria.COOPERATIVASCREDITO);
        EntidadBancariaDAO.insert(entidadBancaria1);

        EntidadBancaria entidadBancaria2 = new EntidadBancaria(52, "121", "CajaBarranco", "923424C", TipoEntidadBancaria.ESTABLECIMIENTOSFINANCIEROS);
        EntidadBancariaDAO.update(entidadBancaria2);

    }
}
