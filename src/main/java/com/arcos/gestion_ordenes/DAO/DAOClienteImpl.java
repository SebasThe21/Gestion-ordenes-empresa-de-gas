
package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.DAOinter.DAOCliente;
import com.arcos.gestion_ordenes.Logica.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class DAOClienteImpl extends Conexion implements  DAOCliente{

    @Override
      public int guardar(Cliente cli) throws Exception {
         int id_cli=-1;
       try{
           this.conectar();
           PreparedStatement st=con.prepareStatement("INSERT INTO cliente(nombre,apellido,cedula,id_direccion,s_apellido,telefono)VALUES(?,?,?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
           st.setString(1, cli.getNombre());
           st.setString(2, cli.getApellido());
           st.setString(3, cli.getCedula());
           st.setInt(4, cli.getId_direccion());
           st.setString(5, cli.getS_apellido());
           st.setString(6, cli.getTelefono());
           st.executeUpdate();
           ResultSet rs=st.getGeneratedKeys();
           if(rs.next()){
               id_cli=rs.getInt(1);
           }
           else{
               System.out.println("Error al registrar");
           }
           rs.close();
           st.close();
           
       }catch(Exception e){
           throw e;
       }finally{
           this.cerrar();
       }
       return id_cli;
    }

    @Override
    public void actualizar(Cliente cli) throws Exception {
          
        try{
            this.conectar();
            PreparedStatement st=con.prepareStatement("UPDATE cliente SET nombre=?,apellido=?,cedula=?,id_direccion=?,s_apellido=?,telefono=? WHERE id_cliente=?");
           st.setString(1, cli.getNombre());
           st.setString(2, cli.getApellido());
           st.setString(3, cli.getCedula());
           st.setInt(4, cli.getId_direccion());
           st.setString(5, cli.getS_apellido());
           st.setString(6, cli.getTelefono());
           st.setInt(7, cli.getId_cliente());
           st.executeUpdate();
        }catch(Exception e){
            throw e;
        }finally{
            this.cerrar();
        }


    }

    @Override
    public void eliminar(int id) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("DELETE FROM cliente WHERE id_cliente=?");
            st.setInt(1, id);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }

    }

    @Override
    public List<Cliente> traerTodos() throws Exception {
        List<Cliente> lCliente = null;
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("SELECT * FROM cliente");
            lCliente = new ArrayList();
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId_cliente(rs.getInt("id_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setCedula(rs.getString("cedula"));
                c.setId_direccion(rs.getInt("id_direccion"));
                c.setS_apellido(rs.getString("s_apellido"));
                c.setTelefono(rs.getString("telefono"));
                lCliente.add(c);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lCliente;
    }

    @Override
    public Cliente traerUno(int id) throws Exception {
         Cliente c=new Cliente();
         try{
             this.conectar();
             PreparedStatement st=con.prepareStatement("SELECT * FROM cliente WHERE id_cliente=?");
             st.setInt(1, id);
             ResultSet rs=st.executeQuery();
             if(rs.next()){
                 c.setId_cliente(rs.getInt("id_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setCedula(rs.getString("cedula"));
                c.setId_direccion(rs.getInt("id_direccion"));
                c.setS_apellido(rs.getString("s_apellido"));
                c.setTelefono(rs.getString("telefono"));
                return c;
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

    @Override
    public List<Cliente> buscarClientes(String criterio) throws Exception {
        List<Cliente> lc=null;
       try{
           this.conectar();
           PreparedStatement st=con.prepareStatement("SELECT * FROM cliente WHERE nombre LIKE ? OR apellido LIKE ? OR cedula LIKE ?");
           st.setString(1, "%" + criterio + "%");
           st.setString(2, "%" + criterio + "%");
           st.setString(3, "%" + criterio + "%");
           lc=new ArrayList();
           ResultSet rs=st.executeQuery();
           while(rs.next()){
               Cliente c=new Cliente();
                c.setId_cliente(rs.getInt("id_cliente"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setCedula(rs.getString("cedula"));
                c.setId_direccion(rs.getInt("id_direccion"));
                c.setS_apellido(rs.getString("s_apellido"));
                c.setTelefono(rs.getString("telefono"));
                lc.add(c);
           }
           rs.close();
           st.close();
       }catch(Exception e){
           throw e;
       }finally{
           this.cerrar();
       }
       return lc;
    }
   
    
}
