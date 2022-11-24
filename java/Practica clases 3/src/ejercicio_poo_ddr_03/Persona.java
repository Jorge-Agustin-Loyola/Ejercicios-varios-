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
public abstract class Persona {
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;
    
    private final String[] NOMBRE_CHICOS= {"pepe", "fer", "alberto", "nico", "marcos"};
    private final String[] NOMBRE_CHICAS= {"alica", "martina", "anto", "nancy", "mabel"};
    private final int CHICO = 0;
    private final int CHICA = 1;
    
    // CONSTRUCTOR
    public Persona () {
        
        int det_sexo = MetodosSueltos.generaNumerosAleatorio(0,1);
        
        if (det_sexo==CHICO){
            nombre = NOMBRE_CHICOS[MetodosSueltos.generaNumerosAleatorio(0, 4)];
            sexo = 'H';
        }else{
            nombre = NOMBRE_CHICAS[MetodosSueltos.generaNumerosAleatorio(0, 4)];
            sexo = 'M';
        } 
        disponibilidad();
    }
    
    // GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }
    
    public abstract void disponibilidad();
}
