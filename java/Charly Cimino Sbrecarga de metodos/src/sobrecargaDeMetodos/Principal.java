/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaDeMetodos;

/**
 *
 * @author Agus
 */
public class Principal {
    public static void main(String[] args) {
        Robot robot = new Robot("Robot Java");
        
        robot.saludar("Jorge Loyola");
        robot.saludar();
    }
    
}
