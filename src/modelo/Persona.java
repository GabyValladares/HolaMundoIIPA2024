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
public class Persona {
    //1. Declarar atributos
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String signo;
    private Date fechaNacimiento;

    // 2.1 Metodo constructor vacio
    public Persona() {
    }
    // 2.2 Metodo constructor con argumentos

    public Persona(int cedula, String nombre, String apellido, String direccion, String telefono, String signo, Date fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.signo = signo;
        this.fechaNacimiento = fechaNacimiento;
    }

    

    //3. Metodos de get y set
    
    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    
    
    
    
    public String determinarOroscopo(){
        
        if (signo.compareTo("Aries")==0) {
            return "Te vas a morir de hambre)";
        } else if (signo.compareToIgnoreCase("Leo")==0) {
            return "Hoy seras la persona más feliz del mundo";
        } else if (signo.equals("Cancer")) {
            return "Tendras un dia caótico es posible que te muerda un perro";
        } else if ("Tauro".equals(signo)) {
            return "Tendras un día muy lindo";
        } else if ("Géminis".equals(signo)) {
            return "Hoy conocerás a alguien nuevo que cambiará tu vida";
        } else if ("Virgo".equals(signo)) {
            return "Recibirás buenas noticias en el trabajo";
        } else if ("Libra".equals(signo)) {
            return "Tendrás que tomar una decisión importante hoy";
        } else if ("Escorpio".equals(signo)) {
            return "Hoy es un buen día para comenzar un nuevo proyecto";
        } else if ("Sagitario".equals(signo)) {
            return "Viajarás a un lugar que siempre quisiste conocer";
        } else if ("Capricornio".equals(signo)) {
            return "Tus esfuerzos finalmente serán recompensados";
        } else if ("Acuario".equals(signo)) {
            return "Un amigo te dará un buen consejo";
        } else if ("Piscis".equals(signo)) {
            return "Tendrás un día muy creativo y productivo";
        } else {
            return "Signo equivocado";
        }

    }
    //etapa de desarrollo
    public void determinarEdad(int Edad){
        String rsult= "";
        if(Edad >= 0 && Edad <= 5){
            rsult = "Primera infancia";
        }else if(Edad >= 6 && Edad <= 11){
            rsult = "Infancia";
        }else if(Edad >= 12 && Edad <= 18){
            rsult = "Adoleciencia";
        }else if (Edad >= 14 && Edad <= 26) {
            rsult = "Juventud";
        }else if (Edad >=19  && Edad < 40){
            rsult = "Adultez media";
        }else if (Edad >= 40 && Edad <= 60) {
            rsult = "Adultez mayor";
        }
         System.out.println("Tu etapa de desarrollo es : "+rsult);       
        
    }
    
    public void imprimir(){
        System.out.println("Datos Persona\n" + 
                "Cédula: " + cedula + "\n" + 
                "Nombres: " + nombre + " " + apellido + "\n" + 
                "Teléfono: " + telefono + "\n" + 
                "Dirección: " + direccion + "\n" + "Signo: " + signo + "\n" + 
                "Fecha de Nacimiento: " + fechaNacimiento + "\n"
                );
    } 
}
    
