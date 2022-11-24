
package Ejercicio_Clase;

public class Libro {
    
    // ATRIBUTOS O PROPIEDADES (son variables de la clase)
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    // CONSTRUCTOR
    public Libro(int pISBN, String pTitulo, String pAutor, int pNumPagina){
        
        ISBN = pISBN;
        titulo = pTitulo;
        autor = pAutor;
        numPaginas = pNumPagina;
          
    }
    // Metodos. get and set
    // get = devolver el valor del atributo.
    // set = modificar el valor del atributo.

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    // Metodo toString
    public String toString(){
        
        return "El libro " + titulo + " con ISBN " + ISBN + 
                " creado por el autor " + autor +
                " tine " + numPaginas + " paginas";
        
    }
    
    
}
