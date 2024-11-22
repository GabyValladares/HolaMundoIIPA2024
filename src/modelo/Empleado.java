/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Empleado extends Persona {
    //1.-ATRIBUTOS
    private int codigo;
    private String cargo;
    private double sueldo;
    private boolean seguro;    
    private String correo;
    //2.-CONSTRUCTOR
//TODA SUBCLASE , TIENE UN NUEVO CONSTRUCTOR SUPER A LOS DATOS DE LA SUPERCLASE
    public Empleado() {
    }

    public Empleado(int codigo, String cargo, double sueldo, boolean seguro, String correo) {
        this.codigo = codigo;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.seguro = seguro;
        this.correo = correo;
    }

    public Empleado(int codigo, String cargo, double sueldo, boolean seguro, String correo, String nombre, String apellido, String direccion, String cedula, String telefono, String signo, Date fechaNacimiento) {
        super(nombre, apellido, direccion, cedula, telefono, signo, fechaNacimiento);
        this.codigo = codigo;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.seguro = seguro;
        this.correo = correo;
    }
    
    //3.-ENCAPSULAMIENTO

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "DATOS DEL EMPLEADO\n"+
                "N° Cédula:"+getCedula()+"\n"+
                "Nombre:"+getNombre()+"\n"+
                "Apellidos:"+getApellido()+"\n"+
                "Dirección:"+getDireccion()+"\n"+
               "Teléfono:"+getTelefono()+"\n"+
                "Fecha Nacimiento:"+getFechaNacimiento()+"\n"+
                "Signo Zodiaco:"+getSigno()+"\n"+
                "Código Empleado:"+getCodigo()+"\n"+
                "Cargo:"+getCargo()+"\n"+
                "Sueldo:"+getSueldo()+"\n"+
                "Seguro:"+getSeguro()+"\n"+
                "Correo Electrónico:"+getCorreo();
                
                
                
                }
    
    
    
}
