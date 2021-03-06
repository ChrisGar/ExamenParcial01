/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.EventoVentanaPresentacion;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
import examenparcial01.modelo.Festival;
import examenparcial01.modelo.PresentacionFestival;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
    private JComboBox combobox1;
    
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
        this.combobox1 = new JComboBox(this.CargaCombo2());
        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.botonList.add(new JButton("Nuevo"));
        this.botonList.get(0).addActionListener(new EventoVentanaPresentacion(this));
        this.botonList.get(1).addActionListener(new EventoVentanaPresentacion(this));
        
        JPanel panel = new JPanel();
        this.encabezado = new Object[3];
        this.encabezado[0] = "Festival";
        this.encabezado[1] = "Artista";
        this.encabezado[2] = "Orden";
        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);
        
        panel.add(this.etiquetaList.get(0));
        panel.add(this.combobox);
        panel.add(this.etiquetaList.get(1));
        panel.add(this.combobox1);
        panel.add(this.etiquetaList.get(2));
        panel.add(this.txtList.get(0));
        panel.add(this.botonList.get(0));
        panel.add(this.botonList.get(1));

        panel.add(this.scroll);
        this.add(panel);
    }
    public Object[][] cargarDatos(int f, int c) {
        Object[][] retorno = new Object[f][c];
        int i = 0;
        for (PresentacionFestival c1 : this.gD.getPresentacionFestivalList()) {
            retorno[i][0] = c1.getFestival().getNombre();
            retorno[i][1] = c1.getArtista().getNombre();
            retorno[i][2] = c1.getOrden();
            i++;
        }
        return retorno;
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
         public Object[] CargaCombo2() {
        String[] retorno = new String[this.gD.getArtistaList().size()];
        int i = 0;
        for (Artista u : this.gD.getArtistaList()) {
            retorno[i] = u.getNombre();
            i++;
        }
        return retorno;
    }

    public List<JLabel> getEtiquetaList() {
        return etiquetaList;
    }

    public void setEtiquetaList(List<JLabel> etiquetaList) {
        this.etiquetaList = etiquetaList;
    }

    public List<JButton> getBotonList() {
        return botonList;
    }

    public void setBotonList(List<JButton> botonList) {
        this.botonList = botonList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public Object[][] getDatos() {
        return datos;
    }

    public void setDatos(Object[][] datos) {
        this.datos = datos;
    }

    public Object[] getEncabezado() {
        return encabezado;
    }

    public void setEncabezado(Object[] encabezado) {
        this.encabezado = encabezado;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }

    public JComboBox getCombobox() {
        return combobox;
    }

    public void setCombobox(JComboBox combobox) {
        this.combobox = combobox;
    }

    public JComboBox getCombobox1() {
        return combobox1;
    }

    public void setCombobox1(JComboBox combobox1) {
        this.combobox1 = combobox1;
    }

    
}
