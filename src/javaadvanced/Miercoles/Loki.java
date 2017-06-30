package javaadvanced.Miercoles;


public class Loki extends Thread{
    public void draw(){
        System.out.println("Loki: ");
    } 
}
class DialogoLoki extends Thread{
    public void draw(){
        System.out.println("Acabare contigo Thor ");
    }
}

class DialogoLoki1 extends Thread{
    public void draw(){
        System.out.println("Jamas podras vencerme ");
    }
}