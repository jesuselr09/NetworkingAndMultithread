package javaadvanced.Miercoles;

public class Thor extends Thread{
    public void draw(){
        System.out.println("Thor: ");
    } 
}
class DialogoThor extends Thread{
    public void draw(){
        System.out.println("Te voy a encerrar en la carcel de por vida hermano ");
    }
}