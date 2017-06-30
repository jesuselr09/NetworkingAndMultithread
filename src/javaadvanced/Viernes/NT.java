/*
Networking: Es un concepto de conectividad entre dos dispositivos o mas 
dispositivos juntos, que comparten recursos.

Programacion de sockets proporciona la facilidad de compartir datos entre diferentes
dispositivos.

Ventajas del Networking en Java: 
    Compartir recursos.
    Centralizar la gestion del software.

Conceptos clave:
    Direccion Ip: Numero de dinamico asignado a un nodo de una red, compuesto
por octetos que van del 0 al 255.
    Es una direccion logica que puede ser cambiada.

Protocolo: Conjunto de reglas para establecer la comunicacion: Ej. FTP,TCP,
Telnet, SMTP, POP.

Puerto: Esta asociado a la direccion ip para la comunicacion entre aplicaciones.

MAC:(Media Acces Control) Identificador unico de NIC(Network  Interface Controller).
    Un nodo de una red puede tener multiples NIC pero solo una MAC.
    Direccion fisica, estatica.

Oriented Connection Protocol:
    Es un protocolo de tip o TCP, TCP/IP, confiable pero lento. El acuse de recibo 
es enviado por el receptor.

Conection Loss Protocol:
    El receptor no envia el acuse de recio.
Es rapido, sinembargo no es confiable, pueden o no llegar los paquetes. Ej: UDP.

Socket: Punto final de una conexion bidireccional.

La programacion de sockets se utiliza para la comunicacion entre aplicaciones 
que se ejecutan en diferentes JREs. Java Runtime Enviroment.

La programacion de JavaSocket puede estar bajo ambos protocolos (OCP, OCL)

Las clases Java Socket y ServerSocket se utilizan para la programacion orientada
a la conexion.

Las clases DatagramSocket y DatagramPacket: Son usadas para la programacion de
socket sin conexion

El cliente en la programacion necesita saber:
    IP address del server
    Port Number
    Socket class
El socket es un punto final para las comunicaciones entre dispositivos.
    Socket Class
    Metodos
        Public InputStream getInputStream()regresa el is adjunto con el socket
        Public OutputStream getOutputStream() regresa el os adjunto al socket
        Public synchronized void close() cierra el socket

    ServerSocket
    Metodos
        Public Socket accept() Establece la conexion entrante
        Public synchronized void close() Cierra la conexion del servidor.
 */
package javaadvanced.Viernes;

/**
 *
 * @author CC-18
 */
public class NT {
    
}
