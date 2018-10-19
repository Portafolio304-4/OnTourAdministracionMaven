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
public class Transporte {
    private int idTransporte;
    private String origenTransporte;
    private String destinoTransporte;
    private Date fechaSalidaTransporte;
    private Date fechaLlegadaTransporte;
    private String nombreCompaniaTransporte;
    private TipoTransporte idTipoTransporte;

    public int getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public String getOrigenTransporte() {
        return origenTransporte;
    }

    public void setOrigenTransporte(String origenTransporte) {
        this.origenTransporte = origenTransporte;
    }

    public String getDestinoTransporte() {
        return destinoTransporte;
    }

    public void setDestinoTransporte(String destinoTransporte) {
        this.destinoTransporte = destinoTransporte;
    }

    public Date getFechaSalidaTransporte() {
        return fechaSalidaTransporte;
    }

    public void setFechaSalidaTransporte(Date fechaSalidaTransporte) {
        this.fechaSalidaTransporte = fechaSalidaTransporte;
    }

    public Date getFechaLlegadaTransporte() {
        return fechaLlegadaTransporte;
    }

    public void setFechaLlegadaTransporte(Date fechaLlegadaTransporte) {
        this.fechaLlegadaTransporte = fechaLlegadaTransporte;
    }

    public String getNombreCompaniaTransporte() {
        return nombreCompaniaTransporte;
    }

    public void setNombreCompaniaTransporte(String nombreCompaniaTransporte) {
        this.nombreCompaniaTransporte = nombreCompaniaTransporte;
    }

    public TipoTransporte getIdTipoTransporte() {
        return idTipoTransporte;
    }

    public void setIdTipoTransporte(TipoTransporte idTipoTransporte) {
        this.idTipoTransporte = idTipoTransporte;
    }
    
    
}
