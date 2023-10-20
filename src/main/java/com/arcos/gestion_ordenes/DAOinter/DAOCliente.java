
package com.arcos.gestion_ordenes.DAOinter;

import com.arcos.gestion_ordenes.Logica.Cliente;

import java.util.List;

public interface DAOCliente {
    
    int guardar(Cliente cli) throws  Exception;
    void actualizar(Cliente cli) throws  Exception;
    void eliminar(int id_cli) throws  Exception;
    List<Cliente> traerTodos() throws  Exception;
    Cliente traerUno(int id) throws  Exception;
    List<Cliente>buscarClientes(String criterio) throws Exception;
    
}
