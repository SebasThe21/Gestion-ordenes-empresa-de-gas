
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.Logica.Orden_Material;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOOrden_MaterialImpl extends Conexion implements DAO<Orden_Material>{

    @Override
    public void guardar(Orden_Material t) throws Exception {
        try{
            this.conectar();
            PreparedStatement st=con.prepareStatement("INSERT INTO orden_material(cantidad_material,id_orden,id_material)VALUES(?,?,?)");
            st.setInt(1, t.getCantidad_materia());
            st.setInt(2, t.getId_orden());
            st.setInt(3, t.getId_material());
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }

    }

    @Override
    public void actualizar(Orden_Material t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) throws Exception {
            try{
                this.conectar();
                PreparedStatement st=con.prepareStatement("DELETE FROM orden_material WHERE id_orden=?");
                st.setInt(1, id);
                st.executeUpdate();
                st.close();
                        
            }catch(Exception e){
                
            }finally{
                this.cerrar();
            }
    }

    @Override
    public List<Orden_Material> traerTodos() throws Exception {
           List<Orden_Material>lOrden_Material=null;     
           try{
               this.conectar();
               PreparedStatement st=con.prepareStatement("SELECT * FROM orden_material");
               lOrden_Material=new ArrayList();
               ResultSet rs=st.executeQuery();
               while(rs.next()){
                   Orden_Material oM=new Orden_Material();
                   oM.setId_orden_material(rs.getInt("id_orden_material"));
                   oM.setCantidad_materia(rs.getInt("cantidad_material"));
                   oM.setId_orden(rs.getInt("id_orden"));
                   oM.setId_material(rs.getInt("id_material"));
                   lOrden_Material.add(oM);
               }
               rs.close();
               st.close();
           }catch(Exception e){
               throw e;
           }finally{
               this.cerrar();
           }
           return lOrden_Material;
    }

    @Override
    public Orden_Material traerUno(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
