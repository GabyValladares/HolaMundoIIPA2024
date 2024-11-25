/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

//import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import modelo.Coche;
import modelo.Docente;
import modelo.Empleado;
import modelo.Libro;
import modelo.Persona;

/**
 *
 * @author Dell Core i7
 */
public class Main {
    //1. Declarar el método main obligatoriamente --llama al interprete de Java
    public static void main(String[] args) {
        //System.out.println("HOLA MUNDO!!");
        
        //PERSPECTIVA PROGRAMACIÓN ESTRUCTURADA
        //Ejercicio1: DETERMINAR EL HORÓSCOPO MEDIANTE EL SINO ZODIACAL
 /*       
        String signoZodiacal= "Aries";
        if(signoZodiacal == "Aries"){
            System.out.println("El día de hoy te vas a morir de hambre!!!");
        }else if (signoZodiacal== "Leo") {
            System.out.println("Hoy serás la persona más feliz del mundo!!!");
        }else if (signoZodiacal== "Cáncer") {
            System.out.println("Tendrás un día caótico pero es posible que encuentres un billete");
        }else{
            System.out.println("Ingrese un signo válido");
        }
        
        //PERSPECTIVA DE PROGRAMACIÓN ORIENTADA A OBJETOS
        //PROBAR UNA CLASE
        //DECLARAR/INSTANCIAR UN OBJETO UN OBJETO
        //NombreClase nombreObjeto(variable)= new NombreClase();
        
        Persona a= new Persona();
        a.setSigno("Leo");
        //Todos los métodos de Retorno se deben imprimir para
        //poder Visualizar el valor contenido o almacenado en la memoria
        
        System.out.println(a.determinarHoroscopo());
        
        //inicializar un objeto de tipo scanner
        //SCANNER permite capturar el ingreso de información por teclado
        Scanner es=new Scanner(System.in); //NUNCA CAMBIA
        
        //crear un objeto de tipo persona
        Persona b= new Persona();
        System.out.println("Ingrese su signo del Zodiaco");
        //capturar por teclado y almacenar en el atributo del objeto signo
        b.setSigno(es.nextLine()); //
        System.out.println(b.determinarHoroscopo());
        System.out.println("Ingrese su edad");
        //capturar por teclado y almacenar en el atributo del objeto edad
        b.etapaDesarrollo(es.nextInt());

 */       
         //CONSUMIR UN OBJETO DE TIPO COCHE
        Persona nahim=new Persona();
        nahim.setSigno("Piscis");
        
        Persona fer= new Persona();
        fer.setApellido("Alcusir ");
        fer.setNombre("Fernanda");
   
     
        Coche c1=new Coche("IBA9613", "GRAN VITARA", "MORADO", 12.800,fer , 2022, "AUTOMÓVIL");
        c1.imprimir();
        System.out.println(" ");
        System.out.println("DATOS CON toString ");
        System.out.println(c1.toString());
        c1.toString();
        
        //CONSUMIR UN OBJETO DE TIPO LIBRO
        System.out.println(" "); 
        Libro l1=new Libro("1","Cálculo Diferencial","Dennis Zill","Reverté",2008);
        l1.imprimir();
        System.out.println(" ");
        //System.out.println("DATOS CON toString ");
        //System.out.println(l1.toString());
        //l1.toString();
        

        //CONSUMIR UN OBJETO DE TIPO EMPLEADO
        Empleado e1=new Empleado();
        e1.setNombre ("JUAN");
        e1.setApellido ("PÉREZ");
        e1.setCargo("CAJERO");   
        System.out.println(e1.toString());
        
        //CONSUMIR UN OBJETO DE TIPO DOCENTE
        Docente d1=new Docente();
        d1.setCedula("1003188197");
        d1.setDireccion("Alpachaca");
        d1.setTelefono("098630941");
        d1.setNombre ("María");
        d1.setApellido ("Luna"); 
        d1.setCodDocente (01);
        d1.setTituloAcademico ("Ciencias de la Educación");
        d1.setEspecialidad ("Informática") ;
        d1.setExperienciaDocente (3);
        d1.setSueldo (850.00);
        d1.setSeguro(true);
        d1.setCorreo ("maria.luna@gmail.com");
        System.out.println(d1.toString());

        
         //DEBER
        //CLONAR Y CREARSE SU PROPIA RAMA
        //1) Reconstruir la Clase persona con atributos personalizados tomando en cuenta que nombre y apellido son atributos separados
        //2) Método imprimir y toString va a mostrar el nombre y apellido del propietario
        //3) Solucionar la impresión del toString
        //4) Implementar la Clase Libro: Crea una clase Libro con los métodos préstamo, devolución y toString. 
                //La clase contendrá un constructor por defecto, un constructor con parámetros y los métodos getters y setters.
        //5) Crea una clase Empleado. Generar la abstracción de esta clase.
        //6) Diagrama de Clases 
        //7) Versionar en mi repositorio https://github.com/GabyValladares/HolaMundoIIPA2024
        
         //CONSUMIENDO UN OBJETO 
    

        
         
    }
   // public void holaMundo(){
   // }
    
   
    
}

