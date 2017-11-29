/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import examenparcial01.modelo.Asistente;
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
public class VentanaAsistente extends JInternalFrame{
    
    private GestionDato gestionDato;
    private GestionDato gD;
    private Object[][] datos;
    private Object[] encabezado;
    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private List<JButton> botList;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;
    
    
    public VentanaAsistente( GestionDato gD)
    {
        super("Datos del Asistente",true,true,true,true);
        this.gestionDato=gD;
        this.setSize(800, 600);
        this.iniciaComponentes();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
    
    public void iniciaComponentes()
    {
       this.etiList= new ArrayList<JLabel>();
       this.etiList.add(new JLabel("Codigo"));
       this.etiList.add(new JLabel("Nombre"));      
       this.etiList.add(new JLabel("Fecha Nacimiento"));
      
       this.txtList =new ArrayList<JTextField>();
       this.txtList.add(new JTextField(7));
       this.txtList.add(new JTextField(7));
       this.txtList.add(new JTextField(7));
 
       this.botList=new ArrayList<JButton>();
       this.botList.add(new JButton("Guardar"));
       
       
       JPanel panel =new JPanel();
       this.encabezado =new Object[3];
       this.encabezado[0]="Codigo";
       this.encabezado[1]="Nombre";
       this.encabezado[2]="Fecha Nacimiento";
       
       this.modeloTabla = new DefaultTableModel(this.datos,this.encabezado);
       this.tabla= new JTable(this.modeloTabla);
       this.scroll=new JScrollPane(this.tabla);
       panel.add(this.etiList.get(0));
       panel.add(this.txtList.get(0));
       panel.add(this.etiList.get(1));
       panel.add(this.txtList.get(1));
       panel.add(this.etiList.get(2));
       panel.add(this.txtList.get(2));
       panel.add(botList.get(0));
       //this.botList.get(0).addActionListener(new EventoVentanaAspirante(this));
       panel.add(this.scroll);
       
       this.add(panel);
    }
    
    public Object[][] cargaDatosTabla(int h, int w){
        Object[][] retorno = new Object[h][w];
        int i=0;
        for(Asistente as:this.gD.getAsistenteList()){
           
            retorno[i][0]=as.getCodigo();
            retorno[i][1]=as.getNombre();
            retorno[i][2]=as.getFechaNacimiento();
            i++;
        }
       
        
        return retorno;    
        }

    public GestionDato getGestionDato() {
        return gestionDato;
    }

    public void setGestionDato(GestionDato gestionDato) {
        this.gestionDato = gestionDato;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
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

    public List<JLabel> getEtiList() {
        return etiList;
    }

    public void setEtiList(List<JLabel> etiList) {
        this.etiList = etiList;
    }

    public List<JTextField> getTxtList() {
        return txtList;
    }

    public void setTxtList(List<JTextField> txtList) {
        this.txtList = txtList;
    }

    public List<JButton> getBotList() {
        return botList;
    }

    public void setBotList(List<JButton> botList) {
        this.botList = botList;
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

 

}
    
