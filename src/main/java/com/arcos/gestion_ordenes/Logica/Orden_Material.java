
package com.arcos.gestion_ordenes.Logica;


public class Orden_Material {
    
    private int id_orden_material;
    private int cantidad_material;
    private int id_orden;
    private int id_material;

    public Orden_Material() {
    }

    public Orden_Material(int id_orden_material, int cantidad_materia, int id_orden, int id_material) {
        this.id_orden_material = id_orden_material;
        this.cantidad_material = cantidad_materia;
        this.id_orden = id_orden;
        this.id_material = id_material;
    }

    public int getId_orden_material() {
        return id_orden_material;
    }

    public void setId_orden_material(int id_orden_material) {
        this.id_orden_material = id_orden_material;
    }

    public int getCantidad_materia() {
        return cantidad_material;
    }

    public void setCantidad_materia(int cantidad_materia) {
        this.cantidad_material = cantidad_materia;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }
    
    
    
}
