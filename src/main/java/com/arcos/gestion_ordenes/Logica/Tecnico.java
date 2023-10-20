
package com.arcos.gestion_ordenes.Logica;


public class Tecnico extends Persona {
    
    private int id_tecnico;
    private int id_zona;

    public Tecnico() {
    }

    public Tecnico(int id_tecnico, int id_zona) {
        this.id_tecnico = id_tecnico;
        this.id_zona = id_zona;
    }

    public Tecnico(int id_tecnico, int id_zona, String nombre, String apellido, String s_apellido, String cedula, String telefono) {
        super(nombre, apellido, s_apellido, cedula, telefono);
        this.id_tecnico = id_tecnico;
        this.id_zona = id_zona;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }
    
    
    
}
