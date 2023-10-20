
package com.arcos.gestion_ordenes.DAOinter;

import com.arcos.gestion_ordenes.Logica.Direccion;
import java.util.List;

public interface DAODireccion {
    
    int guardar(Direccion dir) throws  Exception;
    void actualizar(Direccion dir) throws  Exception;
    void eliminar(int id_dir) throws  Exception;
    List<Direccion> traerTodos() throws  Exception;
    Direccion traerUno(int id) throws  Exception;
    
}
