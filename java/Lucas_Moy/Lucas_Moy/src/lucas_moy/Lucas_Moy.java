package lucas_moy;

import java.util.Scanner;


public class Lucas_Moy {

  
    public static void main(String[] args) {
       
        System.out.println("Ingrese el primer número");
        int num1 = cargarNumero();
 
        System.out.println("Ingrese el segundo número");
        int num2 = cargarNumero();

        System.out.println("Ingrese el tercer número");
        int num3 = cargarNumero();
        
        
        calcularNumeroMayor(num1, num2, num3);
        calcularNumeroMenor(num1, num2, num3);
    }
    // Funcion entrada de numero
    private static Integer cargarNumero(){
        Scanner entrada = new Scanner(System.in);
        int num = Integer.parseInt(entrada.nextLine());
        return num;    
    }    
    
    /**
     * Esta funcion calcula el numero meyor
     * @param num1 primer numero
     * @param num2 segundo numero
     * @param num3 tercer numero
     */
    private static void calcularNumeroMayor(int num1, int num2, int num3) {
        int mayor = num1;
        
        if (num2 > mayor){
            
            mayor = num2;    
        }
        if (num3 > mayor){
            mayor = num3;
        }
        
        System.out.println("El numero mayor es: " + mayor);
        
    }
    /**
     * Esta funcion calcula el numero menor.
     * @param num1
     * @param num2
     * @param num3 
     */
    private static void calcularNumeroMenor(int num1, int num2, int num3){
        int menor = num1;
        
        if (num2 < menor){
            
            menor = num2;    
        }
        if (num3 < menor){
            menor = num3;
        }
        
        System.out.println("El numero menor es: " + menor);
    }    
       
        
        
        
        
}
