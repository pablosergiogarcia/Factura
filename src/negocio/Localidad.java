/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author HP Mini
 */
public class Localidad {
    private String nombre_localidad;
    private Partido nombre_partido;    

    public String getNombre_localidad() {
        return nombre_localidad;
    }

    public void setNombre_localidad(String nombre_localidad) {
        this.nombre_localidad = nombre_localidad;
    }

    public Partido getNombre_partido() {
        return nombre_partido;
    }

    public void setNombre_partido(Partido nombre_partido) {
        this.nombre_partido = nombre_partido;
    }
}
