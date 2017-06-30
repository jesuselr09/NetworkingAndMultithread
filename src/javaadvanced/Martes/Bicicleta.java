/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Martes;

class Vehiculo{
    void run(){
        System.out.println("El vehiculo esta corriendo");
    }
}
public class Bicicleta extends Vehiculo{
    
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        bici.run();
    }
    void run(){
        System.out.println("La bicicleta esta corriendo");
    }
}
