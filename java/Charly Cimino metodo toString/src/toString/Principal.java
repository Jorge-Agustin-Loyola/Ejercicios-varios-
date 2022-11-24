/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toString;

/**
 *
 * @author Agus
 */
public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona("agustin", "loyola", 25, false);
        Persona persona2 = new Persona("martina", "loyola", 23, false);
        Persona persona3 = new Persona("facundo ", "diaz", 26, true);
        
        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3.toString());
        System.out.println(persona3);
        
        String x = persona3.toString();
        System.out.println(x);
        
    }
}
