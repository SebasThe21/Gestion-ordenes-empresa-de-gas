
package com.arcos.gestion_ordenes.Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    protected Connection con;
    private final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private final String Db_URL="jdbc:mysql://localhost/ordenes_gestion";
    
    private final String USER="root";
    private final String Contrasena="";
    
    public void conectar() throws ClassNotFoundException {
        try {
            con = DriverManager.getConnection(Db_URL, USER, Contrasena);
            Class.forName(JDBC_DRIVER);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void cerrar() throws SQLException{
        
        if(con!=null){
            if(!con.isClosed()){
                con.close();
            }
        }
    }
}
