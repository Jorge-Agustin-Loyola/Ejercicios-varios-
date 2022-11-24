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
public class Aula {
    private int id;
    private Profesor profesor;
    private Alumno[] alumnos;
    private String materia;
    
    private final int MAX_ALUMNOS = 20;
    
    public Aula(){
        
        id = 1;
        profesor = new Profesor();
        alumnos = new Alumno[MAX_ALUMNOS];
        creaAlumnos();
        materia = constantes.Materias[MetodosSueltos.generaNumerosAleatorio(0, 2)];    
    }
    
    private void creaAlumnos(){
        for(int i=0; i<alumnos.length;i++){
            alumnos[i] = new Alumno();
        }
    }
    
    
    private boolean asistenciaAlumnos(){
        int cuentaAsistencia = 0;
        for (int i=0;i<alumnos.length;i++) {
            if (alumnos[i].isAsistencia()) {
                cuentaAsistencia++;
            }
        }
        return cuentaAsistencia>((int)(MAX_ALUMNOS/2));     
    }
    
    public boolean darClase(){
        
        if(profesor.isAsistencia()){
            System.out.println("El profesor no esta, no se puede dar clase");
            return false;
        }else if(!profesor.getMateria().equals(materia)){
            System.out.println("La materia del profesor y del aula no es la misma no se puede dar clase");
            return false;
        }else if (!asistenciaAlumnos()){
            
            System.out.println("La asistencia no es suficiente, no se puede dar clase");
            return false;
        }
        
        System.out.println("se puede dar clase");
        return true;
        
    }
    public void notas(){
        
        int chicosAprob = 0;
        int chicasAprob = 0;
        
        for (int i=0;i<alumnos.length;i++) {
            if(alumnos[i].getNota()>=5){
                if(alumnos[i].getSexo()=='H'){
                    chicosAprob++;
                }else{
                    chicasAprob++;
                }
                System.out.println(alumnos[i].toString());
            }
        }
        System.out.println("Hay "+chicosAprob+" chicos y "+chicasAprob+" chicas aprobados/as.");
    }
}
