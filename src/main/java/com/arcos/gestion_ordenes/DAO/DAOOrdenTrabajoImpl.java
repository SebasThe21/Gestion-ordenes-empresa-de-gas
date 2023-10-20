package com.arcos.gestion_ordenes.DAO;

import com.arcos.gestion_ordenes.DAOinter.DAO;
import com.arcos.gestion_ordenes.Control.Conexion;
import com.arcos.gestion_ordenes.DAOinter.DAOOrden;
import com.arcos.gestion_ordenes.Logica.OrdenTrabajo;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOOrdenTrabajoImpl extends Conexion implements DAOOrden {

    @Override
    public int guardar(OrdenTrabajo oT) throws Exception {
        int id_oT = -1;
        java.util.Date utilDate = oT.getFecha();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("INSERT INTO orden_trabajo(fecha,total,id_solicitud,id_tecnico)VALUES(?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            st.setDate(1, sqlDate);
            st.setDouble(2, oT.getTotal());
            st.setInt(3, oT.getId_solicitud());
            st.setInt(4, oT.getId_tecnico());

            st.executeUpdate();
            ResultSet rs = st.getGeneratedKeys();
            if (rs.next()) {
                id_oT = rs.getInt(1);
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            this.cerrar();
        }
        return id_oT;
    }

    @Override
    public void actualizar(OrdenTrabajo oT) throws Exception {
        java.util.Date utilDate = oT.getFecha();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("UPDATE orden_trabajo SET fecha=?,total=?,id_solicitud=?,id_tecnico=?,estado_orden=? WHERE id_orden=?");
            st.setDate(1, sqlDate);
            st.setDouble(2, oT.getTotal());
            st.setInt(3, oT.getId_solicitud());
            st.setInt(4, oT.getId_tecnico());
            st.setBoolean(5, oT.isEstado());
            st.setInt(6, oT.getId_orden());
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public void eliminar(int id_oT) throws Exception {
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("DELETE FROM orden_trabajo WHERE id_orden=?");
            st.setInt(1, id_oT);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
    }

    @Override
    public List<OrdenTrabajo> traerTodos() throws Exception {
        List<OrdenTrabajo> lOrdenTrabajo = null;

        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("SELECT * FROM orden_trabajo");
            ResultSet rs = st.executeQuery();
            lOrdenTrabajo = new ArrayList();
            while (rs.next()) {
                OrdenTrabajo ot = new OrdenTrabajo();
                ot.setId_orden(rs.getInt("id_orden"));
                ot.setFecha(rs.getDate("fecha"));
                ot.setTotal(rs.getDouble("total"));
                ot.setId_solicitud(rs.getInt("id_solicitud"));
                ot.setId_tecnico(rs.getInt("id_tecnico"));
                ot.setEstado(rs.getBoolean("estado_orden"));
                lOrdenTrabajo.add(ot);
            }
            rs.close();
            st.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lOrdenTrabajo;
    }

    @Override
    public OrdenTrabajo traerUno(int id) throws Exception {
        OrdenTrabajo ot = new OrdenTrabajo();
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("SELECT * FROM orden_trabajo WHERE id_orden=?");
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                ot.setId_orden(rs.getInt("id_orden"));
                ot.setFecha(rs.getDate("fecha"));
                ot.setTotal(rs.getDouble("total"));
                ot.setId_tecnico(rs.getInt("id_tecnico"));
                ot.setId_solicitud(rs.getInt("id_solicitud"));
                ot.setEstado(rs.getBoolean("estado_orden"));
                return ot;
            }
            rs.close();
            st.close();
        } catch (Exception e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return null;
    }

    @Override
    public List<OrdenTrabajo> traerporFecha(java.util.Date fechaBuscar) throws Exception {
        List<OrdenTrabajo> lOrdenTrabajo = null;
               
        java.sql.Date sqlDate = new java.sql.Date(fechaBuscar.getTime());
        try {
            this.conectar();
            PreparedStatement st = con.prepareStatement("SELECT * FROM orden_trabajo WHERE fecha=?");
            st.setDate(1, sqlDate);
            ResultSet rs = st.executeQuery();
            lOrdenTrabajo = new ArrayList();
            while (rs.next()) {
                OrdenTrabajo ot = new OrdenTrabajo();
                ot.setId_orden(rs.getInt("id_orden"));
                ot.setFecha(rs.getDate("fecha"));
                ot.setTotal(rs.getDouble("total"));
                ot.setId_solicitud(rs.getInt("id_solicitud"));
                ot.setId_tecnico(rs.getInt("id_tecnico"));
                ot.setEstado(rs.getBoolean("estado_orden"));
                lOrdenTrabajo.add(ot);
            }
            rs.close();
            st.close();
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        } finally {
            this.cerrar();
        }
        return lOrdenTrabajo;
    }

}
