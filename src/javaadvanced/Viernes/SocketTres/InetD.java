package javaadvanced.Viernes.SocketTres;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetD {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.oracle.com");
            
            System.out.println("Nombre del host: "+ip.getHostName());
            System.out.println("Direccion ip: "+ip.getHostAddress());
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
