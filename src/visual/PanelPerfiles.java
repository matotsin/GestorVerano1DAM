import java.awt.*;
import javax.swing.*;

public class PanelPerfiles extends JPanel{

        public PanelPerfiles(CardLayout cl, JPanel contenedor)
        {
             JPanel p1 = new JPanel();
        add(new JLabel("Selecciona tu perfil", SwingConstants.CENTER));
        add(p1, BorderLayout.NORTH); // el título arriba

        
        // test
        JPanel perfiles = new JPanel();
        perfiles.setLayout(new BoxLayout(perfiles, BoxLayout.Y_AXIS));

        String[] usuarios = {"Juli", "Marco"};
        for (String nombre : usuarios) {
            
            JPanel fila = new JPanel(new GridLayout(1,2));
            
            
            JLabel test = new JLabel(nombre);
            JButton acceso = new JButton("Acceder");
            
            fila.add(test);
            fila.add(acceso);
            perfiles.add(fila);
            perfiles.add(Box.createRigidArea(new Dimension(0, 15)));
        
        }

        add(perfiles);
        JScrollPane scroll = new JScrollPane(perfiles); // perfiles VA DENTRO del scroll
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        add(scroll, BorderLayout.CENTER); // el scroll al centro, no perfiles
        
        
        //fin test

        JPanel p2 = new JPanel();
        
        JButton añadir = new JButton("Añadir perfil");
        añadir.setHorizontalAlignment(SwingConstants.CENTER);
        p2.add(añadir);
        add(p2, BorderLayout.SOUTH);
        }

    }