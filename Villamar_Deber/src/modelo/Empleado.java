/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Roberto2022
 */
public class Empleado extends Persona{
    
    private String cargo;
    private double sueldo;

    public Empleado() {
    }

    public Empleado(String cargo, double sueldo, String nombre, String apellido, String signo, Date fechaNacimiento) {
        super(nombre, apellido, signo, fechaNacimiento);
        this.cargo = cargo;
        this.sueldo = sueldo;
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

    @Override
    public String toString() {
        return """
               Datos Empleado
               """+
               "Nombres: "+ super.getNombre() +" "+ super.getApellido() +"\n"+
               "Signo: "+ super.getSigno()+"\n"+
               "Fecha de Nacimiento: "+super.getFechaNacimiento()+"\n"+
               "Cargo: "+ cargo +"\n"+
               "Sueldo: "+ sueldo ;
    }
    
    
    
    
}
