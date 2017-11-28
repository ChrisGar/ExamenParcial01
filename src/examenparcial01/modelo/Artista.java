/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author Eduardo
 */
public class Artista extends Persona {
    private String musicagenero;

    public Artista(int codigo, String nombre, String fechaNacimiento,String musicagenero) {
        super(codigo, nombre, fechaNacimiento);
        this.musicagenero=musicagenero;
    }

    public String getMusicagenero() {
        return musicagenero;
    }

    public void setMusicagenero(String musicagenero) {
        this.musicagenero = musicagenero;
    }
   
    
   
    
}
