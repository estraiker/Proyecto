package UI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelDerechoInferior extends Panel implements ActionListener {

    JLabel Canciones, tituloLabel;
    JTextField tituloField;
    JButton Agregar;
    JPanel Derechoinferior;



    public PanelDerechoInferior() {
        setLayout(new BorderLayout());

        Derechoinferior = new JPanel();
        Derechoinferior.setLayout(new BoxLayout(Derechoinferior, BoxLayout.Y_AXIS));



        tituloLabel = new JLabel("Titulo");
        tituloField = new JTextField();

        Canciones = new JLabel("Canciones");

        this.add(Canciones);

        Agregar = new JButton("Agregar");
        Agregar.addActionListener(this);

        this.add(Agregar);

        Derechoinferior.add(Canciones);
        Derechoinferior.add(Box.createRigidArea(new Dimension(10, 10)));
        Derechoinferior.add(tituloLabel);
        Derechoinferior.add(tituloField);
        Derechoinferior.add(Box.createRigidArea(new Dimension(10, 10)));
        Derechoinferior.add(Agregar);

        this.add(Derechoinferior);










    }






















    @Override
    public void actionPerformed(ActionEvent e){}
}
