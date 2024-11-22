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
public class Coche {
    private String placa;
    private String modelo;
    private String color;
    private double precio;
    // Clase compleja de tipo Persona
    private Persona propietario;
    private Date anio;
    private String tipVehiculo;
    
    //Constructor Vacio 
    public Coche() {
    }
    
    //Constructor con Argumentos
    public Coche(String placa, String modelo, String color, double precio, Persona propietario, Date anio, String tipVehiculo) {
        this.placa = placa;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.propietario = propietario;
        this.anio = anio;
        this.tipVehiculo = tipVehiculo;
    }
    
    // Encapsulamiento
    
    //Get
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Persona getPropietario() {
        return propietario;
    }

    public void setPropietario(Persona propietario) {
        this.propietario = propietario;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public String getTipVehiculo() {
        return tipVehiculo;
    }

    public void setTipVehiculo(String tipVehiculo) {
        this.tipVehiculo = tipVehiculo;
    }
            
    //Metodso de regla de negocio
    public void imprimir(){
        System.out.println("imprimi\nDatos del coche \n"+
                "Placa: "+placa+"\n"+
                "Modelo: "+modelo+"\n"+
                "Color: "+getColor()+"\n"+
                "Precio: "+precio+"\n"+
                "Propietario: "+ propietario.getNombre()+" "+propietario.getApellido()+"\n"+
                "Año de Fabricación: "+anio.getYear()+"\n"+
                "Tipo de vehiculo: "+ tipVehiculo+"\n");
    }
    
    @Override
    public String toString() {
        return "ToString\nDatos del coche \n"+
                "Placa: "+placa+"\n"+
                "Modelo: "+modelo+"\n"+
                "Color: "+getColor()+"\n"+
                "Precio: "+precio+"\n"+
                "Propietario: "+ propietario.getNombre()+" "+propietario.getApellido()+"\n"+
                "Año de Fabricación: "+anio.getYear()+"\n"+
                "Tipo de vehiculo: "+ tipVehiculo+"\n";
    }
    
    
    
    
}
