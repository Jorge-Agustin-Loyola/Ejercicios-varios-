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
public class Robot {
    private String nombre;
    
    public Robot(String nombre){
        setNombre(nombre);
    }

    private void setNombre(String nombre) {
        if(nombre!=null){
            this.nombre = nombre;
        }    
    }
    
    public void saludar(String nombrePersona){
        System.out.println("Hola "+nombrePersona+" soy "+nombre);
    }
    public void saludar(){
        this.saludar("extraño");
    }
    
    
}
