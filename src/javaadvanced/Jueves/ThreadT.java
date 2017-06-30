/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

/**
 *
 * @author CC-18
 */
public class ThreadT extends Thread{
    
        public void run(){
            System.out.println("Corriendo");
            System.out.println(Thread.currentThread().getName());
        }
    public static void main(String[] args) {
        Thread t1 = new Thread(), t2 = new Thread(), t3 = new Thread();         
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.setName("Hilo A");
        t2.setName("Hilo B");
        t3.setName("Hilo C");
        
        System.out.println("El nombre del hilo : "+t1.getName());
        System.out.println("El nombre del hilo : "+t2.getName());
        System.out.println("El nombre del hilo : "+t3.getName());
    }
}
