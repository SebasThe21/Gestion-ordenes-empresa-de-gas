
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.DAOinter.DAOTecnico;
import com.arcos.gestion_ordenes.Logica.Tecnico;
import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DAOTecnicosImpl extends Conexion implements DAOTecnico{

    @Override
    public void guardar(Tecnico t) throws  Exception{
       try{
           this.conectar();
           PreparedStatement st=con.prepareStatement("INSERT INTO tecnico(nombre,apellido,cedula,id_zona,s_apellido,telefono)VALUES(?,?,?,?,?,?) ");
           st.setString(1, t.getNombre());
           st.setString(2, t.getApellido());
           st.setString(3, t.getCedula());
           st.setInt(4, t.getId_zona());
           st.setString(5, t.getS_apellido());
           st.setString(6, t.getTelefono());
           st.executeUpdate();
           st.close();
       }catch(Exception e){
           throw e;
       }finally{
           this.cerrar();
       }
    }

    @Override
    public void actualizar(Tecnico t)throws  Exception {
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("UPDATE tecnico SET nombre=?,apellido=?,cedula=?,id_zona=?,s_apellido=?,telefono=? WHERE id_tecnico=?");
            st.setString(1, t.getNombre());
            st.setString(2, t.getApellido());
            st.setString(3, t.getCedula());
            st.setInt(4, t.getId_zona());
            st.setString(5, t.getS_apellido());
            st.setString(6, t.getTelefono());
            st.setInt(7, t.getId_tecnico());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void eliminar(int id)throws  Exception{
            try{
                this.conectar();
                PreparedStatement st=con.prepareStatement("DELETE FROM tecnico WHERE id_tecnico=?");
                st.setInt(1, id);
                st.executeUpdate();
                st.close();
            }catch(Exception e){
                
            }finally{
                this.cerrar();
            }
    }

    @Override
    public List<Tecnico> traerTodos()throws  Exception {
        List<Tecnico> ListTec=null;
     
      try{
           this.conectar();
          PreparedStatement st=con.prepareStatement("SELECT * FROM tecnico");
          ListTec=new ArrayList();
          ResultSet  rs=st.executeQuery();
          
          while(rs.next()){
              Tecnico te=new Tecnico();
              te.setId_tecnico(rs.getInt("id_tecnico"));
              te.setNombre(rs.getString("nombre"));
              te.setApellido(rs.getString("apellido"));
              te.setCedula(rs.getString("cedula"));
              te.setId_zona(rs.getInt("id_zona"));
              te.setS_apellido(rs.getString("s_apellido"));
              te.setTelefono(rs.getString("telefono"));
              ListTec.add(te);
          }
          rs.close();
          st.close();
      }catch(Exception e){
          throw e;
      }finally{
          this.cerrar();
      }
      return ListTec;
    }

    @Override
    public Tecnico traerUno(int id)throws  Exception {
            Tecnico te=null;
      try{
           this.conectar();
          PreparedStatement st=con.prepareStatement("SELECT * FROM tecnico WHERE id_tecnico=?");
          st.setInt(1, id);
         
          ResultSet  rs=st.executeQuery();
          
          while(rs.next()){
             te=new Tecnico();
              te.setId_tecnico(rs.getInt("id_tecnico"));
              te.setNombre(rs.getString("nombre"));
              te.setApellido(rs.getString("apellido"));
              te.setCedula(rs.getString("cedula"));
              te.setId_zona(rs.getInt("id_zona"));
              te.setS_apellido(rs.getString("s_apellido"));
              te.setTelefono(rs.getString("telefono"));
            
          }
          rs.close();
          st.close();
      }catch(Exception e){
          throw e;
      }finally{
          this.cerrar();
      }
      return te;         
    }

    @Override
    public List<Tecnico> buscar(String criterio) throws Exception {
       List<Tecnico> lT=null;
        try{
           this.conectar();
           PreparedStatement st=con.prepareStatement("SELECT * FROM tecnico WHERE nombre LIKE ? OR apellido LIKE ? OR cedula LIKE ?");
           st.setString(1, "%"+criterio+"%");
           st.setString(2, "%"+criterio+"%");
           st.setString(3, "%"+criterio+"%");
           lT=new ArrayList();
           ResultSet rs=st.executeQuery();
           while(rs.next()){
              Tecnico te=new Tecnico();
              te.setId_tecnico(rs.getInt("id_tecnico"));
              te.setNombre(rs.getString("nombre"));
              te.setApellido(rs.getString("apellido"));
              te.setCedula(rs.getString("cedula"));
              te.setId_zona(rs.getInt("id_zona"));
              te.setS_apellido(rs.getString("s_apellido"));
              te.setTelefono(rs.getString("telefono"));
              lT.add(te);
           }
           rs.close();
           st.close();
       }catch(Exception e){
           throw e;
       }finally{
           this.cerrar();
       }
        return lT;
    }
    
}
