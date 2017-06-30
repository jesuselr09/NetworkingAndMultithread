/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author CC-18
 */
public class IOETest4 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\magia.txt");
            
            int i = 0;
            while ((i = fis.read())!=-1){
                System.out.println((char)i);
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
