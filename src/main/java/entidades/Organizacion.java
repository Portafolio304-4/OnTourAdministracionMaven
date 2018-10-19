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
public class Organizacion {
    private int idOrganizacion;
    private String nombreOrganizacion;
    private String direccionOrganizacion;
    private int telefono;
    private Comuna idComuna;
    private TipoOrganizacion idTipoOrganizacion;

    public int getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(int idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public String getNombreOrganizacion() {
        return nombreOrganizacion;
    }

    public void setNombreOrganizacion(String nombreOrganizacion) {
        this.nombreOrganizacion = nombreOrganizacion;
    }

    public String getDireccionOrganizacion() {
        return direccionOrganizacion;
    }

    public void setDireccionOrganizacion(String direccionOrganizacion) {
        this.direccionOrganizacion = direccionOrganizacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Comuna getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(Comuna idComuna) {
        this.idComuna = idComuna;
    }

    public TipoOrganizacion getIdTipoOrganizacion() {
        return idTipoOrganizacion;
    }

    public void setIdTipoOrganizacion(TipoOrganizacion idTipoOrganizacion) {
        this.idTipoOrganizacion = idTipoOrganizacion;
    }
    
    
}
