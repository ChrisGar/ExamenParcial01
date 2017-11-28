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
public class Boleto {
    private Asistente asistente;
    private int numAsiento;
    private char seccionAsiento;
    private Festival festival; 

    public Boleto(Asistente asistente, int numAsiento, char seccionAsiento, Festival festival) {
        this.asistente = asistente;
        this.numAsiento = numAsiento;
        this.seccionAsiento = seccionAsiento;
        this.festival = festival;
    }

    public Asistente getAsistente() {
        return asistente;
    }

    public void setAsistente(Asistente asistente) {
        this.asistente = asistente;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        this.numAsiento = numAsiento;
    }

    public char getSeccionAsiento() {
        return seccionAsiento;
    }

    public void setSeccionAsiento(char seccionAsiento) {
        this.seccionAsiento = seccionAsiento;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }
    
    
}
