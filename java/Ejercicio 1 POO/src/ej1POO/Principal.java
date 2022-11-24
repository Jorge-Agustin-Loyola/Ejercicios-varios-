
package ej1POO;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        Cuenta cuenta = new Cuenta();
       
        
        // Menu
        System.out.println("Digite 1 para ingresar dinero"
                + "\nDigite 2 para retirar dinero"
                + "\nDigite 3 para salir");
        String opcion = entrada.nextLine();
        
        while(!"3".equals(opcion)){
            if ("1".equals(opcion)){
                    cuenta.ingresarCantidad();
                }else if("2".equals(opcion)){
                    cuenta.retirarCantidad();
                }else{
                    System.out.println(cuenta.toString());
                }
            System.out.println("Digite 1 para ingresar dinero"
            + "\nDigite 2 para retirar dinero"
            + "\nDigite 3 para salir");
            opcion = entrada.nextLine();
            
        }
                
                    
            
        
        
        
        
    }
    
}
