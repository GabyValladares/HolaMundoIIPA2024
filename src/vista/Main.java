/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import modelo.Persona;
import modelo.Coche;
import java.util.Date;
import java.util.Scanner;
import modelo.Empleado;
import modelo.Administrativo;
/**
 *
 * @author Roberto2022
 */
public class Main {
    public static void main(String[] args) {
        
        // 1. IMPRIMIR HOLA MUNDO
        
        System.out.println("Hola Mundo!!!");
        
        // 1.1 Perspectiva Programación Estructurada
        // Ejercicio 1 determinar el horoscopo medisante el sigo sodiacal
        /*String signoZodiacal = "";
        
        if (signoZodiacal == "Aries") {
            System.out.println("Te vas a morir de hambre");
        } else if (signoZodiacal=="Leo") {
            System.out.println("Hoy seras la persona maás feliz del mundo");
        }else if (signoZodiacal=="Cancer") {
            System.out.println("Tendras un dia caótico es posible que te muerda un perro ");
        }else{
            System.out.println("Ingrese un signo valido");
        }
        */
        
        //1.2 Perspectiva de Programción Orientada a Objetos
        //Probar una clase 
   
       /*  
        Persona p1 = new Persona();
        
        p1.setSigno("Tauro");
        p1.setFechaNacimiento(f1);
        System.out.println(p1.determinarOroscopo() + "\n"+
                p1.getFechaNacimiento());
        */
       
       
        // OBJETO DE CLASE DATE PARA LAS FECHAS 
        
        //Date FechaNacimiento = new  Date(2004, 05, 13);
        //Date AnioVehiculo = new  Date(2001, 1, 1);
       
        // OBJETO DE LA CLASE SCANNER
        
        //Scanner sc = new Scanner(System.in);
        
        // OBJETO DE LA CLASE PERSONA
        
        //Persona p2 = new Persona();
        
            
        //2. INGRESO POR TECLADO DEL SIGNO CON EL OBJETO SCANNER
        /* 
        System.out.println("Ingrese su signo del zodiaco");
        p2.setSigno(sc.nextLine());
            
        System.out.println(p2.getSigno());
        System.out.println(p2.determinarOroscopo()); 
        
        INGRESO DE EDAD
         
        System.out.println("Ingrese su Edad: ");
        p2.determinarEdad(sc.nextInt());
        */
        
        // 3. Deber
        
        // OBJETOS DATE
        Date FechaNacimiento = new  Date(2004, 05, 13);
        Date AnioVehiculo = new  Date(2001, 1, 1);
        Date FechaNacimiento2 = new  Date(1973, 07, 16);
        // OBJETO PERSONA
        Persona p2 = new Persona(1004367601, "Roberto", "Villamar", "Ibarra", "0980064071", 
                "Tauro", FechaNacimiento);
        
        // OBJETO COCHE Constructor
        Coche c1 = new Coche("IBA-1556", "Rio", "Negro", 1000.0, p2, AnioVehiculo, "Sedan");
        c1.imprimir();
        
        System.out.println(c1.toString());
        
        
        //constructor hibrido
        Empleado ep = new Empleado(1, "Profesor", 2000.5, true, 100436863, 
                "Roberto", "Villamar", "Ibarra", "0980064071", "Aries", FechaNacimiento2);
        
        Empleado ep2 = new  Empleado();
        
        ep2.setNombre("Andres");
        ep2.setApellido("Perez");
        System.out.println(ep.toString());
        System.out.println(ep2.toString());
        
        
    }
}
