/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Integrador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import org.postgresql.util.PSQLException;

public class PostgrDriver {
    private JTextField instancia, baseDeDatos, puerto, usuario, contrasenia;
    private JTextArea bitacora;
    private String cadenaConexion;
    private boolean isPrueba;
    private Connection connection;

    public PostgrDriver(JTextField instancia, JTextField baseDeDatos, JTextField puerto, JTextField usuario, JTextField contrasenia, JTextArea bitacora) {
        this.instancia = instancia;
        this.baseDeDatos = baseDeDatos;
        this.puerto = puerto;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.bitacora = bitacora;
    }
    
    private void crearCadenaConexion(){
        cadenaConexion = String.format("jdbc:postgresql://%s:%s/%s", instancia.getText(), puerto.getText(), baseDeDatos.getText());
    }
    
    public void crearConexion(){
        try {
            crearCadenaConexion();
            connection = DriverManager.getConnection(cadenaConexion, usuario.getText(), contrasenia.getText());
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select datname, description from pg_shdescription join pg_database on objoid = pg_database.oid where datname = 'HR'");
            resultSet.next();
            bitacora.append("\nConexion Exitosa a:");
            bitacora.append("\n" + resultSet.getString(1) + " - " + resultSet.getString(2));
            bitacora.append("\n---------------------------------------------------------------------------");
        }catch (SQLException ex) {
            
            if (ex.getCause() == null) {
                bitacora.append("\nERROR: " + ex.getMessage());
            }else{
                bitacora.append("\nERROR: " + ex.getMessage() + ex.getCause().toString());
            }
            bitacora.append("\n---------------------------------------------------------------------------");
        }finally{
            if (isPrueba) {
                cerrarConexion();
                bitacora.append("\nPrueba Terminada - Cerrando Conexion");
                bitacora.append("\n---------------------------------------------------------------------------");
            }
        }
        
    }
    
    public void cerrarConexion(){
        try {
            if (!connection.isClosed()) {
                connection.close();
                if (!isPrueba) {
                    bitacora.append("\nCerrando Conexion");
                    bitacora.append("\n---------------------------------------------------------------------------");
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            bitacora.append("ERROR: " + ex.getMessage() + ex.getCause().toString());
            bitacora.append("\n---------------------------------------------------------------------------");
        }
    }

    public boolean isIsPrueba() {
        return isPrueba;
    }

    public void setIsPrueba(boolean isPrueba) {
        this.isPrueba = isPrueba;
    }
    
    
}
