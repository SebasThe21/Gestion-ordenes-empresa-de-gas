
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.DAOinter.DAOTrabajo;
import com.arcos.gestion_ordenes.Logica.Material;
import com.arcos.gestion_ordenes.Logica.Trabajos;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOTrabajosImpl extends Conexion implements DAOTrabajo{

    @Override
    public void guardar(Trabajos t) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("INSERT INTO trabajos (nombre_trabajo,costo_unidad)VALUES(?,?)");
            st.setString(1, t.getNombre_trabajos());
            st.setDouble(2, t.getCosto_unidad());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void actualizar(Trabajos t) throws Exception {
            
            try{
                this.conectar();
                PreparedStatement st=con.prepareStatement("UPDATE trabajos SET nombre_trabajo=?,costo_unidad=? WHERE id_trabajos=?");
                st.setString(1, t.getNombre_trabajos());
                st.setDouble(2, t.getCosto_unidad());
                st.setInt(3, t.getId_trabajos());
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
            PreparedStatement st=con.prepareStatement("DELETE FROM trabajos WHERE id_trabajos=?");
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
    public List<Trabajos> traerTodos() throws Exception {
        List<Trabajos>lTrabajos=null;
        try{
            this.conectar();
            PreparedStatement st=con.prepareStatement("SELECT * FROM trabajos");
            lTrabajos=new ArrayList();
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                Trabajos t=new Trabajos();
                t.setId_trabajos(rs.getInt("id_trabajos"));
                t.setNombre_trabajos(rs.getString("nombre_trabajo"));
                t.setCosto_unidad(rs.getDouble("costo_unidad"));
                lTrabajos.add(t);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lTrabajos;
    }
    

    @Override
    public Trabajos traerUno(int id) throws Exception {
        Trabajos t = null;
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("SELECT * FROM trabajos WHERE id_trabajos=?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                 t = new Trabajos();
                t.setId_trabajos(rs.getInt("id_trabajos"));
                t.setNombre_trabajos(rs.getString("nombre_trabajo"));
                t.setCosto_unidad(rs.getDouble("costo_unidad"));            
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return t;

    }

    @Override
    public List<Trabajos> BuscarTrabajos(String nombre) throws Exception {
       List<Trabajos> trabajos=null;
         try{
             this.conectar();
             PreparedStatement st=con.prepareStatement("SELECT * FROM trabajos WHERE nombre_trabajo LIKE ?");
             st.setString(1, "%" +nombre + "%");
             trabajos=new ArrayList();
             ResultSet rs=st.executeQuery();
             
             while(rs.next()){
                 Trabajos t=new Trabajos();  
                 t.setId_trabajos(rs.getInt("id_trabajos"));
                 t.setNombre_trabajos(rs.getString("nombre_trabajo"));
                 t.setCosto_unidad(rs.getDouble("costo_unidad"));
                trabajos.add(t);
             }
             rs.close();
             st.close();
         }catch(Exception e){
             throw e;
         }finally{
             this.cerrar();
         }
         return trabajos;
    }
    
}
