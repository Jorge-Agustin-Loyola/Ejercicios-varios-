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
public class Principal {
    public static void main(String[] args) {
        Auto a1 = new Auto("zxc123", "fiat", 51999, "Azul");
        Auto a2 = new Auto("asd234", "peugeot", 45999, "Rojo");
        Auto a3 = new Auto("qwe345", "citroen", 63234, "naranja");
        Auto a4 = new Auto("dfg567", "volkswagen", 12345, "Negro");
        
        System.out.println(a1.precioDescuento());
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        
    }
    
}
