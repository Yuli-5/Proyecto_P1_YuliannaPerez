/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

/**
 *
 * @author User
 */
public class Actividades {
    private String titulo; // titulo de la actividad
    private String descipcion; // descripcion de esta misma
    private String tipo; //de entretenimiento, educativa, etc
    // fecha a realizarse pero aun me falta investigar como crear un calendario
    private String prioridad; // alta, media, baja

    public Actividades() {
    }

    public Actividades(String titulo, String descipcion, String tipo, String prioridad) {
        this.titulo = titulo;
        this.descipcion = descipcion;
        this.tipo = tipo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    public void Agregar(){ //Agregaria actividades

    }
    public void Eliminar(){ //Eliminaria actividades
        
    }
    public void actividadesPrioritarias(){
        
    }
    
    
}
