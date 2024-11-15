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
public class Persona {
    //1.-DECLARAR LOS ATRIBUTOS DE TIPO PRIVADOS
    private String signo;
    private Date fechaNacimiento;
    
    //2.-MÉTODO CONSTRUCTOR

    public Persona() {
    }

   //3.-MÉTODOS DE ENCAPSULAMIENTO

    //MÉTODO DE RETORNO-> DEVUELVE CADENA
    public String getSigno() {
        //RETURN -> ALMACENA EN MEMORIA RAM ESTE RESULTADO
        return signo;
    }
    //MÉTODO DE NO RETORNO ->NO ALMACENA INFORMACIÓN
    public void setSigno(String signo) {
        //THIS-> ES UN PUNTERO QUE HACE REFERENCIA A LA CLASE
        //EN LA QUE ESTAMOS TRABAJANDO Y ACCEDE DIRECTAMENTE
        //A ATRIBUTOS O MÉTODOS
        
        this.signo = signo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //4.-MÉTODO DE REGLA DE NEGOCIO
    public String determinarHoroscopo(){
           if(signo=="Aries"){
               return "Hoy será un mal día ";
           }else if (signo=="Leo") {
            return "Caminaras por sendas peligrosas";
        }
        return "No existe coincidencia";
    }

  
    
    
}
