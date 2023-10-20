
package com.arcos.gestion_ordenes.DAOinter;

import com.arcos.gestion_ordenes.Logica.OrdenTrabajo;
import java.util.Date;
import java.util.List;


public interface DAOOrden {
    int guardar(OrdenTrabajo oT) throws  Exception;
    void actualizar(OrdenTrabajo oT) throws  Exception;
    void eliminar(int id_oT) throws  Exception;
    List<OrdenTrabajo> traerTodos() throws  Exception;
    OrdenTrabajo traerUno(int id) throws  Exception;
       List<OrdenTrabajo> traerporFecha(Date fechaBuscar) throws  Exception;
}
