/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author alumno
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private Integer dni;
    private String calle;
    private Integer altura;
    private Localidad nombre_localidad;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(String nombre, String apellido, String calle) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calle = calle;
    }

    public Cliente(String nombre, String apellido, Integer dni, String calle, Integer altura, Localidad nombre_localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.calle = calle;
        this.altura = altura;
        this.nombre_localidad = nombre_localidad;
    }

    
    
    public Localidad getNombre_localidad() {
        return nombre_localidad;
    }

    public void setNombre_localidad(Localidad nombre_localidad) {
        this.nombre_localidad = nombre_localidad;
    }
            
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
