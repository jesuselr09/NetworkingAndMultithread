
package javaadvanced.Jueves;

/*
    La sincronizacion en Java es la capacidad de controlar el acceso de multiples 
  hilos en cualquier recurso compartido.
  
  La sincronizacion es la mejor opcion cuando queremos permitir que solo un hilo 
pueda acceder a recursos compartidos.

La sincronizacion es principalmente usada para:
    1.- Prevenir la interferencia de hilos.
    2.- Prevenir problemas de inconsistencia.
Tipos de Sincronizacion
    1.- Basada en procesos.
    2.- Hilos: Mutuamente Excluyentes
        1.- Metodo sincronizado.
        2.- Bloqueo sincronizado.
        3.- Sincronizacion estatica.

Cooperacion: Comunicacion entre hilos.
Exclusion Mutua: Ayuda a prevenir que los hilos interfieran entre si mientras 
comparten informacion.

Bloqueo: La sincronizacion se basa en una entidad interna conocida como lock
o monito. Cada objeto tiene un bloqueo asociado a el.

Por convencion un hilo necesita un acceso consisente a los campos de un objeto,
tienen que adquirir el bloqueo mediante del objeto antes de acceder a ellos y 
a continuacion liberar el bloqueo cuando se hace con ellos.

Desde java 5, el paquete java.util.concurrent.locks contiene varias implementaciones
de bloqueo.
 */

// Entender el problema de impresion en desorden
class Tabla {

   /*synchronized*/ void imprimir(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(400);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    } 
}
class Hilo1 extends Thread {

    Tabla t;

    Hilo1(Tabla t) {
        this.t = t;

    }

    public void run() {
        t.imprimir(100);
    }
}
class Hilo2 extends Thread {

    Tabla t;

    Hilo2(Tabla t) {
        this.t = t;

    }

    public void run() {
        t.imprimir(100);
    }
}

public class SyncT {
    public static void main(String[] args) {
        Tabla ob = new Tabla();
        Hilo1 t1 = new Hilo1(ob);
        Hilo2 t2 = new Hilo2(ob);
        
        t1.start();
        t2.start();
    }
}
