package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.DAOinter.DAODireccion;
import com.arcos.gestion_ordenes.Logica.Direccion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAODireccionImpl extends Conexion implements DAODireccion {

    @Override
    public int guardar(Direccion dir) throws Exception {
        int id_dir = -1;
        try {
            this.conectar();
            String query = "INSERT INTO direccion(tipo_via,nombre_numero_via,nombre_numero_orientacion,placa,id_barrio) VALUES(?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
            st.setString(1, dir.getTipo_via());
            st.setString(2, dir.getNumero_nombre_via());
            st.setString(3, dir.getOrientacion());
            st.setString(4, dir.getPlaca());
            st.setInt(5, dir.getId_barrio());
            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id_dir = rs.getInt(1);
            } else {
                System.out.println("Error obtener ID");
            }
            rs.close();
            st.close();

        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return id_dir;
    }

    @Override
    public void actualizar(Direccion dir) throws Exception {
            try{
                this.conectar();
                PreparedStatement st=con.prepareStatement("UPDATE direccion SET tipo_via=?,nombre_numero_via=?,nombre_numero_orientacion=?,placa=?,id_barrio=? WHERE id_direccion=?");
                 st.setString(1, dir.getTipo_via());
            st.setString(2, dir.getNumero_nombre_via());
            st.setString(3, dir.getOrientacion());
            st.setString(4, dir.getPlaca());
            st.setInt(5, dir.getId_barrio());
            st.setInt(6, dir.getId_direccion());
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Direccion> traerTodos() throws Exception {
       List<Direccion> lDir=null;
       try{
           this.conectar();
           PreparedStatement st=con.prepareStatement("SELECT * FROM direccion");
           lDir=new ArrayList();
           ResultSet rs=st.executeQuery();
           while(rs.next()){
               Direccion dir=new Direccion();
                 dir.setId_direccion(rs.getInt("id_direccion"));
                dir.setTipo_via(rs.getString("tipo_via"));
                dir.setNumero_nombre_via(rs.getString("nombre_numero_via"));
                dir.setOrientacion(rs.getString("nombre_numero_orientacion"));
                dir.setPlaca(rs.getString("placa"));
                dir.setId_barrio(rs.getInt("id_barrio"));
                lDir.add(dir);
           }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lDir;
       
    }

    @Override
    public Direccion traerUno(int id) throws Exception {
        Direccion dir=new Direccion();
        try{
            this.conectar();
            PreparedStatement st=con.prepareStatement("SELECT * FROM direccion WHERE id_direccion=?");
            st.setInt(1, id);
            ResultSet rs=st.executeQuery();
            if(rs.next()){
                dir.setId_direccion(rs.getInt("id_direccion"));
                dir.setTipo_via(rs.getString("tipo_via"));
                dir.setNumero_nombre_via(rs.getString("nombre_numero_via"));
                dir.setOrientacion(rs.getString("nombre_numero_orientacion"));
                dir.setPlaca(rs.getString("placa"));
                dir.setId_barrio(rs.getInt("id_barrio"));
                return dir;
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return null;
    }

}
