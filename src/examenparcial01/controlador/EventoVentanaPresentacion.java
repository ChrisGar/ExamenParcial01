/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.PresentacionFestival;
import examenparcial01.vista.VentanaPresentacionFestival;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Abuelito
 */
public class EventoVentanaPresentacion implements ActionListener{

    private VentanaPresentacionFestival vPresentacion;
    private GestionDato gD;

    public EventoVentanaPresentacion(VentanaPresentacionFestival vPresentacion) {
        this.vPresentacion = vPresentacion;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if (e.getSource().equals(this.vPresentacion.getBotonList().get(0))) {
                String nP = this.vPresentacion.getCombobox().getSelectedItem().toString();
                Festival f = this.vPresentacion.getgD().buscarFestival(nP);
                String nA= this.vPresentacion.getCombobox1().getSelectedItem().toString();
                Artista a= this.vPresentacion.getgD().buscarArtista(nA);
                int o= Integer.parseInt(this.vPresentacion.getTxtList().get(0).getText());
                PresentacionFestival pF = new PresentacionFestival(f, a,o);

                this.vPresentacion.getgD().addPresentacionFestival(pF);
                Object[][] datosPresentacion = this.vPresentacion.cargarDatos(this.vPresentacion.getgD().getPresentacionFestivalList().size(), 3);
                this.vPresentacion.setDatos(datosPresentacion);
                this.vPresentacion.getModeloTabla().setDataVector(this.vPresentacion.getDatos(), this.vPresentacion.getEncabezado());
            }if (e.getSource().equals(this.vPresentacion.getBotonList().get(1))) {
                this.vPresentacion.getTxtList().get(0).setText("");
            }
    
    }
    
}
