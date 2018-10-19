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
public class PaqueteDetalle {
    private int idPaqueteDetalle;
    private int montoTotalPaquete;
    private int deudaPaquete;
    private int montoPagadoPaquete;
    private Pago idPago;
    private Apoderado rutApoderado;
    private PaqueteViaje idPaqueteViaje;

    public int getIdPaqueteDetalle() {
        return idPaqueteDetalle;
    }

    public void setIdPaqueteDetalle(int idPaqueteDetalle) {
        this.idPaqueteDetalle = idPaqueteDetalle;
    }

    public int getMontoTotalPaquete() {
        return montoTotalPaquete;
    }

    public void setMontoTotalPaquete(int montoTotalPaquete) {
        this.montoTotalPaquete = montoTotalPaquete;
    }

    public int getDeudaPaquete() {
        return deudaPaquete;
    }

    public void setDeudaPaquete(int deudaPaquete) {
        this.deudaPaquete = deudaPaquete;
    }

    public int getMontoPagadoPaquete() {
        return montoPagadoPaquete;
    }

    public void setMontoPagadoPaquete(int montoPagadoPaquete) {
        this.montoPagadoPaquete = montoPagadoPaquete;
    }

    public Pago getIdPago() {
        return idPago;
    }

    public void setIdPago(Pago idPago) {
        this.idPago = idPago;
    }

    public Apoderado getRutApoderado() {
        return rutApoderado;
    }

    public void setRutApoderado(Apoderado rutApoderado) {
        this.rutApoderado = rutApoderado;
    }

    public PaqueteViaje getIdPaqueteViaje() {
        return idPaqueteViaje;
    }

    public void setIdPaqueteViaje(PaqueteViaje idPaqueteViaje) {
        this.idPaqueteViaje = idPaqueteViaje;
    }
    
    
}
