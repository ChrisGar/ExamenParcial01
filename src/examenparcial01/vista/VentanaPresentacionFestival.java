/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Festival;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abuelito
 */
public class VentanaPresentacionFestival extends JInternalFrame {

    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private GestionDato gD;
    private JComboBox combobox;

    public VentanaPresentacionFestival(GestionDato gD) {
        super("Presentacion Festival", true, true, true, true);
        this.setSize(600, 300);
        this.gD = gD;
        iniciaComponente();

    }

    public void iniciaComponente() {
        this.etiquetaList = new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Festival"));
        this.etiquetaList.add(new JLabel("Artista"));
        this.etiquetaList.add(new JLabel("Orden"));
        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(15));
        
        this.combobox = new JComboBox(this.CargaCombo());
        

    }
        public Object[] CargaCombo() {
        String[] retorno = new String[this.gD.getFestivalList().size()];
        int i = 0;
        for (Festival u : this.gD.getFestivalList()) {
            retorno[i] = u.getNombre();
            i++;
        }
        return retorno;
    }


}
