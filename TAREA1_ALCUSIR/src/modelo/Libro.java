/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class Libro {
    
    //1. DECLARACION DE VARIABLES O ATRIBUTOS PRIVADAS PERO GLOBALES
    private String idLibro;
    private String tituloLibro;
    private String autorLibro;
    private String editorialLibro;
    private int anio;
    private boolean estado;
    //private boolean estado;
    
    //2. METODO CONTRUCTOR //PARA INICIALIZAR LAS VARIABLES DEL OBJETO
    //2.1.- Constructor vacío: Al inicializar el objeto el usuario
    //o programador pueda elegir solo ciertas características
    
    public Libro(){
    }
    //SOBRECARGA: 2 MÉTODOS PUEDEN TENER EL MISMO NOMBRE SIEMPRE Y CUANDO TENGAN DIFERENTE IMPLEMENTACIÓN
    //2.2.- Constructor Argumentos:Se inicializan los atributos que se declaren en el argumento
    //El contenido del argumento es una variable local
    
    public Libro(String idLibro, String tituloLibro,String autorLibro,String editorialLibro, int anio){
        this.idLibro = idLibro;
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.editorialLibro = editorialLibro;
        this.anio=anio;
        this.estado=estado;
        
    }
        //3.- ENCAPSULAMIENTO
    //get: obtener, leer o consultar un atributo

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public String getEditorialLibro() {
        return editorialLibro;
    }

    public void setEditorialLibro(String editorialLibro) {
        this.editorialLibro = editorialLibro;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void getEstado(boolean estado){
      this.estado=estado;
    }
    public void setEstado(boolean estado){
         this.estado=estado;

       }

    
    //4.-MÉTODOS DE REGLA DE NEGOCIO
    public String prestarLibro(){
    return "Libro Prestado";
        
    }
     public String devolverLibro(){
    return "Libro Dvuelto";
        
    }
    
     //IMPRIMIR O TOSTRING->IMPRIMIR
    public void imprimir(){
        System.out.println("DATOS DEL LIBRO\n"+
                "Codigo del Libro: "+idLibro+"\n"+
                "Título : "+tituloLibro+"\n"+
                "Autor : "+autorLibro+"\n"+
                "Editorial: "+editorialLibro+"\n"+
                "Año de Publicación: "+getAnio()+"\n");
    }
    
    /*
    @Override
    public String toString() {
        return "\n"+ "DATOS DEL LIBRO\n"+
                "Codigo del Libro : "+idLibro+"\n"+
                "Título : "+tituloLibro+"\n"+
                "Autor : "+autorLibro+"\n"+
                "Editorial: "+editorialLibro+"\n"+
                "Año de Publicación: "+getAnio()+"\n";}
*/
    
}
