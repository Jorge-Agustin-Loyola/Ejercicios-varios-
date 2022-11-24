/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2_POO;

import java.util.Scanner;

/**
 *
 * @author Agus
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nombre:");
        String nombre = entrada.nextLine();
        System.out.println("Edad:");
        int edad = Integer.parseInt(entrada.nextLine());
        System.out.println("Sexo, digite \"m\" si es mujer o \"h\" si es hombre:");
        String sexo = entrada.nextLine();
        System.out.println("peso:");
        double peso = Double.parseDouble(entrada.nextLine());
        System.out.println("altura:");
        double altura = Double.parseDouble(entrada.nextLine());
        
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona p2 = new Persona(nombre, edad, sexo);
        Persona p3 = new Persona();
        
        
        p3.setNombre(nombre);
        p3.setEdad(edad);
        p3.setSexo(sexo);
        p3.setPeso(peso);
        p3.setAltura(altura);
        
        
        System.out.println("Persona 1:");
        System.out.println("Es mayor de edad:"+ p1.esMayorDeEdad());
        System.out.println("Su estado corporal: "+ p1.tieneSobrepeso());
        System.out.println(p1);
        
        System.out.println("Persona 2:");
        System.out.println("Es mayor de edad:"+ p2.esMayorDeEdad());
        System.out.println("Su estado corporal: "+ p2.tieneSobrepeso());
        System.out.println(p2);
        
        System.out.println("Persona 3:");
        System.out.println("Es mayor de edad:"+ p3.esMayorDeEdad());
        System.out.println("Su estado corporal: "+ p3.tieneSobrepeso());
        System.out.println(p3);
        
        
        
//        System.out.println(p1);
//        System.out.println(p2);
//        System.out.println(p3);
//        System.out.println("");
//        System.out.println(p2.esMayorDeEdad());
//        System.out.println(p1.esMayorDeEdad());
//        System.out.println("");
//        System.out.println(p3.calcularIMC());
        
    }
    
}
