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
public class MetodosSueltos {
    /*
    * Genera un numero aleatorio entre dos numeros
    * Entre el minimo y ek maximo
    * @param minimo
    * @param maximo
    * @return numero entre minimo y maximo
    */
    public static int generaNumerosAleatorio(int minimo, int maximo){
        
        int num = (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
        
        
    }
    
}
