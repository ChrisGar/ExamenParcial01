package examenparcial01.modelo;


import examenparcial01.modelo.Boleto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Asistente extends Persona{
    
    private Boleto boleto;

    public Asistente(Boleto boleto, int codigo, String nombre, String fechaNacimiento) {
        super(codigo, nombre, fechaNacimiento);
        this.boleto = boleto;
    }

    public Boleto getBoleto() {
        return boleto;
    }

    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }

}