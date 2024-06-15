/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_p1_yuliannaperez;

import Actividades.Usuario;
import Paneles.Login;
import java.util.ArrayList;

public class Main_Proyecto {

    public static void main(String[] args) {
        Usuario nuevo = new Usuario();
        ArrayList<Usuario> usuarios = new ArrayList();
        Login login = new Login();
        login.setBounds(20, 10, 950,710);
        login.setLocationRelativeTo(null);       
        login.setVisible(true); 
        
       
    }
    
}
