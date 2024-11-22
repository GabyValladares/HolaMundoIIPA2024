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
public class Persona {
    //1. Declarar los atributos de tipo privados
    private String signo;
    private Date fechaNacimiento;
    
    private String cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private String Telefono;
    
    //2. Generar los métodos constructores
    public Persona(){ //ctrl + espacio
    
    }
    //3. Métodos de encapsulamiento
    // clic derecho, insertar codigo, 
    // Método de retorno-> Devuelve cadena
    public String getSigno() {
        return signo;
    }
    // Método de no retorno --> Almacena una información
    public void setSigno(String signo) {
        //THIS. ---> es un puntero que hace referencia a la clase
        //en la que estamos trabajando y accede directamente a
        // atributos o métodos
        this.signo = signo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
    //4. METODO DE REGLA DE NEGOCIO
    public String determinarHoroscopo(){
        // solo para compraciones de cadena devuelve un entero 0 si es igual, !=0 si no es igual
        if (signo.compareToIgnoreCase("Aries")==0) {
            return "No dejes que las reacciones de los demás te desanimen.";  
            // compara sin importar como las mayúculas o minúsculas
        }else if (signo.compareToIgnoreCase("Leo")== 0) {
            return("Esta semana sentirás una poderosa conexión mental con tu autoexpresión creativa. ");
            //asume que la condición va a ser verdadera, devuelve un booleano true si es igual, false si no es igual
        }else if (signo.equals("Sagitario")) {
            return("Es momento de ser directa y comunicar tus necesidades e intereses.");
            //no es necerio poner true
        }else if (signo.equals("Geminis")== true) {
            return("Estás en condiciones de aprender mucho sobre ti misma escuchando a los demás. s");
        }else if (signo.compareToIgnoreCase("Cáncer")==0) {
            return("Hasta el 6 de diciembre Marte estará energizando tu zona de finanzas, así que noviembre es para esforzarte en ganar dinero o hacer tu vida más cómoda y segura. ");
        }else if (signo.compareToIgnoreCase("Escorpio")==0) {
            return("Tómate tu tiempo al tomar decisiones. ");
        }else if (signo.equals("Capricornio")) {
            return("Este es un buen período para prestar más atención a los placeres, los mimos y el disfrute que tú misma te regalas.");
        }else if (signo.equals("Libra")) {
            return("Durante noviembre podrías tener que lidiar con la tecnología más de lo habitual. ");
        }else if (signo.compareTo("Tauro")==0) {
            return("Este fin de semana, con el Sol en tu zona de asociación, tu ego y tu orgullo están ligados a la forma en que te relacionas con los demás.");
        }else if (signo.compareToIgnoreCase("Virgo")==0) {
            return("Tu mente se ve nublada por tus emociones este mes, y puedes tomar decisiones en función de lo que sientes. ");
        }else if (signo.compareToIgnoreCase("Acuario")==0) {
            return("No inicies una relación romántica de forma precipitada.");
        }else if (signo.compareToIgnoreCase("Piscis")==0) {
            return("Más que en cualquier otro momento del año, te sientes más aventurera y dispuesta a dar un salto de fe. ");
        }
        return "No existe coinsidencias";
    }
    
    //etapa de desarrollo
    public void etapaDesarrollo(int edad){
        String resultado="";
    
        if(edad>=0 && edad<=5){
            resultado= "Primera infancia";
        }else if (edad>=6 && edad<=11) {
            resultado ="Infancia";
        }else if (edad>=12 && edad<=18) {
            resultado ="Adolescencia";
        }else if (edad>=14 && edad<=26) {
            resultado ="Juventud";
        }else if (edad>=19 && edad<40) {
            resultado ="Adultez Temprana";
        }else if (edad>=40 && edad<60) {
            resultado ="Adultez Media";
        }else if (edad>60) {
            resultado ="Adultez Mayor";
        }
        System.out.println("La etapa de desarrollo es: "+ resultado);
    }
    
    
    
    
}
