/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Jueves;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/**
 *
 * @author CC-18
 */
public class IOTest7 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\magic.txt");
        
        FileInputStream fis2 = new FileInputStream("C:\\magia.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis, fis2);
        
        int i ;
        while ((i=sis.read())!=-1){
            System.out.println((char)i);
        }
        sis.close();
        fis.close();
        fis2.close();
    }
}