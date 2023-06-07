/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Ale
 */
public class CancionesModel {
    private String titulo;
    private String duracion;
    private String album;
    private String artista;

    public CancionesModel(String titulo, String duracion, String album, String artista) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.album = album;
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "CancionesModel{" + "titulo=" + titulo + ", duracion=" + duracion + ", album=" + album + ", artista=" + artista + '}';
    }

    
}
