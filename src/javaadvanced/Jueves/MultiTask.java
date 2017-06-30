/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

/**
Entendiendo el problema... muchos hilos una sola tarea
 */
public class MultiTask extends Thread{
    public void run(){
        System.out.println("Tarea uno");
    }
    public static void main(String[] args) {
        MultiTask t1 = new MultiTask(),
                t2 = new MultiTask(),
                t3 = new MultiTask();
        
        t1.start();
        t2.start();
        t3.start();
    }
}
class M implements Runnable{

    @Override
    public void run() {
        System.out.println("Tarea uno");
    }
    
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new M());
        Thread t2 = new Thread(new M());
        
        t1.start();
        t2.start();
    }
}
class TrueMT extends Thread{
    public void run(){
        System.out.println("Tarea A");
    }
}