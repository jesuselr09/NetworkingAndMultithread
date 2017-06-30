package javaadvanced.Miercoles;
/*
    Una interface en java es un modelo de una clase.
    Tiene constantes estaticas y metodos abstractos.
    La interface en java es un mecanismo para lograr la abstraccion. Solo puede
contener metodos abstractos que carecen de implementacion.
    Tambien permite la simulacion de herencia multiple.
    Representa una relacion IS-A.
    No se puede instanciar... como las clases abstractas.
    
    Por que utilizar interfaces?
        * Para lograr la abstraccion.
        * Por inteface podemos simular la herencia multiple.
        * Para lograr un bajo acoplamiento. (que no haya dependencia)

    A partir de Java 8, la interface contiene metodos predeterminados y estaticos.
*/

abstract class Hola{
    void Hola(){
        System.out.println("Hola");
    }
    abstract void saludar();
}

interface Mostrar{
    // Que hace
    void show();
}

public class Interfaz implements Mostrar{

    @Override
    public void show() {
        System.out.println("Hola");
    }
    
    public static void main(String[] args) {
        Interfaz i = new Interfaz();
        i.show();
    }
    
}
