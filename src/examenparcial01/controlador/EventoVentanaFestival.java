/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

import examenparcial01.modelo.Festival;
import examenparcial01.vista.VentanaFestival;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class EventoVentanaFestival implements ActionListener {

    private VentanaFestival vFestival;

    public EventoVentanaFestival(VentanaFestival vFestival) {
        this.vFestival = vFestival;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    
        try{
        if (ae.getSource().equals(this.vFestival.getBotonList().get(0))) {

            String nom = this.vFestival.getTxtList().get(0).getText();
            String hIni = this.vFestival.getTxtList().get(1).getText();
            String hFin = this.vFestival.getTxtList().get(2).getText();
            String lug = this.vFestival.getTxtList().get(3).getText();
            int nASi = Integer.parseInt(this.vFestival.getTxtList().get(4).getText());

            Festival fe = new Festival(nom, hIni, hFin, lug, nASi);

            this.vFestival.getgD().addFestival(fe);

            Object[][] datoFestival = this.vFestival.cargaDatosTabla(this.vFestival.getgD().getFestivalList().size(), 5);
            this.vFestival.setDatos(datoFestival);
            this.vFestival.getModeloTabla().setDataVector(this.vFestival.getDatos(), this.vFestival.getEncabezado());

        }
        if (ae.getSource().equals(this.vFestival.getBotonList().get(1))) {
            this.vFestival.getTxtList().get(0).setText("");
            this.vFestival.getTxtList().get(1).setText("");
            this.vFestival.getTxtList().get(2).setText("");
            this.vFestival.getTxtList().get(3).setText("");
            this.vFestival.getTxtList().get(4).setText("");

        }
        }catch (NumberFormatException numb) {
             JOptionPane.showMessageDialog(vFestival, "numero de asientos es un numero entero");
        }
               

    }

}
