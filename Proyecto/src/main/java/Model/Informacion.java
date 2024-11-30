package Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Informacion extends JPanel implements ActionListener {


    JTextArea txtLista;
    JTextField txtElemento;
     ;

    public Informacion( )
    {

        txtLista = new JTextArea();
        txtElemento = new JTextField();


        //definir diagramación antes de agregar los elementos:
        this.setLayout(new GridLayout(3,1));
        this.add(txtLista);
        this.add(txtElemento);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}