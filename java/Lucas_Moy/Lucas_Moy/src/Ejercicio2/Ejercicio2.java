
package Ejercicio2;

import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingrese el primer número");
        int num1 = cargarNumero();
 
        System.out.println("Ingrese el segundo número");
        int num2 = cargarNumero();

        System.out.println("Ingrese el tercer número");
        int num3 = cargarNumero();
        
        int sumatoria = num1 + num2 + num3;
        double promedio = Double.valueOf(sumatoria)/3;
        
        System.out.println("promedio: " + promedio);
    }
    private static Integer cargarNumero(){
        Scanner entrada = new Scanner(System.in);
        int num = Integer.parseInt(entrada.nextLine());
        return num;    
    }    
}
