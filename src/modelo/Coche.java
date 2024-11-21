/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Coche {

    //1.DECLARACIÓN DE ATRIBUTOS O VARIABLES GLOBALES
    private String placa;
    private String modelo;
    private String color;
    private double precio;
    //CONSUMIR UNA CLASE COMPUESTA/COMPLEJA
    //DECLARANDO EL OBJETO propietario de tipo PERSONA
    private Persona propietario;
    private int anio;
    private String tipoVehiculo;

    //2.CONSTRUCTOR//INICIALIZAR EL OBJETO
    //2.1.- Constructor Vacío: al inicializar el objeto el usuario
    // o programador pueda elegir solo ciertas características
    public Coche() {
    }
    //SOBRECARGA: 2 MÉTODOS PUEDEN TENER EL MISMO NOMBRE SIEMPRE Y CUANDO TENGAN DIFERENTE IMPLEMENTACIÓN
    //2.2.- Constructor Argumentos:Se inicializan los atributos que se declaren en el argumento
    //El contenido del argumento es una variable local

    public Coche(String placa, String modelo, String color,
            double precio, Persona propietario, int anio, String tipoVehiculo) {

        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.propietario = propietario;
        this.anio = anio;
        this.tipoVehiculo = tipoVehiculo;
    }

}
