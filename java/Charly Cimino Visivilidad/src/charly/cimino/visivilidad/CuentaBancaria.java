/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charly.cimino.visivilidad;

/**
 *
 * @author Agus
 */
public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;

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

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDatos() {
        System.out.println(this);
        System.out.println(CBU + " " + alias + " " + saldo);
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
