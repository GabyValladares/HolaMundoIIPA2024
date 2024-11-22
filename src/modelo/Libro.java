/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class Libro {
    private String titulo;
    private String autor;
    private String estado; // Puede ser "Disponible" o "Prestado"

    // Constructor por defecto
    public Libro() {
        this.estado = "Disponible"; // Estado inicial por defecto
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, String estado) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
    }

    // Métodos de encapsulamiento
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Métodos de lógica
    public void prestar() {
        if (estado.equals("Disponible")) {
            estado = "Prestado";
            System.out.println("El libro ha sido prestado.");
        } else {
            System.out.println("El libro no está disponible para préstamo.");
        }
    }

    public void devolver() {
        if (estado.equals("Prestado")) {
            estado = "Disponible";
            System.out.println("El libro ha sido devuelto.");
        } else {
            System.out.println("El libro no está prestado.");
        }
    }

    @Override
    public String toString() {
        return "Título: " + titulo + "\n" +
               "Autor: " + autor + "\n" +
               "Estado: " + estado;
    }
}
