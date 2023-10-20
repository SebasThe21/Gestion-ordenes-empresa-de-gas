
package com.arcos.gestion_ordenes.DAOinter;

import com.arcos.gestion_ordenes.Logica.Trabajos;
import java.util.List;

public interface DAOTrabajo {
    
    void guardar(Trabajos t) throws  Exception;
    void actualizar(Trabajos t) throws  Exception;
    void eliminar(int id) throws  Exception;
    List<Trabajos> traerTodos() throws  Exception;
    Trabajos traerUno(int id) throws  Exception;
    List<Trabajos> BuscarTrabajos(String nombre) throws  Exception;
    
}
