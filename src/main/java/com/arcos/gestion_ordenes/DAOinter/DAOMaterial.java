
package com.arcos.gestion_ordenes.DAOinter;

import com.arcos.gestion_ordenes.Logica.Material;
import java.util.List;

public interface DAOMaterial{
    
    void guardar(Material mate) throws  Exception;
    void actualizar(Material mate) throws  Exception;
    void eliminar(int id) throws  Exception;
    List<Material> traerTodos() throws  Exception;
    Material traerUno(int id) throws  Exception;
    List<Material> buscarMateriales(String nombre)throws Exception;
    
}
