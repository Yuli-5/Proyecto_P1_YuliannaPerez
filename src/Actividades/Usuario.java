/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Actividades;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String password;
    
        
    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String usuario, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
    }     
    public String getNombre() {
        return nombre;
    }  
   public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;

    }

    public String getPassword() {
        return password;
    }
    public String setNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }
    public String setApellido(String apellido) {
        this.apellido = apellido;
        return apellido;
    }

    public String setUsuario(String usuario) {
        this.usuario = usuario;
        return usuario;
    }

    public String setPassword(String password) {
        this.password = password;
        return password;
    }
    public void toString(String nombre,String apellido, String usuario, String Password){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(usuario);
        System.out.println(Password);
    }
    public  ArrayList ArrayUser(String a,String b, String c,String d) {
        ArrayList<Usuario> ArrayUsers = new ArrayList();
        Usuario nuevo = new Usuario(a,b,c,d);
        ArrayUsers.add(nuevo);
        System.out.println(nuevo.getNombre()+ nuevo.getApellido()+ nuevo.getUsuario()+nuevo.getPassword());
        
        return ArrayUsers;
    }    
    public boolean validate(String username, String password, ArrayList<Usuario> users){
        for (Usuario user: users) {
            if (user.getUsuario().equals(username)&& user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}

