/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author rolan
 */
public class STDetalle {
    private int idStDetalle;
    private Actividad idActividad;
    private ServicioTuristico idServicioTuristico;
    private Transporte idTransporte;
    private Estadia idEstadia;
    private SeguroViaje idSeguroViaje;

    public int getIdStDetalle() {
        return idStDetalle;
    }

    public void setIdStDetalle(int idStDetalle) {
        this.idStDetalle = idStDetalle;
    }

    public Actividad getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(Actividad idActividad) {
        this.idActividad = idActividad;
    }

    public ServicioTuristico getIdServicioTuristico() {
        return idServicioTuristico;
    }

    public void setIdServicioTuristico(ServicioTuristico idServicioTuristico) {
        this.idServicioTuristico = idServicioTuristico;
    }

    public Transporte getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(Transporte idTransporte) {
        this.idTransporte = idTransporte;
    }

    public Estadia getIdEstadia() {
        return idEstadia;
    }

    public void setIdEstadia(Estadia idEstadia) {
        this.idEstadia = idEstadia;
    }

    public SeguroViaje getIdSeguroViaje() {
        return idSeguroViaje;
    }

    public void setIdSeguroViaje(SeguroViaje idSeguroViaje) {
        this.idSeguroViaje = idSeguroViaje;
    }
}
