/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_p1_yuliannaperez;

import Actividades.Actividades;
import Actividades.Usuario;
import Paneles.Login;
import javax.swing.JOptionPane;


public class Main_Proyecto {

    public static void main(String[] args) {
        Actividades act = new Actividades();
        Usuario usuarios = new Usuario();
        Login login = new Login();
        login.setBounds(20, 10, 950, 710);
        login.setLocationRelativeTo(null);
        login.setVisible(true);     
    }   
    
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Su informacion esta incompleta revise de nuevo", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }
    public void UsuarioIncorrecto(){
        JOptionPane.showMessageDialog(null, "Su informacion esta incorrecta, usuario no existe", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
    }    
    public void ConfirmarAgenda(){
        JOptionPane.showMessageDialog(null, "Su actividad fue creada con exito", "Atencion", JOptionPane.INFORMATION_MESSAGE);
    }      
}
