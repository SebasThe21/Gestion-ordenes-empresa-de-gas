
package com.arcos.gestion_ordenes.Logica;


public class SolicitudOrden {
    
    private int id_solicitud;
    private String razon_trabajo;
    private String cedula_cliente;

    public SolicitudOrden() {
    }

    public SolicitudOrden(int id_solicitud, String razon_trabajo, String cedula_cliente) {
        this.id_solicitud = id_solicitud;
        this.razon_trabajo = razon_trabajo;
        this.cedula_cliente = cedula_cliente;
    }

  

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getRazon_trabajo() {
        return razon_trabajo;
    }

    public void setRazon_trabajo(String razon_trabajo) {
        this.razon_trabajo = razon_trabajo;
    }

    public String getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(String cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }





 
    
    
    
}
