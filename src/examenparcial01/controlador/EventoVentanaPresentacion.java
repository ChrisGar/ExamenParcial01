/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.controlador;

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
       
    
    }
    
}
