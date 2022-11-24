
package ejercicio_poo_ddr_2;


public class Raices {
    // Atributos
    private double a;
    private double b;
    private double c;
    
    // Constructor
    
    public Raices(double aa, double bb, double cc){
        a = aa;
        b = bb;
        c = cc;
        
    }
    // METODOS
    private void obtenerRaices(){
        double x1 = (-b + Math.sqrt(getDiscriminante()))/(2*a);
        double x2 = (-b - Math.sqrt(getDiscriminante()))/(2*a);
        System.out.println("La solucion x1 es: "+x1+"\n");
        System.out.println("La solucion x2 es: "+x2+ "\n");
    }
    private void obtenerRaiz(){
        double x = (-b)/(2*a);
        System.out.println("Unica solucion x: "+x+"\n");
    }
    
    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
    
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else {
            System.out.println("No tiene soluciones reales \n");
        }
    }

// Metodos get and set

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    
}
