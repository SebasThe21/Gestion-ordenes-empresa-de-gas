
package com.arcos.gestion_ordenes.Logica;


public class Material {
    
    private  int id_material;
    private String nombre_material;
    private double coste_material;
    private int unidades_disponibles;

    public Material() {
    }

    public Material(int id_material, String nombre_material, double coste_material, int unidades_disponibles) {
        this.id_material = id_material;
        this.nombre_material = nombre_material;
        this.coste_material = coste_material;
        this.unidades_disponibles = unidades_disponibles;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public double getCoste_material() {
        return coste_material;
    }

    public void setCoste_material(double coste_material) {
        this.coste_material = coste_material;
    }

    public int getUnidades_disponibles() {
        return unidades_disponibles;
    }

    public void setUnidades_disponibles(int unidades_disponibles) {
        this.unidades_disponibles = unidades_disponibles;
    }
    
    
}
