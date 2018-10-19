/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author rolan
 */
public class ServicioTuristico {
    private int idServicioTuristico;
    private Date fechaInicio;
    private Date fechaFin;

    public int getIdServicioTuristico() {
        return idServicioTuristico;
    }

    public void setIdServicioTuristico(int idServicioTuristico) {
        this.idServicioTuristico = idServicioTuristico;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
