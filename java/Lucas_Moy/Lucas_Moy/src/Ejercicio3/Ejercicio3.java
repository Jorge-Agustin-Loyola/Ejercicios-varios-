
package Ejercicio3;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Digite un numero:");
        int num = cargarNumero();
        
        boolean esPar = (num % 2) == 0;
        
        if (esPar) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
       
        
    }
    private static Integer cargarNumero(){
        Scanner entrada = new Scanner(System.in);
        int num = Integer.parseInt(entrada.nextLine());
        return num;
        
    }
}
