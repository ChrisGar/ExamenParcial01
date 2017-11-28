/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenparcial01.modelo;

/**
 *
 * @author Estudiante
 */
public class Festival {
    
    private String nombre;
    private String horaDeInicio;
    private String hotaDeFin;
    private String lugar;
    private int numAsientos;

    public Festival(String nombre, String horaDeInicio, String hotaDeFin, String lugar, int numAsientos) {
        this.nombre = nombre;
        this.horaDeInicio = horaDeInicio;
        this.hotaDeFin = hotaDeFin;
        this.lugar = lugar;
        this.numAsientos = numAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(String horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public String getHotaDeFin() {
        return hotaDeFin;
    }

    public void setHotaDeFin(String hotaDeFin) {
        this.hotaDeFin = hotaDeFin;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    
    
}
