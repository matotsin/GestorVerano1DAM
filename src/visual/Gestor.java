import java.awt.*;
import javax.swing.*;

public class Gestor extends JPanel
{
    public Gestor(CardLayout cl, JPanel contenedor)
    {

        setLayout(new BorderLayout());
        
        // igual barra de búsqueda sería peak 
        JLabel top = new JLabel("Accede a tus cuentas", SwingConstants.CENTER);
        add(top, BorderLayout.NORTH);

        JButton volver = new JButton("Volver");
        add(volver, BorderLayout.NORTH);

        int nFilas = 5;
        int nColumnas = 2;

        //Inicio tabla
        JTable tabla = new JTable(nFilas, nColumnas);
        
        JScrollPane scroll = new JScrollPane();
        
        tabla.add(scroll);

        int i = 0; //prueba de JTable
        String[] nombres = {"Marcelo", "Agachate", "Y", "Conocelo", "brrrrr fuahhdaw"};
        
        for(String nombre : nombres)
        {
            tabla.setValueAt(nombre, i, 0);
            i++;
        }

        add(tabla, BorderLayout.CENTER);

        //tabla fin
        int Ncuentas = tabla.getRowCount();
        JLabel num = new JLabel("Número de cuentas: " + Ncuentas , SwingConstants.CENTER);
        add(num, BorderLayout.SOUTH);



        volver.addActionListener(l->{
            cl.show(contenedor, "Perfiles");
        });


        

        



    }
}