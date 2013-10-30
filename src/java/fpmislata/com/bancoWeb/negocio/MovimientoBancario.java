/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fpmislata.com.bancoWeb.negocio;

import java.math.BigDecimal;

/**
 *
 * @author alumno
 */
public class MovimientoBancario {

    private int idMovimientoBancario;
    private String tipoMovimientoBancario;
    private BigDecimal importe;
    private String fecha;
    private BigDecimal saldoTotal;
    private String concepto;

    /**
     * @return the idMovimientoBancario
     */
    public int getIdMovimientoBancario() {
        return idMovimientoBancario;
    }

    /**
     * @param idMovimientoBancario the idMovimientoBancario to set
     */
    public void setIdMovimientoBancario(int idMovimientoBancario) {
        this.idMovimientoBancario = idMovimientoBancario;
    }

    /**
     * @return the tipoMovimientoBancario
     */
    public String getTipoMovimientoBancario() {
        return tipoMovimientoBancario;
    }

    /**
     * @param tipoMovimientoBancario the tipoMovimientoBancario to set
     */
    public void setTipoMovimientoBancario(String tipoMovimientoBancario) {
        this.tipoMovimientoBancario = tipoMovimientoBancario;
    }

    /**
     * @return the importe
     */
    public BigDecimal getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(BigDecimal importe) {
        this.importe = importe;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the saldoTotal
     */
    public BigDecimal getSaldoTotal() {
        return saldoTotal;
    }

    /**
     * @param saldoTotal the saldoTotal to set
     */
    public void setSaldoTotal(BigDecimal saldoTotal) {
        this.saldoTotal = saldoTotal;
    }

    /**
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
