/*
ThreadPool:
Representa un grupo de hilos que estan trabajando o esperan su turno para trabajar.

Mejoran el rendimiento, porque no necesitan crear multiples instancias.

 */
package javaadvanced.Jueves;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPl implements Runnable {

    private String msg;
    
    // Constructor
    public ThreadPl(String s) {
        msg = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) msg =" + msg);

        //Call
        System.out.println(Thread.currentThread().getName() + "(End) msg =" + msg);
    }
    // Hace que aparescan los mensajes con pausa de 2 segundos
    private void processMsg() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

}

class PruebaPl{
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Executor crea los 5 hilos
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        for (int i=0 ; i < 10; i++){
            Runnable worker = new ThreadPl(" "+i);
            executor.execute(worker);
        }
        executor.shutdown();
        while(!executor.isTerminated());{}
        System.out.println("Todos los hilos se han terminado");
    }
}
