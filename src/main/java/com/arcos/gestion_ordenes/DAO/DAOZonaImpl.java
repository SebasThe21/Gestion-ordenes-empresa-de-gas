
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.Logica.Zona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOZonaImpl extends Conexion implements DAO<Zona> {

    @Override
    public void guardar(Zona t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(Zona t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Zona> traerTodos() throws Exception {
        List<Zona>lZona=null;
        try{
            
            this.conectar();
            PreparedStatement st=con.prepareStatement("SELECT * FROM zona");
            ResultSet rs=st.executeQuery();
            lZona=new ArrayList();
            
            while(rs.next()){
                Zona zona=new Zona();
                zona.setId_zona(rs.getInt("id_zona"));
                zona.setZona_nombre(rs.getString("zona_nombre"));
                lZona.add(zona);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lZona;
    }

    @Override
    public Zona traerUno(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
