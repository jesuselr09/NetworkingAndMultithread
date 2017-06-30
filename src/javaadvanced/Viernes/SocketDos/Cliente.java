/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Viernes.SocketDos;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.net.Socket;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author CC-18
 */
public class Cliente {
    public static void main(String[] args) throws IOException {
        System.out.println("Ventana Cliente");
        Socket s = new Socket("localhost",6666);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    
        BufferedReader br = new BufferedReader(
                            new InputStreamReader(System.in));
        
        String str = "",str2="";
        while(!str.equals("stop")){
            str = br.readLine();
            
            dos.writeUTF(str);
            dos.flush();
            str2 = dis.readUTF();
            System.out.println("El servicio dice"+str2);
        }
        dis.close();
        dos.close();
        s.close();
    }
    
}
