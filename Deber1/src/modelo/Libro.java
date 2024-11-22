/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Libro {
    private String titulo;
    private Persona autor;
    private int codigo;
    private boolean prestamo;
    
    //constructor por defecto
  public Libro (){
  }
  
  //COlocamos parametros al constructor 
    public Libro(String titulo, Persona autor, int codigo, boolean prestamo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigo = codigo;
        this.prestamo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
         this.prestamo = prestamo;
    }
    
    //declaramos los metodos 
    
    
    
    public void devolver(){
    if (prestamo){
        System.out.println("El libro a sido devuelto.");
     }
    } 
    

    public void prestamo(){
     if (prestamo) {
         System.out.println("El libro a sido prestado.");
     } 
    
}

    
    @Override
    public String toString(){
        return "DATOS DEL LIBRO \n"+
                "Titulo del libro: "+titulo+"\n"+
                "Autor del libro: "+autor.getNombre()+"\n"+
                "Codigo del libro :"+codigo+"\n"+
                "devolver"+"\n"+
                "perstamo";
                
                
                        
    }
}