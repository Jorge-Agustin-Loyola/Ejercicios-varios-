
package POO;

import java.util.Scanner;

public class Principal {

    
    public static void main(String[] args) {
        // Primera clase en java ////////////////////////////////////////////
        
        Scanner entrada = new Scanner(System.in);
//        Auto a = new Auto();
//        a.color = "verde";
//        a.patente = "abc123";
//        a.kms = 123000;
//        a.conAire = true;
//        System.out.println(a.color+" "+a.patente+" "+a.kms+" "+a.conAire);
//        
//        Auto a2 = new Auto();
//        
//        a2.color = "azul";
//        a2.patente = "zxc098";
//        a2.kms = 20000;
//        a2.conAire = false;
//        
//        System.out.println(a2.color+" "+a2.patente+" "+a2.kms+" "+a2.conAire);

        // Atributos e identidad de un objeto en java /////////////////////////
        
//        Scanner entrada = new Scanner(System.in);
//        Auto a = new Auto();
//        a.color = "verde";
//        a.patente = "abc123";
//        a.kms = 123000;
//        a.conAire = true;
//        System.out.println(a);
//
//        Auto a2 = new Auto();
//
//        a2.color = "azul";
//        a2.patente = "zxc098";
//        a2.kms = 20000;
//        a2.conAire = false;
//
//        System.out.println(a2);
//
//        Auto otroAuto;
//        otroAuto = a;
//        System.out.println(otroAuto);
//        System.out.println(a.color);
//        otroAuto.color = "violeta";
//        System.out.println(a.color);// el color cambia debido a que estan guardados en la misma celda de memoria

        // Encapsulamiento ///////////////////////////////////////////////////
        /* 
        Decimos que el encapsulamiento en la programación orientada a objetos es cuando
        limitamos el acceso o damos un acceso restringido de una propiedad a los elementos 
        que necesita un miembro y no a ninguno más. El elemento más común de 
        encapsulamiento son las clases, donde encapsulamos y englobamos tanto 
        métodos como propiedades.
        */
        // Modificadores de acceso public y private,
        // Comportamiento de un objeto en java (METODOS)//////////////////////
        
        CuentaBancaria cb = new CuentaBancaria();
        System.out.println(cb.CBU+" "+cb.alias+" "+cb.saldo);
        cb.CBU = "34562347856234959278";
        cb.alias = "miCuenta";
        System.out.println(cb.CBU+" "+cb.alias+" "+cb.saldo);
        cb.mostrarDatos();// Invocamos el metodo en la clase CuentaBancaria.
        
        double x = cb.obtenerSaldo(); // Defino una vvariable "x" y le asigno un valor con el metodo "obtenerSaldo".
        System.out.println(x);        // Muestro X.
        System.out.println(cb.obtenerSaldo()); // hago lo mismo pero en una sola linea.
        
        cb.depositar(200);                      // Deposito mediante el metodo "depositar".
        System.out.println(cb.obtenerSaldo());  
        cb.depositar(-50);
        System.out.println(cb.obtenerSaldo());
      
        cb.extraer(150);
        System.out.println(cb.obtenerSaldo());// extraigo 150 al saldo de 200
        cb.extraer(200);
        System.out.println(cb.obtenerSaldo());// intento extrae 200 al saldo de 50 y no se puede

        
        
        
         
    
         










    }
    
}
