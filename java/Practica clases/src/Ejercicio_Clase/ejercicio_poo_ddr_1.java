/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_Clase;

/**
 *
 * @author Agus
 */
public class ejercicio_poo_ddr_1 {
    public static void main(String[] args) {
        Libro libro1 = new Libro(1231241, "titulo1", "autor1", 30);
        Libro libro2 = new Libro(12311222, "titulo2", "autor2", 45);
        
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        
        libro1.setNumPaginas(50);
        
        if (libro1.getNumPaginas() > libro2.getNumPaginas()){
            System.out.println(libro1.getTitulo() + " tiene mas paginas.");
            
        } else {
            System.out.println(libro2.getTitulo() + " tiene mas paginas.");
        }
    }
    
}
