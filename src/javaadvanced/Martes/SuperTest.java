
package javaadvanced.Martes;
/*
    Super es una palabra reservada en Java como una variable en referencia la cual
es usada para servir de intermediario entre la clase padre y la subclase.

Usos de super
    1.- Se puede utiliar para referir la variable de instancia de la clase padre
inmediata.
    2.- Se puede utilizar para invocar el metodo de la clase padre inmediato.
    3.- Se puede utilizar para invocar al constructor de la clase padre inmediata.
*/

class Animal{
    // Caso 3
    Animal(){
        System.out.println("Se ha creado el animal");
    }
    
    
    // Caso2
    void eat(){
        System.out.println("Comiendo croquetas");
    
    //String color = "Negro";
        }
    // Caso 1
    String color = "Blanco";
     
    void dormir(){
        System.out.println("El perro se durmio");
    }
}

class Perro extends Animal{
    // Caso 3
    Perro(){
        super();
        System.out.println("Se ha creado el perro");
    }
     void llamar(){
        super.eat();
        dormir();
    }
     
     void printColor(){
        System.out.println(super.color);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        //Perro p = new Perro();
        
        //Caso 2
        new Perro().llamar();
    }
    
}
