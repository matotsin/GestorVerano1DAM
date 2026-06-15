
import java.awt.*;
import javax.swing.*;

public class PanelLogin extends JPanel{

    public PanelLogin(CardLayout cl, JPanel contenedor)
    {
        setLayout(new FlowLayout());
        add(new JLabel("Contraseña", SwingConstants.CENTER));
        JPasswordField contr = new JPasswordField(20);
        add(contr);

        JButton login = new JButton("Acceder");
        add(login);

        JButton volver = new JButton("Volver");
        add(volver);

        login.addActionListener(l-> {

            cl.show(contenedor, "Gestor");
        });

        volver.addActionListener(e-> {
            cl.show(contenedor, "Perfiles");
        });

    }


}