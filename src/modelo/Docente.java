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
public class Docente extends Persona {

    private String especialidad;
    private int codigo;
    private String tituloAcademico;
    private int aniosExperiencia;

    public Docente() {

    }

    public Docente(String especialidad, int codigo, String tituloAcademico, int aniosExperiencia) {
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.tituloAcademico = tituloAcademico;
        this.aniosExperiencia = aniosExperiencia;
    }

    public Docente(String especialidad, int codigo, String tituloAcademico, int aniosExperiencia, String nombre, String apellido, String direccion, String cedula, String telefono, String signo, Date fechaNacimiento) {
        super(nombre, apellido, direccion, cedula, telefono, signo, fechaNacimiento);
        this.especialidad = especialidad;
        this.codigo = codigo;
        this.tituloAcademico = tituloAcademico;
        this.aniosExperiencia = aniosExperiencia;
    }
    
    public String getEspecialidad(){
        return especialidad;
        
    }
    
    public void setEspecialidad (String especialidad){
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Datos del Docente:\n"+
                "N° Cédula:"+getCedula()+"\n"+
                "Nombre:"+getNombre()+"\n"+
                "Apellidos:"+getApellido()+"\n"+
                "Dirección:"+getDireccion()+"\n"+
               "Teléfono:"+getTelefono()+"\n"+
                "Fecha Nacimiento:"+getFechaNacimiento()+"\n"+
                "Signo Zodiaco:"+getSigno()+"\n"+
                "Especialidad:"+getEspecialidad()+"\n"+
                "Código:"+getCodigo()+"\n"+
                "Título Académico:"+getTituloAcademico()+"\n"+
                "Años de Experiencia:"+getAniosExperiencia();
    }
    
    
    
}
