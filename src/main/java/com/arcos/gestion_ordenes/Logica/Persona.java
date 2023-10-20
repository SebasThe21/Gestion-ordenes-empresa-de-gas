
package com.arcos.gestion_ordenes.Logica;


public abstract class  Persona {
    private String nombre;
    private String apellido;
    private String s_apellido;
    private String cedula;
    private String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String s_apellido, String cedula, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.s_apellido = s_apellido;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getS_apellido() {
        return s_apellido;
    }

    public void setS_apellido(String s_apellido) {
        this.s_apellido = s_apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
