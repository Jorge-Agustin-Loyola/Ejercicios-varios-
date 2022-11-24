/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlycimino.constructoresenjava;

/**
 *
 * @author Agus
 */
public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("agus","peso","caja de ahorro");
        
        cb.depositar(1000);
        cb.mostrarDatos();
       
    }
    
}
