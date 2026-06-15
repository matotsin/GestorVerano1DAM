//main
import java.awt.*;
import javax.swing.*;

public class Principal {
   
    static JFrame jf = new JFrame("Gestor de cuentas");
   
    public static void main(String args[]) {
        
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(700, 800);
        jf.setLayout(new BorderLayout()); // BorderLayout es mejor para esto


        CardLayout cl = new CardLayout();
        JPanel contenedor = new JPanel(cl);


        contenedor.add(new PanelPerfiles(cl, contenedor), "Perfiles");
        contenedor.add(new PanelLogin(cl, contenedor), "LOGIN");
        contenedor.add(new PanelCrearCuenta(cl, contenedor), "Crear Cuenta");
        cl.show(contenedor, "Perfiles");
        jf.add(contenedor);

        //más adelante igual hay que cambiarlo y  dividirlo en una clase perfil,java

       
        jf.setVisible(true);
    }

    
}