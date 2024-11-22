/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import com.sun.java.accessibility.util.TopLevelWindowListener;

public class Libro {
    private String titulo; 
    private String autor;
    private String codigoLibro;
    private boolean prestamo ;

    public Libro() {
    }

    public Libro(String titulo, String autor, String codigoLibro, boolean prestamo) {
        this.titulo = titulo;
        this.autor = autor;
        this.codigoLibro = codigoLibro;
        this.prestamo = false;
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

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

public void devolucion(){
    if (prestamo){
        System.out.println("El libro ha sido devuelto");   
    }
       

}

public void pretamo(){
    if (prestamo){
        System.out.println("El libro no ha sido");
    }

    }

public String toString(){
    return "Datos sobre el libro \n"+
            "Titulo del libro" +titulo+ "\n"+
            "Autor del libro" +autor+ "\n"+
            "Código del libro" +codigoLibro+ "\n"+
            "Prestamo" +prestamo+ "\n";
            
            
    

}            

}







    

