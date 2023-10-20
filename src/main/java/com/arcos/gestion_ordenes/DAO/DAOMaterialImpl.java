
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.DAOinter.DAOMaterial;
import com.arcos.gestion_ordenes.Logica.Material;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOMaterialImpl extends Conexion implements DAOMaterial {

    @Override
    public void guardar(Material t) throws Exception {
          try{
              this.conectar();
              PreparedStatement st=con.prepareStatement("INSERT INTO materiales (nombre_material,costo_unidad,cantidad_disponible)VALUES(?,?,?)");
              st.setString(1, t.getNombre_material());
              st.setDouble(2, t.getCoste_material());
              st.setInt(3, t.getUnidades_disponibles());
              st.executeUpdate();
              st.close();
          }catch(Exception e){
              throw e;
          }finally{
              this.cerrar();
          }
    }

    @Override
    public void actualizar(Material t) throws Exception {
        
        try{
            this.conectar();
           PreparedStatement st=con.prepareStatement("UPDATE materiales SET nombre_material=?,costo_unidad=?,cantidad_disponible=? WHERE id_material=?");
           st.setString(1, t.getNombre_material());
           st.setDouble(2, t.getCoste_material());
           st.setInt(3, t.getUnidades_disponibles());
           st.setInt(4, t.getId_material());
           st.executeUpdate();
           st.close();
       }catch(Exception e){
           throw e;
       }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(int id) throws Exception {
        try{
            this.conectar();
            PreparedStatement st=con.prepareStatement("DELETE FROM materiales WHERE id_material=?");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }

    }

    @Override
    public List<Material> traerTodos() throws Exception {
         List<Material>lMaterial=null;
         
         try{
             this.conectar();
             PreparedStatement st=con.prepareStatement("SELECT * FROM materiales");
             lMaterial=new ArrayList();
             ResultSet rs=st.executeQuery();
             
             while(rs.next()){
                 Material m=new Material();
                 m.setId_material(rs.getInt("id_material"));
                 m.setNombre_material(rs.getString("nombre_material"));
                 m.setCoste_material(rs.getDouble("costo_unidad"));
                 m.setUnidades_disponibles(rs.getInt("cantidad_disponible"));
                 lMaterial.add(m);
             }
             rs.close();
             st.close();
         }catch(Exception e){
             throw e;
         }finally{
             this.cerrar();
         }
         return lMaterial;
    }

    @Override
    public Material traerUno(int id) throws Exception {
        Material m=null;    
         try{
             this.conectar();
             PreparedStatement st=con.prepareStatement("SELECT * FROM materiales WHERE id_material=?");
             st.setInt(1, id);
            
             ResultSet rs=st.executeQuery();
             
             while(rs.next()){
                 m=new Material();
                 m.setId_material(rs.getInt("id_material"));
                 m.setNombre_material(rs.getString("nombre_material"));
                 m.setCoste_material(rs.getDouble("costo_unidad"));
                 m.setUnidades_disponibles(rs.getInt("cantidad_disponible"));
                
             }
             rs.close();
             st.close();
         }catch(Exception e){
             throw e;
         }finally{
             this.cerrar();
         }
         return m;
    }

    @Override
    public List<Material> buscarMateriales(String nombre) throws Exception {
         
         List<Material> mate=null;
         try{
             this.conectar();
             PreparedStatement st=con.prepareStatement("SELECT * FROM materiales WHERE nombre_material LIKE ?");
             st.setString(1, "%" +nombre + "%");
             mate=new ArrayList();
             ResultSet rs=st.executeQuery();
             
             while(rs.next()){
                 Material m=new Material();    
                 m=new Material();
                 m.setId_material(rs.getInt("id_material"));
                 m.setNombre_material(rs.getString("nombre_material"));
                 m.setCoste_material(rs.getDouble("costo_unidad"));
                 m.setUnidades_disponibles(rs.getInt("cantidad_disponible"));
                mate.add(m);
             }
             rs.close();
             st.close();
         }catch(Exception e){
             throw e;
         }finally{
             this.cerrar();
         }
         return mate;
    }
    
    
    
}
