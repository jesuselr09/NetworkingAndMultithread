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
public class ThreadG implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        ThreadG runnable = new ThreadG();
        ThreadGroup tg1 = new ThreadGroup("Grupo de hilos ");
        
        Thread t1 = new Thread (tg1, runnable, "uno ");
        t1.start();
        Thread t2 = new Thread (tg1, runnable, "dos ");
        t2.start();
        Thread t3 = new Thread (tg1, runnable, "tres ");
        t3.start();
        
        System.out.println("Thread Groups: "+tg1.getName());
        tg1.list();
        
    }
}
