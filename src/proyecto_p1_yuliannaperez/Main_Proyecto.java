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
        Usuario user = new Usuario();
        Actividades act = new Actividades();
        user.AgregarUsuario("Admin ", "Principal ", "user ", "1234 ");
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
}
