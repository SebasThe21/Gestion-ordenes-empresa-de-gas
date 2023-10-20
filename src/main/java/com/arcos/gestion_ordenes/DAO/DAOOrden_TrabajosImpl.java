
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.Logica.Orden_Trabajos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOOrden_TrabajosImpl extends Conexion implements DAO<Orden_Trabajos>{

    @Override
    public void guardar(Orden_Trabajos t) throws Exception {
         try{
             this.conectar();
             PreparedStatement st=con.prepareStatement("INSERT INTO orden_trabajos(cantidad_trabajo,id_trabajos,id_orden)VALUES(?,?,?)");
             st.setInt(1, t.getCantidad_trabajos());
             st.setInt(2, t.getId_trabajos());
             st.setInt(3, t.getId_orden());
             st.executeUpdate();
             st.close();
         }catch(Exception e){
             throw e;
         }finally{
             this.cerrar();
         }

    }

    @Override
    public void actualizar(Orden_Trabajos t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) throws Exception {
        try{
            this.conectar();
            PreparedStatement st=con.prepareStatement("DELETE FROM orden_trabajos WHERE id_orden=?");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            
        }finally{
            this.cerrar();
        }
    }

    @Override
    public List<Orden_Trabajos> traerTodos() throws Exception {
         List<Orden_Trabajos>oTs=null;
         try{
             this.conectar();
             PreparedStatement st=con.prepareStatement("SELECT * FROM orden_trabajos");
             ResultSet rs=st.executeQuery();
             oTs=new ArrayList<>();
             while(rs.next()){
                 Orden_Trabajos orden_trabajos=new Orden_Trabajos();
                 orden_trabajos.setId_orden_trabajos(rs.getInt("id_orden_trabajos"));
                 orden_trabajos.setId_orden(rs.getInt("id_orden"));
                 orden_trabajos.setCantidad_trabajos(rs.getInt("cantidad_trabajo"));
                 orden_trabajos.setId_trabajos(rs.getInt("id_trabajos"));
                 oTs.add(orden_trabajos);
             }
             rs.close();
             st.close();
         }catch(Exception e){
             throw e;
         }finally{
             this.cerrar();
         }
         return oTs;
    }

    @Override
    public Orden_Trabajos traerUno(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
