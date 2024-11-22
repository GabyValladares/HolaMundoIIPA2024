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
    
    private int codigo;
    private String cargo;
    private double sueldo;
    private boolean seguro;

    public Empleado() {
    }

    public Empleado(int codigo, String cargo, double sueldo, boolean seguro, int cedula, String nombre, String apellido, String direccion, String telefono, String signo, Date fechaNacimiento) {
        super(cedula, nombre, apellido, direccion, telefono, signo, fechaNacimiento);
        this.codigo = codigo;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.seguro = seguro;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    
    @Override
    public String toString() {
        return "Datos Empleado\n" 
                + "Código: " + codigo + "\n" +
                "Nombres: " + super.getNombre() + " " + super.getApellido() + "\n" + 
                "Dirección: " + super.getDireccion() + "\n" + 
                "Teléfono: " + super.getTelefono() + "\n" + 
                "Signo: " + super.getSigno() + "\n" + 
                "Fecha de Nacimiento: " + super.getFechaNacimiento().getDate() + "\n" + 
                "Cargo: " + cargo + "\n" + 
                "Sueldo: " + sueldo + "\n" + 
                "Seguro: " + (seguro ? "Sí" : "No")+"\n";
    }
    
    
    
    
}
