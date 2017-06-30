/*
    Java I/O
    Entrada y salida 
    Se utiliza para procesar la entrada y salida.
    En java se utiliza el concepto Stream (flujo) para hacer las operaciones 
    de E/S sea rapidas.

    El paquete java.io contiene todas las clases necesarias para realizar 
    operaciones de entrada y salida.

    Podemos realizar el manejo de archivos a traves de Java I/O API.

Stream:
    Es un flujo de datos, que esta compuesto por bytes. Se llama stream porque 
es como un flujo de agua que sigue corriendo.

1.- System.out: flujo de salida estandar.
2.- System.in: flujo de entrada estandar.
3.- System.err: flujo de salida de error estandar.

System.out.print("Error"): 
System.err.print("Error"): 

OutputStream vs InputStream
Input: Lee
Output: Escrible

 */
package javaadvanced.Jueves;

import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest {

    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\hola.txt");
            fos.write(65);
            fos.close();
        } catch(IOException ioe){
            {
                System.out.println(ioe);
            }
        }
    }
}
