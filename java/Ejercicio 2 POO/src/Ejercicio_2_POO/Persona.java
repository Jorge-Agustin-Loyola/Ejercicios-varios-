/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_2_POO;

/**
 *
 * @author Agus
 */
public class Persona {
    private String nombre;
    private int edad;
    private int DNI;
    private String sexo;
    private double peso;
    private double altura;
    // CONSTRUCTORES /////////////////////////////////////////////////////////
    // Constructor por defecto
    public Persona (){
       this("", 0, "h", 0.0, 0.0);
    }
    
    // Constructor con el nombre edad y sexo lo demas por defecto
    public Persona(String nombre, int edad, String sexo){
        this(nombre, edad, sexo, 0.0, 0.0);    
    }
    
    // Constructor con todos los atributos como paramatros
    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        
        setNombre (nombre);
        setEdad (edad);
        // generar DNI 
        setSexo (sexo);
        setPeso (peso);
        setAltura (altura);
        comprobarSexo(sexo);
    }
    
    // GETTERS AND SETTERS ////////////////////////////////////////////////////
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return sexo;
    }

    public String setSexo(String sexo) { //Setter condicionado
        if("h".equals(sexo) ){
            this.sexo = "Hombre";
        }else if("m".equals(sexo)){
            this.sexo = "Mujer";
        }
        return this.sexo;
        
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    // METODOS ////////////////////////////////////////////////////////////////
    public int calcularIMC(){
        double IMC = this.peso/(this.altura*this.altura);
        int x = 0;
        if (IMC < 20){
            x = -1;
        }else if(IMC >= 20 && IMC <= 25){
            x = 0;
        }else if (IMC>25){
        
            x = 1;
        }
        return x;
    }
    public String tieneSobrepeso(){
        String x = "";
        switch (calcularIMC()) {
            case -1 -> x = "Bajo peso";
            case 0 -> x = "Peso ideal";
            case 1 -> x = "Sobrepeso";
        }
        return x;
    }
    
    
    public boolean esMayorDeEdad(){
        return getEdad()>18;
    }
    
    
    public void comprobarSexo(String sexo){
        if(!"m".equals(sexo) && !"h".equals(sexo)){
            this.sexo = "hombre";
        }
    }

    // TO STRING //////////////////////////////////////////////////////////////
   @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", DNI=" + DNI + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    } 
    
}

    
