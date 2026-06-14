
import java.awt.*;
import javax.swing.*;

public class front {
    public static void main(String args[]) {
        JFrame jf = new JFrame("Gestor de cuentas");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLocationRelativeTo(null);
        jf.setSize(700, 800);
        jf.setLayout(new BorderLayout()); // BorderLayout es mejor para esto

        JPanel p1 = new JPanel();
        p1.add(new JLabel("Selecciona tu perfil", SwingConstants.CENTER));
        jf.add(p1, BorderLayout.NORTH); // el título arriba

        // test
        JPanel perfiles = new JPanel();
        perfiles.setLayout(new BoxLayout(perfiles, BoxLayout.Y_AXIS));

        for (int n = 0; n < 70; n++) {
            
            JPanel fila = new JPanel(new GridLayout(1,2));
            
            
            JLabel test = new JLabel("Perfil " + n);
            JButton acceso = new JButton("Acceder");
            
            fila.add(test);
            fila.add(acceso);
            perfiles.add(fila);
            perfiles.add(Box.createRigidArea(new Dimension(0, 15)));
        
        }

        jf.add(perfiles);
        JScrollPane scroll = new JScrollPane(perfiles); // perfiles VA DENTRO del scroll
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

        jf.add(scroll, BorderLayout.CENTER); // el scroll al centro, no perfiles
        
        
        //fin test

        JPanel p2 = new JPanel();
        
        JButton añadir = new JButton("Añadir perfil");
        añadir.setHorizontalAlignment(SwingConstants.CENTER);
        p2.add(añadir);
        jf.add(p2, BorderLayout.SOUTH);
        jf.setVisible(true);
    }
}