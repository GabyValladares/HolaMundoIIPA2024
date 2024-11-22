/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author kirlok6
 */
public class Empleado {
    private String cargo;
    private double sueldo;
    private Persona nombresE;

    public Empleado() {
    }

    public Empleado(String cargo, double sueldo, Persona nombresE) {
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.nombresE = nombresE;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Persona getNombresE() {
        return nombresE;
    }

    public void setNombresE(Persona nombresE) {
        this.nombresE = nombresE;
    }
    
    
}
