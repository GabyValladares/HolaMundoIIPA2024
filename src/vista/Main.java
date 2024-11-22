/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Coche;
import modelo.Libro;
import modelo.Persona;
import modelo.Empleado;

/**
 *
 * @author Usuario
 */
public class Main {
    // 1.- DECLARAR EL MÉTODO MAIN -> LLAMA AL INTERPRETE DE JAVA
    public static void main(String[] args) {
        // CONSUMIR UN OBJETO DE TIPO COCHE
        Persona nahim = new Persona();
        nahim.setSigno("Piscis");
        Coche c1 = new Coche("IBA9613", "GRAN VITARA", "MORADO", 12_800, nahim, 2022, "AUTOMÓVIL");
        c1.imprimir();
        System.out.println(c1.toString());

        // CONSUMIR UN OBJETO DE TIPO LIBRO
        Libro libro = new Libro("Como Agua Para Chocolate", "TANIA CACUANGO", true);
        System.out.println(libro.toString());
        libro.prestamo();
        System.out.println(libro.toString());
        libro.isPrestamoDevoluvion();
        System.out.println(libro.toString());

        // CONSUMIR UN OBJETO DE TIPO EMPLEADO
        Empleado empleado1 = new Empleado("Tania", "Cacuango", "1701234567", "Desarrolladora", 1200.50);
        System.out.println("\nDatos del Empleado 1:");
        System.out.println(empleado1.toString());

//        // Modificar atributos del empleado
//        empleado1.setNombre("Gabriela");
//        empleado1.setRol("Líder de Proyecto");
//        empleado1.setSalario(1500);
//        System.out.println("\nDatos del Empleado 1 (Actualizados):");
//        System.out.println(empleado1.toString());
//
//        // Crear otro empleado con valores predeterminados
//        Empleado empleado2 = new Empleado();
//        empleado2.setNombre("Nahim");
//        empleado2.setApellido("Tirira");
//        empleado2.setCedula("1709876543");
//        System.out.println("\nDatos del Empleado 2 (Predeterminados):");
//        System.out.println(empleado2.toString());
//    }
}}
