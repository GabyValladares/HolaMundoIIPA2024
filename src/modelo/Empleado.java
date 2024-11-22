/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlos
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String cargo;
    private double salario;

    // Constructor por defecto
    public Empleado() {}

    // Constructor con parámetros
    public Empleado(String nombre, String apellido, String cargo, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos de encapsulamiento
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Métodos adicionales
    public void imprimir() {
        System.out.println("Nombre: " + nombre + "\n" +
                           "Apellido: " + apellido + "\n" +
                           "Cargo: " + cargo + "\n" +
                           "Salario: " + salario);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Apellido: " + apellido + "\n" +
               "Cargo: " + cargo + "\n" +
               "Salario: " + salario;
    }
}
