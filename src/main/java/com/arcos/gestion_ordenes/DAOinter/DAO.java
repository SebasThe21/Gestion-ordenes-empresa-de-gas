
package com.arcos.gestion_ordenes.DAOinter;

import java.util.List;

public interface DAO<T> {
    
    void guardar(T t) throws  Exception;
    void actualizar(T t) throws  Exception;
    void eliminar(int id) throws  Exception;
    List<T> traerTodos() throws  Exception;
    T traerUno(int id) throws  Exception;
    
}
