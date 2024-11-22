/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Roberto2022
 */
public class Libro {
    private int codigoLibro;
    private String tituloLibro;
    private Persona autorLibro;
    private String editorial;
    private double precioLibro;

    //Constructores
    public Libro() {
    }

    public Libro(int codigoLibro, String tituloLibro, Persona autorLibro, String editorial, double precioLibro) {
        this.codigoLibro = codigoLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.editorial = editorial;
        this.precioLibro = precioLibro;
    }

    // Gets and Setts
    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public Persona getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(Persona autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public double getPrecioLibro() {
        return precioLibro;
    }

    public void setPrecioLibro(double precioLibro) {
        this.precioLibro = precioLibro;
    }
    
    
    public String prestarLibro(){
        return "libro Prestado";
    }
    
    public String devolverLibro(){
        return "libro devuelto";
    }
    @Override
    public String toString() {
        return "Datos del Libro\n"+
               "Codigo: "+ codigoLibro + "\n"+
               "Titulo del Libro: "+ tituloLibro + "\n"+
               "Autor: " + autorLibro.getNombre() +" " +autorLibro.getApellido()+"\n"+
               "Editorial: "+ editorial + "\n"+
               "Precio: "+ precioLibro; 
    }
    
    
}
