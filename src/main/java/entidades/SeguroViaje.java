/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;

/**
 *
 * @author rolan
 */
public class SeguroViaje {
    private int idSeguroViaje;
    private String nombreSeguro;
    private String nombreCompaniaSeguro;
    private Date fechaInicioSeguro;
    private Date fechaFinSeguro;
    private int valorSeguro;

    public int getIdSeguroViaje() {
        return idSeguroViaje;
    }

    public void setIdSeguroViaje(int idSeguroViaje) {
        this.idSeguroViaje = idSeguroViaje;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public String getNombreCompaniaSeguro() {
        return nombreCompaniaSeguro;
    }

    public void setNombreCompaniaSeguro(String nombreCompaniaSeguro) {
        this.nombreCompaniaSeguro = nombreCompaniaSeguro;
    }

    public Date getFechaInicioSeguro() {
        return fechaInicioSeguro;
    }

    public void setFechaInicioSeguro(Date fechaInicioSeguro) {
        this.fechaInicioSeguro = fechaInicioSeguro;
    }

    public Date getFechaFinSeguro() {
        return fechaFinSeguro;
    }

    public void setFechaFinSeguro(Date fechaFinSeguro) {
        this.fechaFinSeguro = fechaFinSeguro;
    }

    public int getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(int valorSeguro) {
        this.valorSeguro = valorSeguro;
    }
    
    
}
