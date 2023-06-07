/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.CancionesModel;
import modelo.Usuario;
import vista.Canciones;

/**
 *
 * @author Ale
 */
public class ControladorSpotify {
    
      
    //esta clase solo tiene un atributo y es mi propia conexion 
    private ConexionTabla conexion;
    
    public ControladorSpotify(ConexionTabla conexion) {
        this.conexion = conexion;
    }
    

   public ArrayList<Usuario> obtenerTodosLosUsuarios()throws SQLException{
        ArrayList<Usuario> lista = new ArrayList();
        String consulta = "SELECT * FROM usuario";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            String usuario = rset.getString("usuario");
            String contrasena = rset.getString("contrasena");
            String indicio = rset.getString("indicio");
            Usuario user = new Usuario(usuario, contrasena, indicio);
            lista.add(user);
        }
        return lista;
    }
   
   public ArrayList<CancionesModel> obtenerMusica()throws SQLException{
        ArrayList<CancionesModel> lista = new ArrayList();
        String consulta = "SELECT * FROM musica";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            String titulo = rset.getString("titulo");
            String duracion = rset.getString("duracion");
            String album = rset.getString("album");
            String artista = rset.getString("artista");
            CancionesModel cancion = new CancionesModel(titulo, duracion, album, artista);
            lista.add(cancion);
        }
        return lista;
    }
    
    public void insertar(String titulo, String album, String duracion, String artista) throws SQLException{
     //   Ventana ventana = new Ventana();
       // ventana.
        String insertar = "INSERT INTO musica (titulo, album, artista, duracion) VALUES('"+titulo+"','"+album+"','"+artista+"','"+duracion+"')";
        conexion.ejecutarInsertDeleteUpdate(insertar);
    }
    public void insertarUser(String usuario, String contrasena, String indicio) throws SQLException{
   
        String insertar = "INSERT INTO usuario (usuario, contrasena, indicio) VALUES('"+usuario+"','"+contrasena+"','"+indicio+"')";
        conexion.ejecutarInsertDeleteUpdate(insertar);
    }
    
    public void borrar(String nombre) throws SQLException{
     //   Ventana ventana = new Ventana();
       // ventana.
        String borrar = "DELETE FROM compra WHERE nombre = '"+nombre+"';";
        conexion.ejecutarInsertDeleteUpdate(borrar);
    }
    
    public void modificar(String nombre, String nombreMod, int unidades) throws SQLException{
        String modificar = "UPDATE compra SET nombre = '"+nombre+"', unidades = '"+unidades+"' WHERE nombre = '"+nombreMod+"';";
        conexion.ejecutarInsertDeleteUpdate(modificar);
    }

    
}
