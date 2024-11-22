/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;
import modelo.Persona;
import modelo.Coche;
import modelo.Libro;
import modelo.Empleado;

/**
 *
 * @author Carlos
 */
public class Main {
    //1.-DECLARAR EL MÉTODO MAIN->LLAMA AL INTERPRETE DE JAVA
    public static void main(String[] args) {
        //System.out.println("HOLA MUNDO!!!");
        
        //PERSPECTIVA PROGRAMACIÓN ESTRUCTURADA
        //EJERCICIO 1: DETERMINAR EL HORÓSCOPO MEDIANTE EL SIGNO ZODIACAL
        String signoZodiacal="Aries";
        if (signoZodiacal=="Aries") {
            System.out.println("EL DÍA DE HOY TE VAS A MORIR DE HAMBRE!!!");
        }else if (signoZodiacal=="Leo") {
            System.out.println("HOY SERÁS LA PERSONA MÁS FELIZ DEL MUNDO ");
        }else if (signoZodiacal=="Cáncer") {
            System.out.println("TENDRÁS UN DÍA CAÓTICO PERO ES POSIBLE QUE ENCUENTRES DINERO");
        }else{
            System.out.println("Ingrese un signo válido");
        }
        
        
        //PROBAR UNA CLASE
        //DECLARA/INSTANCIAR UN OBJETOS
        //NombreClase nombreObjeto(variable)=new NombreClase();
        Persona a=new Persona();
        a.setSigno("Leo");
        //TODOS LOS MÉTODOS DE RETORNO SE DEBEN IMPRIMIR PARA
        //PODER VISUALIZAR EL VALOR CONTENIDO O ALMECENADO EN LA MEMORIA
        System.out.println("");
        
        //INSTANCIAR UN OBJETO DE TIPO SCANNER
        Scanner scanner=new Scanner(System.in);
        //CREAR UN OBJETO DE TIPO PERSONA
        Persona b=new Persona();
        System.out.println("Ingrese su signo del zodiaco:");
        //CAPTURAR POR TECLADO Y ALMACENAR EN EL ATRIBUTO DEL OBJETO
        b.setSigno(scanner.nextLine());
        System.out.println(b.determinarHoroscopo());
        System.out.println("Ingrese su edad:");
        b.etapaDesarrollo(scanner.nextInt());
        
        
      
        
        //CONSUMIR UN OBJETO DE TIPO DE COCHE
        Persona nahim=new Persona();
        nahim.setNombre("Carlos");
        nahim.setApellido("Gómez");
        nahim.setSigno("Piscis");
        Coche c1=new Coche("IBA9613", "GRAN VITARA", "MORADO", 12.800,nahim , 2022, "AUTOMÓVIL");
        c1.imprimir();
        c1.toString();
        
        //DEBER
        //CLONAR Y CREARSE SU PROPIA RAMA
        //1)Reconstruir la Clase persona con atributos personalizados tomando en cuenta que nombre y apellido son atributos separados
        //2) Método imprimir y toString va a mostrar el nombre y apellido del propietario
        //3) Solucionar la impresión del toString
        //4) Implementar la Clase Libro: Crea una clase Libro con los métodos préstamo, devolución y toString. La clase contendrá un constructor por defecto, un constructor con parámetros y los métodos getters y setters.
        //5) Crea una clase Empleado. Generar la abstracción de esta clase.
        //6) Diagrama de Clases 
        //7) Versionar en mi repositorio https://github.com/GabyValladares/HolaMundoIIPA2024
        
////        Persona persona = new Persona();
////        System.out.println("Ingrese su nombre:");
////        persona.setNombre(scanner.nextLine());
////        System.out.println("Ingrese su apellido:");
////        persona.setApellido(scanner.nextLine());
////        System.out.println("Ingrese su signo zodiacal:");
////        persona.setSigno(scanner.nextLine());
////        System.out.println("Ingrese su edad:");
////        int edad = scanner.nextInt();
////        scanner.nextLine(); // Consumir el salto de línea
////        persona.etapaDesarrollo(edad);
////
////        System.out.println("\nDatos de la Persona:");
////        persona.imprimir();
////        System.out.println(persona.toString());
        
        
        // LIBRO
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", "Disponible");
        System.out.println("\nDatos del Libro:");
        System.out.println(libro.toString());
        
        System.out.println("\nAcciones con el libro...");
        libro.prestar();
        System.out.println(libro.toString());
        libro.devolver();
        System.out.println(libro.toString());
        
        
//        Empleado empleado = new Empleado();
//        System.out.println("\nIngrese los datos del empleado:");
//        System.out.println("Ingrese el nombre:");
//        empleado.setNombre(scanner.nextLine());
//        System.out.println("Ingrese el apellido:");
//        empleado.setApellido(scanner.nextLine());
//        System.out.println("Ingrese el salario:");
//        empleado.setSalario(scanner.nextDouble());
//        scanner.nextLine(); // Consumir el salto de línea
//
//        System.out.println("\nDatos del Empleado:");
//        empleado.imprimir();
//        System.out.println(empleado.toString());
//              
                
    }
    public void holaMundo () {
        
    }
    
}