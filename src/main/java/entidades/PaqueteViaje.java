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
public class PaqueteViaje {
    private int idPaqueteViaje;
    private ServicioTuristico idServicioTuristico;
    private RRHH rutRRHH;
    private Apoderado rutApoderadoEncargado;

    public int getIdPaqueteViaje() {
        return idPaqueteViaje;
    }

    public void setIdPaqueteViaje(int idPaqueteViaje) {
        this.idPaqueteViaje = idPaqueteViaje;
    }

    public ServicioTuristico getIdServicioTuristico() {
        return idServicioTuristico;
    }

    public void setIdServicioTuristico(ServicioTuristico idServicioTuristico) {
        this.idServicioTuristico = idServicioTuristico;
    }

    public RRHH getRutRRHH() {
        return rutRRHH;
    }

    public void setRutRRHH(RRHH rutRRHH) {
        this.rutRRHH = rutRRHH;
    }

    public Apoderado getRutApoderadoEncargado() {
        return rutApoderadoEncargado;
    }

    public void setRutApoderadoEncargado(Apoderado rutApoderadoEncargado) {
        this.rutApoderadoEncargado = rutApoderadoEncargado;
    }
    
    
}
