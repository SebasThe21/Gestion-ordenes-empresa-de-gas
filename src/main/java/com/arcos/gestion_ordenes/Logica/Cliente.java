
package com.arcos.gestion_ordenes.Logica;


public class Cliente extends Persona {
    
    private int id_cliente;
    private  int id_direccion;

    public Cliente() {
    }

    public Cliente(int id_cliente, int id_direccion) {
        this.id_cliente = id_cliente;
        this.id_direccion = id_direccion;
    }

    public Cliente(int id_cliente, int id_direccion, String nombre, String apellido, String s_apellido, String cedula, String telefono) {
        super(nombre, apellido, s_apellido, cedula, telefono);
        this.id_cliente = id_cliente;
        this.id_direccion = id_direccion;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }
    
    
}
