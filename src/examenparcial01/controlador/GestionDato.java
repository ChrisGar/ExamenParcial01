/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.modelo.Boleto;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.PresentacionFestival;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class GestionDato {
    private List<Asistente> AsistenteList;
    private List<Artista> ArtistaList;
    private List<Boleto> BoletoList;
    private List<Festival> FestivalList;
    private List<PresentacionFestival> PresentacionFestivalList;

    public GestionDato(List<Asistente> AsistenteList, List<Artista> ArtistaList, List<Boleto> BoletoList, List<Festival> FestivalList, List<PresentacionFestival> PresentacionFestivalList) {
        this.AsistenteList = AsistenteList;
        this.ArtistaList = ArtistaList;
        this.BoletoList = BoletoList;
        this.FestivalList = FestivalList;
        this.PresentacionFestivalList = PresentacionFestivalList;
    }

    public List<Asistente> getAsistenteList() {
        return AsistenteList;
    }

    public void setAsistenteList(List<Asistente> AsistenteList) {
        this.AsistenteList = AsistenteList;
    }

    public List<Artista> getArtistaList() {
        return ArtistaList;
    }

    public void setArtistaList(List<Artista> ArtistaList) {
        this.ArtistaList = ArtistaList;
    }

    public List<Boleto> getBoletoList() {
        return BoletoList;
    }

    public void setBoletoList(List<Boleto> BoletoList) {
        this.BoletoList = BoletoList;
    }

    public List<Festival> getFestivalList() {
        return FestivalList;
    }

    public void setFestivalList(List<Festival> FestivalList) {
        this.FestivalList = FestivalList;
    }

    public List<PresentacionFestival> getPresentacionFestivalList() {
        return PresentacionFestivalList;
    }

    public void setPresentacionFestivalList(List<PresentacionFestival> PresentacionFestivalList) {
        this.PresentacionFestivalList = PresentacionFestivalList;
    }
    
    public boolean addAsistente(Asistente a)
    {
        return this.AsistenteList.add(a);
        
    }
    public boolean addArtista(Artista ar)
    {
        return this.ArtistaList.add(ar);
        
    }
     public boolean addBoleto(Boleto b)
    {
        return this.BoletoList.add(b);
        
    }
     public boolean addFestival(Festival f)
    {
        return this.FestivalList.add(f);
        
    }
      public boolean addPresentacionFestival(PresentacionFestival p)
    {
        return this.PresentacionFestivalList.add(p);
        
    }
     public Festival buscarFestival(String txt) {

        Festival retorno = null;
        int i = 0;
        for (Festival r : this.FestivalList) {
            if (r.getNombre().equals(txt)) {
                i++;
                return r;

            }

        }

        return retorno;
    }
     public Artista buscarArtista(String txt) {

        Artista retorno = null;
        int i = 0;
        for (Artista a : this.ArtistaList) {
            if (a.getNombre().equals(txt)) {
                i++;
                return a;

            }

        }

        return retorno;
    }
    
    
    


    
}
