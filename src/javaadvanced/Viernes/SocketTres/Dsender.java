package javaadvanced.Viernes.SocketTres;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Dsender {

    public static void main(String[] args) throws Exception {
        System.out.println("Ventana Cliente");

        DatagramSocket ds = new DatagramSocket();

        String str = "Hola";
        InetAddress ip = InetAddress.getByName("127.0.0.1");

        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        ds.send(dp);
        ds.close();
    }
}
 