
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.Logica.SolicitudOrden;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOSolicitudImpl extends Conexion implements DAO<SolicitudOrden> {

    @Override
    public void guardar(SolicitudOrden sO) throws Exception {
            try{
                this.conectar();
                PreparedStatement st=con.prepareStatement("INSERT INTO solicitud_orden(razon_trabajo,cedula_cliente)VALUES(?,?)");
                st.setString(1,sO.getRazon_trabajo() );
                st.setString(2, sO.getCedula_cliente());
                st.executeUpdate();
                st.close();
            }catch(Exception e){
                throw e;
            }finally{
                this.cerrar();
            }
    }

    @Override
    public void actualizar(SolicitudOrden t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<SolicitudOrden> traerTodos() throws Exception {
        List<SolicitudOrden> lSolicitud=null;
        try{
            this.conectar();
            PreparedStatement st=con.prepareStatement("SELECT * FROM solicitud_orden");
            lSolicitud=new ArrayList();
            ResultSet rs=st.executeQuery();
            while(rs.next()){
                SolicitudOrden sO=new SolicitudOrden();
                sO.setId_solicitud(rs.getInt("id_solicitud"));
                sO.setCedula_cliente(rs.getString("cedula_cliente"));
                sO.setRazon_trabajo(rs.getString("razon_trabajo"));
                
               lSolicitud.add(sO);
            }
            rs.close();
            st.close();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }
        return lSolicitud;
    }

    @Override
    public SolicitudOrden traerUno(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
