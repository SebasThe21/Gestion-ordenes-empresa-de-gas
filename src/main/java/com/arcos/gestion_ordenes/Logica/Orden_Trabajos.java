
package com.arcos.gestion_ordenes.Logica;

public class Orden_Trabajos {
    
    private int id_orden_trabajos;
    private int cantidad_trabajos;
    private int id_trabajos;
    private int id_orden;

    public Orden_Trabajos() {
    }

    public Orden_Trabajos(int id_orden_trabajos, int cantidad_trabajos, int id_trabajos, int id_orden) {
        this.id_orden_trabajos = id_orden_trabajos;
        this.cantidad_trabajos = cantidad_trabajos;
        this.id_trabajos = id_trabajos;
        this.id_orden = id_orden;
    }

    public int getId_orden_trabajos() {
        return id_orden_trabajos;
    }

    public void setId_orden_trabajos(int id_orden_trabajos) {
        this.id_orden_trabajos = id_orden_trabajos;
    }

    public int getCantidad_trabajos() {
        return cantidad_trabajos;
    }

    public void setCantidad_trabajos(int cantidad_trabajos) {
        this.cantidad_trabajos = cantidad_trabajos;
    }

    public int getId_trabajos() {
        return id_trabajos;
    }

    public void setId_trabajos(int id_trabajos) {
        this.id_trabajos = id_trabajos;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }
    
    
}
