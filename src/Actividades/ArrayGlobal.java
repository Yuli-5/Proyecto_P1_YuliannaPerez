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
public class ArrayGlobal {
    private static ArrayGlobal instancia;
    private ArrayList<Usuario> lista;

    public ArrayGlobal() {
        lista = new ArrayList();
    }

    public static ArrayGlobal getInstancia() {
        if (instancia == null){
            instancia = new ArrayGlobal();
        }
        return instancia;
    }

    public  ArrayList<Usuario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
    
}
