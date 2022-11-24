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
public class Princialll {
    public static void main(String[] args) {
        
        
        Motor m = new Motor("121", 1.6, "nafta");
        Auto auto = new Auto("zxc456", "Fiat", 4234233, "verde", m);
        System.out.println(auto);
        
        m.setCilindrada(2.0);
        System.out.println(auto);
        
        //System.out.println(auto);
        //auto.getMotor().setRpmActuales(auto.getMotor().getRpmActuales()+1000);
        //System.out.println(auto);+
        
        auto.acelerar();
        System.out.println(auto);
        auto.acelerar();
        System.out.println(auto);
        
        
    }
}
           