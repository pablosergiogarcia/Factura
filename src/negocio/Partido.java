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
public class Partido {
    private String nombre_partido;
    private Provincia nombre_provincia;    

    public String getNombre_partido() {
        return nombre_partido;
    }

    public void setNombre_partido(String nombre_partido) {
        this.nombre_partido = nombre_partido;
    }

    public Provincia getNombre_provincia() {
        return nombre_provincia;
    }

    public void setNombre_provincia(Provincia nombre_provincia) {
        this.nombre_provincia = nombre_provincia;
    }
}
