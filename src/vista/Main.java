/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

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
        String signoZodiacal="Leo";
        if(signoZodiacal=="Aries"){
            System.out.println("EL DÍA DE HOY TE VAS A MORIR DEL HAMBRE!!!");
        }else if (signoZodiacal=="Leo") {
            System.out.println("HOY SERÁS LA PERSONA MÁS FELIZ DEL MUNDO ");
        }else if ( signoZodiacal=="Cáncer") {
            System.out.println("TENDRÁS UN DÍA CAÓTICO PERO ES POSIBLE QUE ENCUENTRES DINERO");
        }else{
            System.out.println("Ingrese un signo válido");
        }
        
        
        //PROBAR UNA CLASE
        //DECLARAR/INSTANCIAR UN OBJETOS
        //NombreClase nombreObjeto(variable)=new NombreClase();
        Persona a=new Persona();
        a.setSigno("Escorpio");
        //TODOS LOS MÉTODOS DE RETORNO SE DEBEN IMPRIMIR PARA
        //PODER VISUALIZAR EL VALOR CONTENIDO O ALMACENADO EN MEMORIA RAM
        System.out.println(a.determinarHoroscopo());
    }
    
      
    
}
