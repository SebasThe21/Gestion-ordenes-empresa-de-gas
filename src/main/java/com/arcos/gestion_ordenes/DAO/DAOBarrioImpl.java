
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.Logica.Barrio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOBarrioImpl extends Conexion implements DAO<Barrio> {

    @Override
    public void guardar(Barrio t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(Barrio t) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Barrio> traerTodos() throws Exception {
        List<Barrio>ListBa=null;
                try{
                    this.conectar();
                    PreparedStatement st=con.prepareStatement("SELECT * FROM barrio");
                    ListBa=new ArrayList();
                    ResultSet rs=st.executeQuery();
                    
                    while(rs.next()){
                    Barrio b=new Barrio();
                    b.setId_barrio(rs.getInt("id_barrio"));
                    b.setNombre_barrio(rs.getString("nombre_barrio"));
                    b.setNumero_comuna(rs.getString("numero_comuna"));
                    b.setId_zona(rs.getInt("id_zona"));
                    ListBa.add(b);
                    
                }
                    rs.close();
                    st.close();
                }catch(Exception e){
                    throw e;
                }finally{
                    this.cerrar();
                }
                return ListBa;
    }

    @Override
    public Barrio traerUno(int id) throws Exception {
       Barrio b=new Barrio();
       try{
           this.conectar();
           PreparedStatement st=con.prepareStatement("SELECT * FROM barrio WHERE id_barrio=?");
           st.setInt(1, id);
           ResultSet rs=st.executeQuery();
           if(rs.next()){
               b.setId_barrio(rs.getInt("id_barrio"));
                    b.setNombre_barrio(rs.getString("nombre_barrio"));
                    b.setNumero_comuna(rs.getString("numero_comuna"));
                    b.setId_zona(rs.getInt("id_zona"));
                    return b;
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
