/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author Abuelito
 */
public class PresentacionFestival {
    private Festival festival;
    private Artista artista;
    private int orden;

    public PresentacionFestival(Festival festival, Artista artista, int orden) {
        this.festival = festival;
        this.artista = artista;
        this.orden = orden;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }
    
    
            
    
}
