/*
La clase Java BufferedOutputStream se utiliza para almacenar en bufer un stream 
de salida.
Internamente utiliza un buffer para almacenar datos directamente en un stream.
Añade mas eficiencia que escribir datos de manera directa en un flujo.Por lo 
tanto logra un mejor rendimiento.

Tiene 2 constructores:
    BufferedOutputStream(OutputStream os):
    Crea un nuevo flujo de almacenado en bufer. Que se utiliza para escribir los 
datos en el stream especificado.
    BufferedOutputStream(OutputStream os, int size)
Cre un nuevo flujo de salida de almacenamiento en bufer.Que se utiliza para 
escribir datos en el stram especifico el tamaño del bufer.

Metodos:
    void write(int b): Escribe el byte especifico en el stream de salida
almacenado en el bufer.

void write(byte[] b, int off, int ien):
    Escribe los bytes de la secuencia de stream en bytes especificada en un 
arreglo de bytes.
Comienza con el despazamiento dado.

void flush(): Borra el flujo de salida almacenado en bufer.
    Vacia los datos de una secuencia y la envia a otra se necesita si se ha conectado 
en una secuencia con otra.

 */
package javaadvanced.Jueves;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author CC-18
 */
public class IOTest5 {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\magia.txt");
            BufferedOutputStream bout = new BufferedOutputStream(fos);
            String s = "Hola \n a todos";
            byte[]b= s.getBytes();
            
            bout.write(b);
            bout.flush();
            
            bout.close();
            fos.close();
            System.out.println("Listo");
            
            
        }catch(IOException ioe) {
            System.out.println(ioe);
        }
    }
}
