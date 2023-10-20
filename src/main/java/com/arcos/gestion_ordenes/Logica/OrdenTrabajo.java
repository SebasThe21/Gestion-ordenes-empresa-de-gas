
package com.arcos.gestion_ordenes.Logica;

import java.util.Date;




public class OrdenTrabajo {
    private int id_orden;
    private Date fecha;
    private double total;
    private int id_solicitud;
    private int id_tecnico;
    private boolean estado;

    public OrdenTrabajo() {
    }
    
    
    public OrdenTrabajo(int id_orden, Date fecha, double total, int id_solicitud, int id_tecnico, boolean estado) {
        this.id_orden = id_orden;
        this.fecha = fecha;
        this.total = total;
        this.id_solicitud = id_solicitud;
        this.id_tecnico = id_tecnico;
        this.estado = estado;
    }

    public int getId_orden() {
        return id_orden;
    }

    public void setId_orden(int id_orden) {
        this.id_orden = id_orden;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
    
    
    
}
