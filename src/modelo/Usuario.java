/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ale
 */
public class Usuario {
    private String usuario;
    private String contrasena;
    private String indicio;

    public Usuario() {
    }

    public Usuario(String usuario, String contrasena, String indicio) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.indicio = indicio;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getIndicio() {
        return indicio;
    }

    public void setIndicio(String indicio) {
        this.indicio = indicio;
    }

    @Override
    public String toString() {
        return "Spotify{" + "usuario=" + usuario + ", contrasena=" + contrasena + ", indicio=" + indicio + '}';
    }
    
    
}
