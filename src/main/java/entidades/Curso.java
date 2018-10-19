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
public class Curso {
    private int idCurso;
    private String letraCurso;
    private Organizacion idOrganizacion;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getLetraCurso() {
        return letraCurso;
    }

    public void setLetraCurso(String letraCurso) {
        this.letraCurso = letraCurso;
    }

    public Organizacion getIdOrganizacion() {
        return idOrganizacion;
    }

    public void setIdOrganizacion(Organizacion idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }
}
