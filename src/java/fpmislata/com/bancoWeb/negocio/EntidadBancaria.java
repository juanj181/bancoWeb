/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb.negocio;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class EntidadBancaria {

    private int idEntidadBancaria;
    private String codigoEntidad;
    private String nombre;
    private String cif;
    private TipoEntidadBancaria tipoEntidadBancaria;
    private List<SucursalBancaria> sucursales = new ArrayList<>();

    /**
     * @return the idEntidad
     */
    public EntidadBancaria(int idEntidadBancaria, String codigoEntidad, String nombre, String cif, TipoEntidadBancaria TipoEntidadBancaria) {
        this.cif = cif;
        this.codigoEntidad = codigoEntidad;
        this.idEntidadBancaria = idEntidadBancaria;
        this.nombre = nombre;
        this.tipoEntidadBancaria = TipoEntidadBancaria;


    }

    public int getIdEntidadBancaria() {
        return idEntidadBancaria;
    }

    /**
     * @param idEntidad the idEntidad to set
     */
    public void setIdEntidadBancaria(int idEntidad) {
        this.idEntidadBancaria = idEntidad;
    }

    /**
     * @return the codigoEntidad
     */
    public String getCodigoEntidad() {
        return codigoEntidad;
    }

    /**
     * @param codigoEntidad the codigoEntidad to set
     */
    public void setCodigoEntidad(String codigoEntidad) {
        this.codigoEntidad = codigoEntidad;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the CIF
     */
    public String getCif() {
        return cif;
    }

    /**
     * @param cif the CIF to set
     */
    public void setCIF(String cif) {
        this.cif = cif;
    }

    /**
     * @return the tipoEntidadBancaria
     */
    public TipoEntidadBancaria getTipoEntidadBancaria() {
        return tipoEntidadBancaria;
    }

    /**
     * @param tipoEntidadBancaria the tipoEntidadBancaria to set
     */
    public void setTipoEntidadBancaria(TipoEntidadBancaria tipoEntidadBancaria) {
        this.tipoEntidadBancaria = tipoEntidadBancaria;
    }

    /**
     * @return the sucursales
     */
    public List<SucursalBancaria> getSucursales() {
        return sucursales;
    }

    /**
     * @param sucursales the sucursales to set
     */
    public void setSucursales(List<SucursalBancaria> sucursales) {
        this.sucursales = sucursales;
    }
}
