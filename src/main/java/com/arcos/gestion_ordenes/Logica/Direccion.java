
package com.arcos.gestion_ordenes.Logica;


public class Direccion {
  
    private int id_direccion;
    private String tipo_via;
    private String numero_nombre_via;
    private String orientacion;
    private String placa;
    private int id_barrio;

    public Direccion() {
    }

    public Direccion(int id_direccion, String tipo_via, String numero_nombre_via, String orientacion, String placa, int id_barrio) {
        this.id_direccion = id_direccion;
        this.tipo_via = tipo_via;
        this.numero_nombre_via = numero_nombre_via;
        this.orientacion = orientacion;
        this.placa = placa;
        this.id_barrio = id_barrio;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getTipo_via() {
        return tipo_via;
    }

    public void setTipo_via(String tipo_via) {
        this.tipo_via = tipo_via;
    }

    public String getNumero_nombre_via() {
        return numero_nombre_via;
    }

    public void setNumero_nombre_via(String numero_nombre_via) {
        this.numero_nombre_via = numero_nombre_via;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getId_barrio() {
        return id_barrio;
    }

    public void setId_barrio(int id_barrio) {
        this.id_barrio = id_barrio;
    }
    
    
    
    
}
