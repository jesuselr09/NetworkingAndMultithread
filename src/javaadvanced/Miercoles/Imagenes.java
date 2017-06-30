package javaadvanced.Miercoles;

import javax.swing.*;
import java.awt.event.*;

public class Imagenes extends JFrame {

    ImageIcon imagen = new ImageIcon("C:\\thorvsloki.jpg");
    ImageIcon imagen1 = new ImageIcon("C:\\thor.jpg");

    JLabel etiqueta = new JLabel(imagen);

    public Imagenes() {
        super("Imagen");
        getContentPane().add(etiqueta);
        
        this.setSize(1000, 700);      
    } 

    public static void main(String H[]) {
        Imagenes p = new Imagenes();

        p.show();

        p.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });       
    }
}

