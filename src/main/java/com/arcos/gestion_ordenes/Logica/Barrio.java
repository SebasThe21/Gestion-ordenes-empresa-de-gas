
package com.arcos.gestion_ordenes.Logica;


public class Barrio {
    private int id_barrio;
    private String numero_comuna;
    private String nombre_barrio;
    private int id_zona;

    public Barrio() {
    }

    public Barrio(int id_barrio, String numero_comuna, String nombre_barrio, int id_zona) {
        this.id_barrio = id_barrio;
        this.numero_comuna = numero_comuna;
        this.nombre_barrio = nombre_barrio;
        this.id_zona = id_zona;
    }

    public int getId_barrio() {
        return id_barrio;
    }

    public void setId_barrio(int id_barrio) {
        this.id_barrio = id_barrio;
    }

    public String getNumero_comuna() {
        return numero_comuna;
    }

    public void setNumero_comuna(String numero_comuna) {
        this.numero_comuna = numero_comuna;
    }

    public String getNombre_barrio() {
        return nombre_barrio;
    }

    public void setNombre_barrio(String nombre_barrio) {
        this.nombre_barrio = nombre_barrio;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }
    
    
    
}
