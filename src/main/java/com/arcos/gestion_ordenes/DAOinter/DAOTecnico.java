
package com.arcos.gestion_ordenes.DAOinter;

import com.arcos.gestion_ordenes.Logica.Tecnico;
import java.util.List;

public interface DAOTecnico{
    
    void guardar(Tecnico t) throws  Exception;
    void actualizar(Tecnico t) throws  Exception;
    void eliminar(int id) throws  Exception;
    List<Tecnico> traerTodos() throws  Exception;
    Tecnico traerUno(int id) throws  Exception;
    List<Tecnico> buscar(String criterio) throws  Exception;
    
}
