package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelIzquierdo extends JPanel implements ActionListener {

    JButton botonCrear;
    JPanel izquierdo, derecho;
    JTextField listanueva;
    JLabel Playlist;
    JTextArea  lista;

    public PanelIzquierdo() {
        setLayout(new BorderLayout());


        izquierdo = new JPanel();
        izquierdo.setLayout(new BoxLayout(izquierdo, BoxLayout.Y_AXIS));



        botonCrear = new JButton("Crear");
        //le agrego un action listener (una funcion que responde por los eventos) al boton:
        botonCrear.addActionListener(this);
        //establecemos un nombe de comando para el botón
        botonCrear.setActionCommand("CREAR");

        this.add(botonCrear);


        listanueva = new JTextField("Lista nueva");
        listanueva.addActionListener(this);
        listanueva.setActionCommand("LISTANUEVA");

        this.add(listanueva);

        Playlist= new JLabel("Playlist");


        this.add(Playlist);

        lista = new JTextArea("Lista 1");
        lista.setPreferredSize(new Dimension(200, 10));

        this.add(lista);

        izquierdo.add(Playlist);
        izquierdo.add(Box.createRigidArea(new Dimension(10, 10)));
        izquierdo.add(lista);
        izquierdo.add(Box.createRigidArea(new Dimension(10, 10)));
        izquierdo.add(listanueva);
        izquierdo.add(Box.createRigidArea(new Dimension(10, 10)));
        izquierdo.add(botonCrear);


        add(izquierdo, BorderLayout.WEST);

        this.add(izquierdo);

        derecho = new JPanel(new BorderLayout());

        PanelDerechoSuperior PanelDerechosuperior = new PanelDerechoSuperior();
        PanelDerechoInferior PanelDerechoInferior = new PanelDerechoInferior();


        derecho.add(PanelDerechosuperior, BorderLayout.NORTH);
        derecho.add(PanelDerechoInferior, BorderLayout.SOUTH);


























    }


    @Override
    public void actionPerformed(ActionEvent e) {

        //obtener etiqueta dle elemento que disparo el evento:
        String command = e.getActionCommand();

        switch (command) {

            case "CREAR":
                System.out.println(" se dio click en CREAR");
                break;
            case "GUARDAR":
                System.out.println(" se dio click en GUARDAR");
                break;
        }

    }
}