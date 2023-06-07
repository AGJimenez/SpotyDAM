/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.TimeZone;
import javax.swing.JOptionPane;

/**
 *
 * @author Ale
 */
public class ConexionTabla {
    
    private String BD;
    private String USUARIO;
    private String HOST;
    private String PASS;
    private Connection connection;
    private TimeZone zonaHoraria;
    
    //cosntructor
    public ConexionTabla(String usuario, String pass, String bd){
        
        HOST ="localhost";
        USUARIO = "root";
        PASS = "";
        BD = bd;
        connection = null;
        
    }//constructor
    //conecta con la bdd
    public void conector()throws SQLException{
        
        if(connection==null||connection.isClosed()){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Calendar now = Calendar.getInstance();
                zonaHoraria=now.getTimeZone();
                connection=(Connection)DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD+"?user="+USUARIO+"&password="+PASS+"&userLegacyDateTimeCode=false&serverTimeZone="+zonaHoraria.getID());
                
            }
            catch(ClassNotFoundException e){
                System.out.println("Error");
            }
            
            
        }//if
       
        
    }//método
    //desconecta la bdd
    public void desconectar()throws SQLException{
        
        if(connection!=null&&!connection.isClosed()){
            connection.close();
        }
        }//cerramos desconcetar
    //select
    public ResultSet ejecutarSelect(String consulta)throws SQLException{
        Statement st = connection.createStatement();
        ResultSet rset = st.executeQuery(consulta);
        return rset;
        
    }
    //ejecutar insert, delete o update
    public int ejecutarInsertDeleteUpdate(String consulta)throws SQLException{
        Statement stmt = connection.createStatement();
        int fila =stmt.executeUpdate(consulta);
        return fila;
        
        
    }    
    
    
    
    
    
    
    
}
