/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_poo_ddr_03;

/**
 *
 * @author Agus
 */
public class Profesor extends Persona{
    
    private String materia;
    
    // Constructor
    
    public Profesor(){
        super();
        
        
        super.setEdad(MetodosSueltos.generaNumerosAleatorio(25, 50));
        
        materia = constantes.Materias[MetodosSueltos.generaNumerosAleatorio(0, 2)];
        
    }
    // get and set

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void disponibilidad() {
        int prob = MetodosSueltos.generaNumerosAleatorio(0, 100);
        
        if (prob<20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
    
}
