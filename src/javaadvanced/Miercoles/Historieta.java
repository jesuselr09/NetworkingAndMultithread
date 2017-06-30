package javaadvanced.Miercoles;

import java.awt.Component;
import javax.swing.*;
import java.awt.event.*;

public class Historieta extends Thread{
    @Override
    public void run(){
       
         
        
        Thor t = new Thor();
        Loki l = new Loki();
//        Movimientos m = new Movimientos();
        Saltar s = new Saltar();
        Volar v = new Volar();
        Esquivar e = new Esquivar();
        Curacion c = new Curacion();
        SuperVelocidad ve = new SuperVelocidad();
        Descarga d = new Descarga();
        Teletransportacion tele = new Teletransportacion();
        FuersaSobreHumana f = new FuersaSobreHumana();
        LluviaTruenos ll = new LluviaTruenos();
        Ilusion i = new Ilusion();
        DialogoThor dt = new DialogoThor();
        DialogoLoki dl = new DialogoLoki();
        DialogoLoki1 dl1 = new DialogoLoki1();
        Imagenes img = new Imagenes();// thor contra loki

        
        
        //Loki
        l.draw();
        dl.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        img.show();
        
        //Thor
        t.draw();       
        dt.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }

        //Loki
        l.draw();
        dl1.draw();
        s.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Thor
        t.draw();
        s.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Loki
        l.draw();
        d.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Thor
        t.draw();
        ve.draw();
        e.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Loki
        l.draw();
        tele.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Thor
        t.draw();
        ll.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Loki
        l.draw();
        e.draw();
        i.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Thor
        t.draw();
        f.draw();
        v.draw();
        try{
            Thread.sleep(1000);
                
            }catch(InterruptedException ie){
        }
        //Loki
        l.draw();
        c.draw();
    }
    public static void main(String[] args) {
        Historieta h = new Historieta();
        h.start();
        
    }
}

class Imagenes1 extends JFrame {

    ImageIcon imagen = new ImageIcon("C:\\thorvsloki.jpg");
    
    JLabel etiqueta = new JLabel(imagen);

    public Imagenes1() {
        super("Imagen");
        Component add;
        add = getContentPane().add(etiqueta);
        this.setSize(1000, 700);
    }

    public static void main(String H[]) {
        Imagenes img = new Imagenes();

        img.show();
      

        img.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });
    }
}

