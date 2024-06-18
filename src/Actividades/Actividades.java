/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Actividades {
    private String titulo; // titulo de la actividad
    private String descripcion; // descripcion de esta misma
    private String tipo; //de entretenimiento, educativa, etc
    // fecha a realizarse pero aun me falta investigar como crear un calendario
    private String prioridad; // alta, media, baja

    public Actividades() {
    }

    public Actividades(String titulo, String descripcion, String tipo, String prioridad) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.prioridad = prioridad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String setTitulo(String titulo) {
        this.titulo = titulo;
        return titulo;
    }

    public String setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return descripcion;
    }

    public String setTipo(String tipo) {
        this.tipo = tipo;
        return tipo;
    }

    public String setPrioridad(String prioridad) {
        this.prioridad = prioridad;
        return prioridad;
    }
    
    public void Eliminar(){ //Eliminaria actividades
        
    }
    public void actividadesPrioritarias(){
        
    }
    public  ArrayList Agregar(String a,String b, String c,String d) {
        ArrayList<Actividades> ArrayActividades = new ArrayList();
        Actividades nuevo = new Actividades();
        nuevo = new Actividades(nuevo.setTitulo(a),nuevo.setDescripcion(b), nuevo.setPrioridad(c), nuevo.setTipo(d));
        ArrayActividades.add(nuevo);
        System.out.println(nuevo.getTitulo()+ nuevo.getDescripcion()+ nuevo.getPrioridad()+nuevo.getTipo());
        
        return ArrayActividades;
    }    
    public boolean validaPrioridad(String tipo,ArrayList<Usuario> users){
        for (Usuario user: users) {
            if (user.getUsuario().equals(tipo)) {
                return true;
            }
        }
        return false;
    }
    
}
