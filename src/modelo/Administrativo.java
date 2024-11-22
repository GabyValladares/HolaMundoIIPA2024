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
public class Administrativo extends Persona{
    private String departamento;
    private String puesto;
    private String horario;
    private String numeroEmpleado;
    private int diasVacaciones;

    public Administrativo() {
    }

    public Administrativo(String departamento, String puesto, String horario, String numeroEmpleado, int diasVacaciones) {
        this.departamento = departamento;
        this.puesto = puesto;
        this.horario = horario;
        this.numeroEmpleado = numeroEmpleado;
        this.diasVacaciones = diasVacaciones;
    }

    public Administrativo(String departamento, String puesto, String horario, String numeroEmpleado, int diasVacaciones, int cedula, String nombre, String apellido, String direccion, String telefono, String signo, Date fechaNacimiento) {
        super(cedula, nombre, apellido, direccion, telefono, signo, fechaNacimiento);
        this.departamento = departamento;
        this.puesto = puesto;
        this.horario = horario;
        this.numeroEmpleado = numeroEmpleado;
        this.diasVacaciones = diasVacaciones;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public int getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    @Override
    public void imprimir() {
        
        super.imprimir(); 
        System.out.println("Departamento: "+departamento+"\n"+
                "Puesto: "+puesto+"\n"+
                "Horario: "+horario+"\n"+
                "Numero del Empleado: "+numeroEmpleado+"\n"+
                "Dias disponibles de Vacaciones: "+diasVacaciones+"\n");
    }
    
    
          

}


   

    