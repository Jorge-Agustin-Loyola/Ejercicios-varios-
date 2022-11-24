/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Static;

/**
 *
 * @author Agus
 */
public class Ticket {
    private static int contador;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket( String fechaCompra, String UNIPersona) {
        contador++;
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.DNIPersona = UNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero 
                + ", fechaCompra=" + fechaCompra
                + ", DNIPersona=" + DNIPersona + '}';
    }
    
    
    
}
