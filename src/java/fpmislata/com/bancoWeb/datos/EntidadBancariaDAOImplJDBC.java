/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb.datos;

import fpmislata.com.bancoWeb.negocio.EntidadBancaria;
import fpmislata.com.bancoWeb.negocio.TipoEntidadBancaria;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class EntidadBancariaDAOImplJDBC implements EntidadBancariaDAO {

    public void read(int idEntidadBancaria) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
            String selectSQL = "SELECT * from entidadbancaria WHERE idEntidadBancaria=?";
            PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);
            preparedStatement.setInt(1, idEntidadBancaria);
            ResultSet rs = preparedStatement.executeQuery();


            System.out.println(rs.getRow());
            int idEntidad = -1;
            while (rs.next()) {
                idEntidad = rs.getInt("idEntidadBancaria");
                int CodigoEntidad = rs.getInt("codigoEntidad");
                String Nombre = rs.getString("nombre");
                String cif = rs.getString("cif");
                System.out.println("ID " + "CódigoEntidad  " + "NombreEntidad " + "Cif ");
                System.out.println(" " + idEntidad + "     " + CodigoEntidad + "     " + Nombre + "     " + cif);
            }
            if (idEntidad == -1) {
                System.out.println("null");
            }



            conn.close();
        } catch (Exception ex) {
            throw new RuntimeException("Errorrr");
        }

    }

    public void insert(EntidadBancaria entidadBancaria) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "banco", "banco");

            String insertSQL = "INSERT INTO EntidadBAncaria (idEntidadBancaria, codigoEntidad, nombre, cif, tipoEntidadBancaria ) VALUES (?,?,?,?,?)";


            PreparedStatement preparedStatement = conn.prepareStatement(insertSQL);
            preparedStatement.setInt(1, entidadBancaria.getIdEntidadBancaria());
            preparedStatement.setString(2, entidadBancaria.getCodigoEntidad());
            preparedStatement.setString(3, entidadBancaria.getNombre());
            preparedStatement.setString(4, entidadBancaria.getCif());
            preparedStatement.setString(5, entidadBancaria.getTipoEntidadBancaria().name());
            preparedStatement.executeUpdate();


            conn.close();


        } catch (Exception ex) {
            throw new RuntimeException("Errorrr");
        }
    }

    public void update(EntidadBancaria entidadBancaria) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "banco", "banco");


            String updateTableSQL = "UPDATE entidadbancaria SET nombre = ? WHERE identidad = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(updateTableSQL);
            preparedStatement.setString(1, "Santander");
            preparedStatement.setInt(2, entidadBancaria.getIdEntidadBancaria());
            preparedStatement.executeUpdate();

            conn.close();

        } catch (Exception ex) {
            throw new RuntimeException("Errorrr");
        }
    }

    public void delete(int entidadBancaria) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/banco", "banco", "banco");

            String deleteSQL = "DELETE FROM entidadbancaria WHERE idEntidadBancaria = ?";
            PreparedStatement preparedStatement3 = conn.prepareStatement(deleteSQL);
            preparedStatement3.setInt(1, entidadBancaria);
// execute delete SQL stetement
            preparedStatement3.executeUpdate();

            conn.close();
        } catch (Exception ex) {
            throw new RuntimeException("Errorrr");
        }
    }

    public static List<EntidadBancaria> findAll() throws ClassNotFoundException, SQLException {
        List<EntidadBancaria> listaEntidades = new ArrayList();
        EntidadBancaria entidadBancaria;

        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "banco");
           
        
        String selectSQL = "select * from EntidadBancaria;";
        PreparedStatement preparedStatement = conn.prepareStatement(selectSQL);

        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()) {
            Integer idEntidadBancaria = rs.getInt("idEntidadBancaria");
            String codigoEntidad = rs.getString("codigoEntidad");
            String nombre = rs.getString("nombre");
            String cif = rs.getString("cif");
            String tipoEntidadBancaria = rs.getString("tipoEntidadBancaria");

            entidadBancaria = new EntidadBancaria(idEntidadBancaria, codigoEntidad, nombre, cif, TipoEntidadBancaria.valueOf(tipoEntidadBancaria));
            listaEntidades.add(entidadBancaria);


        }




        conn.close();
        return listaEntidades;


    }

    List<EntidadBancaria> findByCodigo(String codigo) {
        return null;

    }
}
