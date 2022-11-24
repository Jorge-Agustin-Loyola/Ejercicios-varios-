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
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    private String moneda;
    private String tipo;
    // Constructor1 
    public CuentaBancaria(String alias, String moneda, String tipo) {
        this.CBU = generarCBU();
        setAlias(alias);
        setMoneda(moneda);
        setTipo(tipo);
    }
    // Constructor 3
      public CuentaBancaria(String moneda, String tipo) {
        this("Alias.por.defecto", moneda, tipo);
    }
    
    
    
    // Constructor 2 
    public CuentaBancaria(){
        
    }
    
    
    
    private String generarCBU(){
        return "122435343"; // PENDIENTE debe generarse automaticamente
    }

    public String getCBU() {
        return CBU;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        if (alias != null) {
            this.alias = alias;
        }
    }
    public void setMoneda(String moneda) {
        if (moneda != null) {
            this.moneda = moneda;
        }
    }
    public void setTipo(String tipo) {
        if (tipo != null) {
            this.tipo = tipo;
        }
    }
    
    

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDatos() {
        
        System.out.println(CBU + " " + alias + " " + saldo + " " + moneda + " " + tipo);
    }

    public void depositar(double monto)/*parametro*/ {
        if (monto > 0) {
            saldo += monto;
        }
    }

    private boolean saldoDisponible(double monto) {
        return saldo >= monto;
    }

    public void extraer(double monto) {
        if (saldoDisponible(monto)) {
            saldo -= monto;
        }
    }
}
