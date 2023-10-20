
package com.arcos.gestion_ordenes.Logica;


public class itemMaterial {
     private Material material;
    private int cantidad;

    public itemMaterial() {
    }

    
    public itemMaterial(Material material, int cantidad) {
        this.material = material;
        this.cantidad = cantidad;
    }

    public Material getMaterial() {
        return material;
    }

    public int getCantidad() {
        return cantidad;
    }
}
