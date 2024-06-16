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
public class Arrays {
    private ArrayList<Usuario> arrayUsers;

    public Arrays() {
        arrayUsers = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        arrayUsers.add(usuario);
    }

    public ArrayList<Usuario> getArray() {
        return arrayUsers;
    } 
    public  ArrayList ArrayUser(String a,String b, String c,String d) {
        ArrayList<Usuario> ArrayUser = new ArrayList();
        Usuario nuevo = new Usuario();
        nuevo = new Usuario(nuevo.setNombre(a),nuevo.setApellido(b), nuevo.setUsuario(c), nuevo.setPassword(d));
        ArrayUser.add(nuevo);
        System.out.println(nuevo.getNombre()+ nuevo.getApellido()+ nuevo.getUsuario()+nuevo.getPassword());
        
        return ArrayUser;
    }    
}
