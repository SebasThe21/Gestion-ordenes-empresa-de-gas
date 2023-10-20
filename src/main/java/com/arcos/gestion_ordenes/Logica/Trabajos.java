
package com.arcos.gestion_ordenes.Logica;


public class Trabajos {
    
    private int id_trabajos;
    private String nombre_trabajos;
    private double costo_unidad;

    public Trabajos() {
    }

    public Trabajos(int id_trabajos, String nombre_trabajos, double costo_unidad) {
        this.id_trabajos = id_trabajos;
        this.nombre_trabajos = nombre_trabajos;
        this.costo_unidad = costo_unidad;
    }

    public int getId_trabajos() {
        return id_trabajos;
    }

    public void setId_trabajos(int id_trabajos) {
        this.id_trabajos = id_trabajos;
    }

    public String getNombre_trabajos() {
        return nombre_trabajos;
    }

    public void setNombre_trabajos(String nombre_trabajos) {
        this.nombre_trabajos = nombre_trabajos;
    }

    public double getCosto_unidad() {
        return costo_unidad;
    }

    public void setCosto_unidad(double costo_unidad) {
        this.costo_unidad = costo_unidad;
    }
    
    
    
}
