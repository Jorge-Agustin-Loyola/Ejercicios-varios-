/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Agus
 */
public class CuentaBancaria {
   String CBU;
   String alias;
   double saldo;
    //metodo: no recibe parametros ni devuelve resultado
    void mostrarDatos(){
        System.out.println(CBU+" "+alias+" "+saldo);
    }
    //metodo: no recibe parametro, si devuelve resultado
    double obtenerSaldo(){
        return saldo;
    }
    //metodo: recibe paremetro, no devuelve resultado
    void depositar(double monto)/*parametro*/{
        if(monto>0){
            saldo+=monto;
        }
    }    
    //metodo: recibe parametro y devuelve un resultado en este caso dee tipo booleano
    boolean saldoDisponible(double monto){
        return saldo>=monto;
    }
    //metodo: no devuelve valor pero recibe un parametro y ademas reutiliza un metodo de esta misma clase  
    void extraer(double monto){
        if (saldoDisponible(monto)){
            saldo-=monto;
        }
    }
}
