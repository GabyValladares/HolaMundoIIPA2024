/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ruby
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private String rol;
    private double salario; // Cambio de tipo String a double

    // Constructor por defecto
    public Empleado() {
        this.rol = "Empleado estándar"; // Valor por defecto
        this.salario = 400.0;          // Salario base por defecto
    }

    // Constructor con parámetros
    public Empleado(String nombre, String apellido, String cedula, String rol, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.rol = rol;
        this.salario = salario;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío.");
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("El apellido no puede estar vacío.");
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario no puede ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Empleado {" +
                "\n  Nombre: " + nombre +
                "\n  Apellido: " + apellido +
                "\n  Cédula: " + cedula +
                "\n  Rol: " + rol +
                "\n  Salario: $" + salario +
                "\n}";
    }
}
