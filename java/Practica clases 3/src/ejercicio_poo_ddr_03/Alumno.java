
package ejercicio_poo_ddr_03;


public class Alumno extends Persona{
    
    private int nota;
    
    // Constructor
    public Alumno(){
        super();
        nota = MetodosSueltos.generaNumerosAleatorio(0,10);
        
        super.setEdad(MetodosSueltos.generaNumerosAleatorio(12, 15));
    }
    
    //get and ser
    
    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public void disponibilidad() {
        int prob = MetodosSueltos.generaNumerosAleatorio(0, 100);
        
        if (prob<50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }
    
    public String toString(){
        return "nombre: "+super.getNombre()+", sexo: "+super.getSexo()+" ,nota: "+nota;
        
        
    }
}
