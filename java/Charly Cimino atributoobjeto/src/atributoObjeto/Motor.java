/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atributoObjeto;

/**
 *
 * @author Agus
 */
public class Motor {
    private String numero;
    private double cilindrada;
    private String tipo;
    private int rpmActuales;

    public Motor(String numero, double cilindrada, String tipo) {
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.rpmActuales = 0;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void acelerar(){
        this.rpmActuales += 1000;
    }

    @Override
    public String toString() {
        return "Motor{" + "numero=" + numero + ", cilindrada=" + cilindrada + ", tipo=" + tipo + ", rpmActuales=" + rpmActuales + '}';
    }
    
    
    
   
    
    
    
}
