/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Asistente;
import examenparcial01.vista.VentanaAsistente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Eduardo
 */
public class EventoVentanaAsistente implements ActionListener{
    
    private VentanaAsistente ventana;
    private GestionDato gd;

    public EventoVentanaAsistente(VentanaAsistente ventana) {
        this.ventana = ventana;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.ventana.getBotList().get(0))) {
            int c = Integer.parseInt(this.ventana.getTxtList().get(0).getText());
            String nyp = this.ventana.getTxtList().get(1).getText();
            String fech = this.ventana.getTxtList().get(2).getText();

            Asistente vA = new Asistente(c, nyp, fech);
            this.ventana.getGestionDato().addAsistente(vA);
            Object[][] dato = this.ventana.cargaDatosTabla(this.ventana.getGestionDato().getAsistenteList().size(), 3);
            this.ventana.setDatos(dato);
            this.ventana.getModeloTabla().setDataVector(this.ventana.getDatos(), this.ventana.getEncabezado());
        }
        if (e.getSource().equals(this.ventana.getBotList().get(1))) {
                this.ventana.getTxtList().get(0).setText("");
                this.ventana.getTxtList().get(1).setText("");
                this.ventana.getTxtList().get(2).setText("");
         }
    }
    
    
}
