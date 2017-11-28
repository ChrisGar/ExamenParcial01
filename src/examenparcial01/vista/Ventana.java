/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.vista;

import examenparcial01.controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Estudiante
 */
public class Ventana extends JFrame
        
{
    
    private JMenuBar menu;
    private JDesktopPane escritorio;
    private List<JMenu> listMenu;
    private List<JMenuItem> listMenuItem;private GestionDato gestionDato;
    
    
    public Ventana(String t, GestionDato gD)
    {
        super(t);
        this.gestionDato=gD;
        this.setSize(800, 600);
        this.iniciaComponentes();
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }
    

    private void iniciaComponentes() {
         this.menu= new JMenuBar();
        this.escritorio = new JDesktopPane();
        this.listMenu= new ArrayList<JMenu>();
        this.listMenu.add(new JMenu("Artista"));
        this.listMenu.add(new JMenu("Asistente"));
        this.listMenu.add(new JMenu("Festival"));
        this.listMenu.add(new JMenu("Presentacion"));
        this.listMenu.add(new JMenu("Boleto"));
        
        this.listMenuItem=new ArrayList<JMenuItem>();
        this.listMenuItem.add(new JMenuItem("Registro de Artista"));
        this.listMenuItem.add(new JMenuItem("Registro de Asitente"));
        this.listMenuItem.add(new JMenuItem("Datos de festival"));
        this.listMenuItem.add(new JMenuItem("Raegistrar Presentancion"));
        this.listMenuItem.add(new JMenuItem("Registoro de Datos"));
        
        
        this.setContentPane(this.escritorio);
        this.setJMenuBar(menu);
        this.menu.add(this.listMenu.get(0));
        this.menu.add(this.listMenu.get(1));
        this.menu.add(this.listMenu.get(2));
        this.menu.add(this.listMenu.get(3));
        this.menu.add(this.listMenu.get(4));
        this.listMenu.get(0).add(this.listMenuItem.get(0));
        this.listMenu.get(1).add(this.listMenuItem.get(1));
        this.listMenu.get(2).add(this.listMenuItem.get(2));
        this.listMenu.get(3).add(this.listMenuItem.get(3));
        this.listMenu.get(4).add(this.listMenuItem.get(4));

    }
}
