/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Dell Core i7
 */
public class Docente extends Persona{
    
     //1. ATRIBUTOS
    private int codDocente;
    private String tituloAcademico;
    private String especialidad;
    private int experienciaDocente;
    private double sueldo;
    private boolean seguro;
    private String correo;
    
    //2. CONSTRUCTORES
    
    //VACIO
    
    public Docente(){
    
    }
    
    // DATOS DE LA SUBCLASE

    public Docente(int codDocente, String tituloAcademico, String especialidad, int experienciaDocente, double sueldo, boolean seguro, String correo) {
        this.codDocente = codDocente;
        this.tituloAcademico = tituloAcademico;
        this.especialidad = especialidad;
        this.experienciaDocente = experienciaDocente;
        this.sueldo = sueldo;
        this.seguro = seguro;
        this.correo= correo;
    }
    // DATOS HIBRIDOS-SUBCLASE Y SUPERCLASE

    public Docente(int codDocente, String tituloAcademico, String especialidad, int experienciaDocente, double sueldo, boolean seguro, String correo, String signo, Date fechaNacimiento, String cedula, String nombre, String apellido, String direccion, String Telefono) {
        super(signo, fechaNacimiento, cedula, nombre, apellido, direccion, Telefono);
        this.codDocente = codDocente;
        this.tituloAcademico = tituloAcademico;
        this.especialidad = especialidad;
        this.experienciaDocente = experienciaDocente;
        this.sueldo = sueldo;
        this.seguro = seguro;
        this.correo= correo;
    }
    
    //3. MÉTODOS DE ENCAPSULAMIENTO

    public int getCodDocente() {
        return codDocente;
    }

    public void setCodDocente(int codDocente) {
        this.codDocente = codDocente;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getExperienciaDocente() {
        return experienciaDocente;
    }

    public void setExperienciaDocente(int experienciaDocente) {
        this.experienciaDocente = experienciaDocente;
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
    
    
    // 4. MÉTODOS DE REGLA DE NEGOCIO
    
    public String IngrearNotas(){
    return "NOTAS ";
    
    }
     @Override
    public String toString() {
        return "\n DATOS DEL DOCENTE\n"+
                "N° Cédula: "+getCedula()+"\n"+
                "Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+
                "Dirección: "+getDireccion()+"\n"+
                "Teléfono: "+getTelefono()+"\n"+
                "Fecha Nacimiento: "+getFechaNacimiento()+"\n"+
                "Código Docente: "+getCodDocente()+"\n"+
                "Título Académico: "+getTituloAcademico()+"\n"+
                "Especialidad: "+getEspecialidad()+"\n"+
                "Años de experiencia: "+getExperienciaDocente()+" años"+ "\n"+
                "Salario: "+getSueldo()+" dólares"+  "\n"+
                "Seguro: "+getSeguro()+"\n" + "\n"+
                "Correo Electrónico:"+getCorreo();
        
            }
    

    }
    