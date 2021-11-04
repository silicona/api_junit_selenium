package com.app.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Programacion
 */
public class ConexionMysql {
    
    protected Connection miConexion;
    
    public void abrirConexion() throws ClassNotFoundException, SQLException  {
        
        Class.forName("com.mysql.cj.jdbc.Driver");
                
        String host = "jdbc:mysql://localhost:8889/constructora?";
        host += "useSSL=FALSE";
        
        //String url = "jdbc:mysql://localhost:8889;";
        //url += "databaseName=constructora;";
        //url += "useSSL=false;";
        //url += "trustServerCertificate=false;";
        //String host = "jdbc:mysql://localhost/nowe_sql";
        // String host = "jdbc:mysql://localhost/nowe_sql?serverTimezone=UTC";
                
        miConexion = DriverManager.getConnection(host, "root", "root");
    }
    
    public void cerrarConexion() throws SQLException {
        miConexion.close();
    }
    
}

