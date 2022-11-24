/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cicloswhile_dowhile_for;

/**
 *
 * @author Agus
 */
public class ciclos {
    public static void main(String[] args) {
        int contador = 0; 
        int numero = 2;
        String cadena = "";
        while(contador<100){
            if(esPrimo(numero)){
                cadena += numero + ", ";
                contador++;
            }
            numero++;
        }
        System.out.println(cadena);
    }
    public static Boolean esPrimo(int numero){
        boolean esUnNumeroPrimo = true;
        
        for (int i = 2; i < numero; i++) {
            
            if (numero % i == 0){
                esUnNumeroPrimo = false;
            }
        }
        return esUnNumeroPrimo;
        
        
        
    }
}
