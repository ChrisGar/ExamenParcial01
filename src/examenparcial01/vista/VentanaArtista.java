/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.EventoVentanaArtista;
import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Artista;
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
 * @author Eduardo
 */
public class VentanaArtista extends JInternalFrame {
    
    private List<JLabel> etiquetaList;
    private List<JButton> botonList;
    private JComboBox combobox;
    private List<JTextField> txtList;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    private GestionDato gd;
    
    public VentanaArtista(GestionDato gd){
        super("Registro del Arrtista",true,true,true,true);
        this.setSize(400, 300);
        this.gd=gd;
        iniciacomponente();
    }
    
    public void iniciacomponente(){
        this.etiquetaList=new ArrayList<JLabel>();
        this.etiquetaList.add(new JLabel("Codigo"));
        this.etiquetaList.add(new JLabel("Nombre y Apellido"));
        this.etiquetaList.add(new JLabel("Fecha de Nacimiento"));
        this.etiquetaList.add(new JLabel("Genero de la musica"));
        this.txtList=new ArrayList<JTextField>();
        this.txtList.add(new JTextField(20));
        this.txtList.add(new JTextField(25));
        this.txtList.add(new JTextField(8));
        this.txtList.add(new JTextField(15));
        
        JPanel panel=new JPanel();
        
        this.botonList=new ArrayList<JButton>();
        this.botonList.add(new JButton("Guardar"));
        this.botonList.get(0).addActionListener(new EventoVentanaArtista(this));
        this.botonList.add(new JButton("Borrar"));
        
        this.encabezado=new Object[4];
        this.encabezado[0]="Cedula";
        this.encabezado[1]="Nombre Y Apellido";
        this.encabezado[2]="Fecha de Nacimiento";
        this.encabezado[3]="Genero";
        
        this.modeloTabla=new DefaultTableModel(this.datos,this.encabezado);
        this.tabla=new JTable(this.modeloTabla);
        this.scroll=new JScrollPane(this.tabla);
        
        panel.add(this.etiquetaList.get(0));
        panel.add(this.txtList.get(0));
        panel.add(this.etiquetaList.get(1));
        panel.add(this.txtList.get(1));
        panel.add(this.etiquetaList.get(2));
        panel.add(this.txtList.get(2));
        panel.add(this.etiquetaList.get(3));
        panel.add(this.txtList.get(3));
        panel.add(botonList.get(0));
        panel.add(botonList.get(1));
        panel.add(this.scroll);  
        this.add(panel);
        
    }
    
    public Object[][] cargardatos(int x,int y){

        Object[][] retorno=new Object[x][y];
        int i=0;
        for (Artista a: this.gd.getArtistaList()){
            retorno[i][0]=a.getCodigo();
            retorno[i][1]=a.getNombreYApellido();
            retorno[i][2]=a.getFechaNacimiento();
            retorno[i][3]=a.getFechaNacimiento();
            retorno[i][4]=a.getMusicagenero();
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

    public JComboBox getCombobox() {
        return combobox;
    }

    public void setCombobox(JComboBox combobox) {
        this.combobox = combobox;
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

    public GestionDato getGd() {
        return gd;
    }

    public void setGd(GestionDato gd) {
        this.gd = gd;
    }
    
    
}
