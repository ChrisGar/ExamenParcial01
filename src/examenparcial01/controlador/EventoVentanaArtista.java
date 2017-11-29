/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.vista.VentanaArtista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Eduardo
 */
public class EventoVentanaArtista implements ActionListener {

    private VentanaArtista ventana;
    private GestionDato gd;

    public EventoVentanaArtista(VentanaArtista ventana) {
        this.ventana = ventana;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.ventana.getBotonList().get(0))) {
            int c = Integer.parseInt(this.ventana.getTxtList().get(0).getText());
            String nyp = this.ventana.getTxtList().get(1).getText();
            String fech = this.ventana.getTxtList().get(2).getText();
            String mg = this.ventana.getTxtList().get(3).getText();

            Artista vA = new Artista(c, nyp, fech, mg);
            this.ventana.getGd().addArtista(vA);
            Object[][] dato = this.ventana.cargardatos(this.ventana.getGd().getArtistaList().size(), 4);
            this.ventana.setDatos(dato);
            this.ventana.getModeloTabla().setDataVector(this.ventana.getDatos(), this.ventana.getEncabezado());
        }
        if (e.getSource().equals(this.ventana.getBotonList().get(1))) {
                this.ventana.getTxtList().get(0).setText("");
                this.ventana.getTxtList().get(1).setText("");
                this.ventana.getTxtList().get(2).setText("");
                this.ventana.getTxtList().get(3).setText("");
         }
    }

}
