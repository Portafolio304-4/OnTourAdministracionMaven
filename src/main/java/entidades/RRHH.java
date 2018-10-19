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
public class RRHH {
    private int rutRRHH;
    private String rutDvRRHH;
    private String nombreRRHH;
    private String apPatRRHH;
    private String apMatRRHH;
    private String emailRRHH;
    private int telefonoRRHH;
    private String direccionRRHH;
    private CargoRRHH idCargoRRHH;
    private Comuna idComuna;
    private Sucursal idSucursal;

    public int getRutRRHH() {
        return rutRRHH;
    }

    public void setRutRRHH(int rutRRHH) {
        this.rutRRHH = rutRRHH;
    }

    public String getRutDvRRHH() {
        return rutDvRRHH;
    }

    public void setRutDvRRHH(String rutDvRRHH) {
        this.rutDvRRHH = rutDvRRHH;
    }

    public String getNombreRRHH() {
        return nombreRRHH;
    }

    public void setNombreRRHH(String nombreRRHH) {
        this.nombreRRHH = nombreRRHH;
    }

    public String getApPatRRHH() {
        return apPatRRHH;
    }

    public void setApPatRRHH(String apPatRRHH) {
        this.apPatRRHH = apPatRRHH;
    }

    public String getApMatRRHH() {
        return apMatRRHH;
    }

    public void setApMatRRHH(String apMatRRHH) {
        this.apMatRRHH = apMatRRHH;
    }

    public String getEmailRRHH() {
        return emailRRHH;
    }

    public void setEmailRRHH(String emailRRHH) {
        this.emailRRHH = emailRRHH;
    }

    public int getTelefonoRRHH() {
        return telefonoRRHH;
    }

    public void setTelefonoRRHH(int telefonoRRHH) {
        this.telefonoRRHH = telefonoRRHH;
    }

    public String getDireccionRRHH() {
        return direccionRRHH;
    }

    public void setDireccionRRHH(String direccionRRHH) {
        this.direccionRRHH = direccionRRHH;
    }

    public CargoRRHH getIdCargoRRHH() {
        return idCargoRRHH;
    }

    public void setIdCargoRRHH(CargoRRHH idCargoRRHH) {
        this.idCargoRRHH = idCargoRRHH;
    }

    public Comuna getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(Comuna idComuna) {
        this.idComuna = idComuna;
    }

    public Sucursal getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(Sucursal idSucursal) {
        this.idSucursal = idSucursal;
    }
}
