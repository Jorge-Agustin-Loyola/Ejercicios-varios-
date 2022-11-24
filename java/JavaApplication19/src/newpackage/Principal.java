/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Agus
 */
public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria("mi alias", "peso", "caja de ahorro");
        CuentaBancaria cb2 = new CuentaBancaria();
        CuentaBancaria cb3 = new CuentaBancaria("dolar", "cuenta corriente");
        
        
        cb.mostrarDatos();
        cb2.mostrarDatos();
        cb3.mostrarDatos();
    }
    
}
