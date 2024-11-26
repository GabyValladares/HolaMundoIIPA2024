/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.List;
import java.util.Scanner;
import modelo.Coche;
import modelo.Docente;
import modelo.Empleado;
import modelo.Persona;

/**
 *
 * @author Usuario
 */
public class Main {
    //1.-DECLARAR EL MÉTODO MAIN->LLAMA AL INTERPRETE DE JAVA
    public static void main(String[] args) {
        //System.out.println("HOLA MUNDO!!!");
        
        
        //PERSPECTIVA PROGRAMACIÓN ESTRUCTURADA
        //EJERCICIO 1: DETERMINAR EL HOROSCOPO MEDIANTE EL SIGNO ZODIACAL
//        String signoZodiacal="Leo";
//        if(signoZodiacal=="Aries"){
//            System.out.println("EL DÍA DE HOY TE VAS A MORIR DEL HAMBRE!!!");
//        }else if (signoZodiacal=="Leo") {
//            System.out.println("HOY SERÁS LA PERSONA MÁS FELIZ DEL MUNDO ");
//        }else if ( signoZodiacal=="Cáncer") {
//            System.out.println("TENDRÁS UN DÍA CAÓTICO PERO ES POSIBLE QUE ENCUENTRES DINERO");
//        }else{
//            System.out.println("Ingrese un signo válido");
//        }
//        
//        //PERSPECTIVA DE PROGRAMACIÓN ORIENTADA A OBJETOS
//        //PROBAR UNA CLASE
//        //DECLARAR/INSTANCIAR UN OBJETOS
//        //NombreClase nombreObjeto(variable)=new NombreClase();
//        Persona a=new Persona();
//        a.setSigno("Escorpio");
//        //TODOS LOS MÉTODOS DE RETORNO SE DEBEN IMPRIMIR PARA
//        //PODER VISUALIZAR EL VALOR CONTENIDO O ALMACENADO EN MEMORIA RAM
//        //System.out.println(a.determinarHoroscopo());
//        
//        //INSTANCIAR UN OBJETO DE TIPO SCANNER
//        //SCANNER permite capturar el ingreso de información por teclado
//        Scanner es=new Scanner(System.in);
//        //CREAR UN OBJETO DE TIPO PERSONA
//        Persona b=new Persona();
//        //System.out.println("Ingrese su signo del zodiaco:");
//       //CAPTURAR POR TECLADO Y ALMACENAR EN EL ATRIBUTO DEL OBJETO
//        b.setSigno(es.nextLine());
//       // System.out.println(b.determinarHoroscopo());
//       // System.out.println("Ingrese su edad:");
//        b.etapaDesarrollo(es.nextInt());
//        
        //CONSUMIR UN OBJETO DE TIPO COCHE
        Persona nahim=new Persona();
        nahim.setSigno("Piscis");
        nahim.setNombre("Nahim");
        nahim.setApellido("Marulanda");
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
        
        
        Empleado e1=new Empleado();
        e1.setNombre("JUAN");
        e1.setApellido("PÉREZ");
        e1.setCargo("CAJERO");
        System.out.println(e1.toString());
        
        Docente d1= new Docente();
        d1.setNombre("Deyvi");
        d1.setApellido("Tirira");
        d1.setCedula("0450102785");
        
        d1.setAniosExperiencia(5);
        d1.setTituloAcademico("Técnico");
        d1.setEspecialidad("Software");
        System.out.println(d1.toString());
        //CASTING: Es la transformación de tipos de datos 
        String x="123";
        String y="567";
        int sum=Integer.parseInt(x)+Integer.parseInt(y);
        System.out.println("La suma es:"+sum);
        
        
        //POLIMORFISMO
        Docente dd1=new Docente("Software", 10001, "Ingeniero en Sistemas", 6);
        
        System.out.println(dd1.toString());
        
        //DOWNCASTING:CREAR UNA INSTANCIA DE LA SUPERCLASE CON EL CONSTRUCTOR DE UNA SUBCLASE
        Persona xe=new Docente();
        xe.setNombre("Juan");
     
        //UPCASTING:ALMACENAR EN UN OBJETO DE TIPO SUBCLASE EL OBJETO INSTANCIADO DE LA SUPERCLASE
        Docente t= (Docente) xe;
        t.setApellido("Díaz");
        t.setEspecialidad("Matemáticas");
        System.out.println(t.toString());
         
        //COLECCIONES O ESTRUCTURAS DE DATOS :{} DE DATOS 
        
        char[] listaLetras=new char[6];
        char[] listaLetras1={'A','B','C','D','E','F'};
        Scanner es=new Scanner(System.in);
        char[] listaLetras2=new char[6];
        for (int i = 0; i <=5; i++) {
            System.out.println("Ingrese una letra");
            listaLetras2[i]=es.next().charAt(0);           
        }
        Docente[] listaDocentes=new Docente[2];
        for (int i = 0; i <listaDocentes.length-1; i++) {
            Docente j=new Docente();
            System.out.println("Ingrese un nombre");
            j.setNombre(es.next());
            listaDocentes[i]=j;  
        }
        
                
        
        
        
        
    } 
    
}
