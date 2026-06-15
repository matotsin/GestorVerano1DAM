import java.awt.*;
import javax.swing.*;

public class PanelCrearCuenta extends JPanel {


    public PanelCrearCuenta(CardLayout cl, JPanel contenedor) {

        setLayout(new GridLayout(3,2));

        //Usuario
        JLabel l1 = new JLabel("Nombre de Usuario: ", SwingConstants.CENTER);
        add(l1);
        JTextField usuario = new JTextField(30);
        add(usuario);

        //Contraseña
        JLabel l2 = new JLabel("Contraseña: ", SwingConstants.CENTER);
        add(l2);
        JPasswordField contr = new JPasswordField(30);
        add(contr);


        JButton volver = new JButton("Volver");
        add(volver);
        JButton crear = new JButton("Crear Cuenta"); // n Botón
        add(crear);

        volver.addActionListener(l->{
            cl.show(contenedor, "Perfiles");
        });
    }
}