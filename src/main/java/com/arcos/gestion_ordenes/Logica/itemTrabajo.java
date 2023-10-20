
package com.arcos.gestion_ordenes.Logica;

public class itemTrabajo {
    private Trabajos trabajos;
    private int cantidad;

    public itemTrabajo() {
    }
    
    

    public itemTrabajo(Trabajos trabajos, int cantidad) {
        this.trabajos = trabajos;
        this.cantidad = cantidad;
    }

    public Trabajos getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(Trabajos trabajos) {
        this.trabajos = trabajos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
