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
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Estudiante
 */
public class VentanaFestival extends JInternalFrame {

    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private GestionDato gD;

    public VentanaFestival(GestionDato gD) {
        super("Registro Festival", true, true, true, true);
        this.setSize(500, 500);
        this.gD = gD;
        iniciaComponente();
    }

    private void iniciaComponente() {
        this.etiquetaList = new ArrayList<JLabel>();

        this.etiquetaList.add(new JLabel("Nombre del evento: "));
        this.etiquetaList.add(new JLabel("Hora de Inicio: "));
        this.etiquetaList.add(new JLabel("Hora de Fin: "));
        this.etiquetaList.add(new JLabel("Lugar del Evento: "));
        this.etiquetaList.add(new JLabel("Numero de asientos: "));

        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));

        JPanel panel = new JPanel();
        this.botonList = new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));

        this.encabezado = new Object[5];

        this.encabezado[0] = "Nombre";
        this.encabezado[1] = "Hora Inicio";
        this.encabezado[2] = "Hora Fin";
        this.encabezado[3] = "Lugar";
        this.encabezado[4] = "num asientos";

        this.modeloTabla = new DefaultTableModel(this.datos, this.encabezado);
        this.tabla = new JTable(this.modeloTabla);
        this.scroll = new JScrollPane(this.tabla);

        panel.add(this.etiquetaList.get(0));
        panel.add(this.txtList.get(0));
        panel.add(this.etiquetaList.get(1));
        panel.add(this.txtList.get(1));
        panel.add(this.etiquetaList.get(2));
        panel.add(this.txtList.get(2));
        panel.add(this.etiquetaList.get(3));
        panel.add(this.txtList.get(3));
        panel.add(this.etiquetaList.get(4));
        panel.add(this.txtList.get(4));

        panel.add(botonList.get(0));

        panel.add(this.scroll);
        this.add(panel);

    }

    public Object[][] cargaDatosTabla(int h, int w) {
        Object[][] retorno = new Object[h][w];
        int i = 0;
        for (Festival p : this.gD.getFestivalList()) {
            retorno[i][0] = p.getNombre();
            retorno[i][1] = p.getHoraDeInicio();
            retorno[i][2] = p.getHotaDeFin();
            retorno[i][3] = p.getLugar();
            retorno[i][4] = p.getNumAsientos();
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

}
