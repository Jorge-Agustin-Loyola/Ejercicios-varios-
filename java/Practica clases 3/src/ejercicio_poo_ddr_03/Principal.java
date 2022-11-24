/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_poo_ddr_03;

/**
 *
 * @author Agus
 */
public class Principal {
    public static void main(String[] args) {
        Aula aula = new Aula();
        if (aula.darClase()){
            aula.notas();
        }
    }
    
}
