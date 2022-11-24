/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muestraStatic;

/**
 *
 * @author Agus
 */
public class Auto {

    private String patente;
    private String marca;
    private double precio;
    private String color;
    private static double descuento;// con static pasa de ser una variable de instancia a ser variable de clase

    public Auto(String patente, String marca, double precio, String color) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;   // this apunta a las variable de instancia
        Auto.descuento = 10;  // Auto apunta a la variable de clase (lo statico)  
    }
    
    public double precioDescuento (){
        return this.precio - this.precio * Auto.descuento/100;
    }

    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", marca=" + marca +
                ", precio=" + precio + ", color=" + color + '}';
    }

   
    

}
