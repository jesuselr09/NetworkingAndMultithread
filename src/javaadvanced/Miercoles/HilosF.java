/*
Hilos: Subproceso ligero, unidad pequeña de procesamiento. Es una via de 
ejecucion separada.
Los hilos son independientes, si se produce una excepcion en un hilo no afecta 
a los demas hilos y comparten un area en memoria comun.

Ventajas de usar hilos: 

    1.- No bloqueamos al usuario porque son tareas al mismo tiempo.
    2.- Podemos realizar tareas simultaneamente ahorrando tiempo.
    3.- Los hilos al ser diferentes no se afectan entre si, en caso de ocurrir,una
excepcion (Condicion anormal son exepciones) en un hilo los demas funcionan igual.

Multitarea: Proceso de ejecucion de muchas tareas simultaneamente.
Usamos la multitatea en el CPU. Se logra de dos maneras:
    1.- Multitarea basada en Proceso (Multiproceso)
    * Cada proceso tine su propia direccion en memoria, es decir, cada proceso
asigna un area de memoria separada.
    * El proceso es pesado.
    * El costo de la comunicacion entre el proceso es alto
    * Cambiar de un proceso a otro requiere de tiempo para guardar y cargar registros, 
mapas de memoria, listas de actualizacion.
    2.- Multitarea basada en hilos (Multihilo)
    * Los hilos comparten los mismo espacios en memoria para direcciones.
    * El hilo es ligero.
    * El costo de comunicacion entre hilos es bajo.

(Paralelismo) Multihilos
(Concurrencia) Es una propiedad de los sistemas para soportar multiples peticiones,
auxiliando de Multiprocesamiento y Multihilo logrando la Multitarea.

Ciclo de vida de un hilo:
    Un hilo puede encontrarse en uno de sus 5 estados.
    De acuerdo con oracle solo hay 4 en el ciclo de ejecutables (Running) no existe.
    new, runnable, non-runnable and terminated.

    1.- New: El hilo esta en este estado, si se crea una instancia de la clase
Thread pero antes de la invocacion start().
    2.- Runnable: El hilo esta aqui, despues de la invocacion del metodo start(), 
pero el ThreadScheduler (Administrador de hilos) no lo ha seleccionado como el 
hilo en ejecucion.
    3.- Running: El hilo esta aqui cuando se ha seleccionado.
    4.- Non-Runnable: (Blocked): Es el estado cuando el hilo sigue activo, sin embargo
no es apto para ejecutarse.
    5.- Terminated: Es el estado cuando el hilo ha finalizado, muerto, cuando sale
del metodo run().

Hay 2 formas de crear un hilo:
    1.- al extender de la clase Thread.
    2.- Al implementar la interface Running.

Clase Thread
    Proporciona los constructores y metodos para crear y realizar operaciones
en un hilo. La clase Thread extiende de la clase Object e implementa la interfaz
Runnable.

Constructores comunes de la clase Thread
Thread()
Thread(String name)
Thread(Runnable r)
Thread(Runnable r,String name)

Runnable 
    La interface Runnable debe ser implementada por cualquier clase cuyas intancias
esten destinadas a ser ejecutadas por un hilo.
    La interface Runnable tiene un solo metodo denominado run()
    public void run(): es usado para realizar la accion de un hilo.

Metodos Callbacks
public void run(){
    se utiliza para realizar la accion de un
}

public void start(){
    // Inicia la ejecucion del hilo.
    // La JMV llama al metodo run() del hilo
}

public void sleep(){
    //Hace que el hilo actual en ejecucion se detenga temporalmente durante el numero
especificado de milisegundos
}

public void join(){
    // Espera a eue el hilo se muera
}

public int setPriority(){
    // Cambia la priridad del hilo
}

public String getName(){
    // Regresa el nombre del hilo
}

public Thread currentThread(){
    // Devuelve la referencia al hilo en ejecucion actual
}

public int getId(){
    // Devuelve el id del hilo
}

public Thread.Sate getState(){
    // Regresa el estado actual del hilo
}

public boolean isAlive(){
    // Prueba si el hilo esta vivo
}

public void yield(){
    // Hace que el objeto del hilo actualmente, en ejecucion se detenga 
temporalmente y permita que otros hilos se ejecuten.
}

public void suspend(){
    // Deprecado: 
    Para suspender el hilo.
}

public void stop(){
    // Deprecado:
    Se utiliza para detener el hilo
}

public boolean isDaemon(){
    // Verifica si el hilo esta en un demonio.
}

public void setDaemon(){
    // Marca el hilo como un demonio.
}

public void interruot(){
    // Interrumpe el hilo
}

public boolean interrupted(){
    // Verifica si el hilo se puede interrumpir
}

public static boolean interrupted(){
    // Prueba si el hilo actual se ha interrumpido
}

 */
package javaadvanced.Miercoles;

public class HilosF extends Thread {
    @Override
    public void run(){
        System.out.println("El hilo esta corriendo");
    }
    public static void main(String[] args) {
        HilosF hilo = new HilosF();
        Thread thread = new Thread(hilo);
        thread.start();
    }
}
// Ejemplo de Runnable
class Hilos implements Runnable{

    @Override
    public void run() {
        System.out.println("El hilo de Runnable esta "+" corriendo");
    }
    public static void main(String[] args) {
        HilosF h = new HilosF();
        Thread t = new Thread(h);
        t.start();
    }
}