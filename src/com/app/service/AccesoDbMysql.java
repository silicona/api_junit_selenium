/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.service;

//import com.nowe.modelo.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
//import java.util.*;

/**
 *
 * @author nadies
 */
public class AccesoDbMysql extends ConexionMysql implements Serializable {

    public AccesoDbMysql() {
    }
    
    
    /*
    public Material obtenerMaterial(int idMaterial) throws SQLException, ClassNotFoundException {
        
        Material mat = null;
        abrirConexion();
        
        CallableStatement query;
        String sql = "call contructora.obtener_material(?);";
        
        query = miConexion.prepareCall(sql);
        
        query.setInt(1, idMaterial);

        ResultSet res = query.executeQuery();
        
        while(res.next())
        {
            mat = new Material(
                res.getInt("idMaterial"),
                res.getString("nombre"),
                res.getString("descripcion"),
                res.getDouble("volumen")    
            );
        }
        query.close();
        cerrarConexion();
        
        return mat;
    }
    
    public ArrayList<Material> obtenerMateriales() throws SQLException, ClassNotFoundException {
        
        abrirConexion();

        CallableStatement query;
        String sql = "call constructora.obtener_materiales();";
        
        query = miConexion.prepareCall(sql);

        ResultSet res = query.executeQuery();
        ArrayList<Material> arr_salida = new ArrayList();
        
        while(res.next())
        {
            Material mat;
            mat = new Material(
                res.getInt("idMaterial"),
                res.getString("nombre"),
                res.getString("descripcion"),    
                res.getDouble("volumen")
            );
            
            arr_salida.add(mat);
        }
        
        query.close();
        cerrarConexion();
        
        return arr_salida;
    }
    
    public boolean crearMaterial(Material m) throws SQLException, ClassNotFoundException  
    {
        int reg = 0;
        
        abrirConexion();
        
        CallableStatement query;
        String sql = "call constructora.crear_material(?, ?, ?);";
        
        query = miConexion.prepareCall(sql);
        
        // Dar valor a los parametros de sql
        query.setString(1, m.getNombre());
        query.setString(2, m.getDescripcion());
        query.setDouble(3, m.getVolumen());
        
        reg = query.executeUpdate();
        
        query.close();
        cerrarConexion();
        
        return reg > 0; 
    }
    
    public boolean editarMaterial(Material m) throws SQLException, ClassNotFoundException
    {
        int reg = 0;
        
        abrirConexion();
        
        CallableStatement query;
        String sql = "call constructora.editar_material(?, ?, ?, ?);";
        
        query = miConexion.prepareCall(sql);
        
        // Dar valor a los parametros de sql
        query.setInt(1, m.getIdMaterial());
        query.setString(2, m.getNombre());
        query.setString(3, m.getDescripcion());
        query.setDouble(4, m.getVolumen());
        
        reg = query.executeUpdate();
        
        query.close();
        cerrarConexion();
        
        return reg > 0;        
    }
    
    public boolean eliminarMaterial(int idMaterial) throws SQLException, ClassNotFoundException
    {
        int reg = 0;
        
        abrirConexion();
        
        CallableStatement query;
        String sql = "call constructora.eliminar_material(?);";
        
        query = miConexion.prepareCall(sql);
        
        // Dar valor a los parametros de sql
        query.setInt(1, idMaterial);
        
        reg = query.executeUpdate();
        
        query.close();
        cerrarConexion();
        
        return reg > 0;
    }
    */
}
