
package ej1POO;

import java.util.Scanner;


public class Cuenta {
    Scanner entrada = new Scanner(System.in);
    private String titular;
    private double cantidad;
    
    
    //constructor
    public Cuenta(){
        cantidad = 0;
        titular = "";
        while("".equals(titular)){
           System.out.println("Digite titular:");
           setTitular(entrada.nextLine());

           if(!"".equals(titular)){
               System.out.println("Digite cantidad");
               setCantidad(Double.parseDouble("0"+entrada.nextLine()));
           }else{
               System.out.println("Digite titular, es de caracter obligatorio:");
           } 
        }
        System.out.println(toString());
    }
    // get and set

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    // to String
    
    @Override
    public String toString(){
        return ("\nTitular: "+titular+"\n\nCantidad: "+cantidad+"\n");
    }          
    
    // Metodo Ingresar cantidad
    public void ingresarCantidad(){
        System.out.println("Digite la cantidad a ingresar:");
        Double cantidadIngresada = Double.parseDouble(entrada.nextLine());
        if(cantidadIngresada > 0){
           setCantidad(cantidad+cantidadIngresada);
        }else if(cantidadIngresada<=0){
            
        }  
        System.out.println(toString());
    }
    // Metodo Retirar cantidad
    public void retirarCantidad(){
        System.out.println("Digite la cantidad a retirar:");
        Double cantidadRetirada = Double.parseDouble("0"+entrada.nextLine());
        if((cantidad-cantidadRetirada)<0){
            setCantidad(0);
        }else{
            setCantidad(cantidad-cantidadRetirada);
        }
        System.out.println(toString());
    }
    
}
