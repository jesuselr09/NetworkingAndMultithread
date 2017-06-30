package javaadvanced.Martes;
/*
Polimorfismo
    Existen 3 formas de polimorfismo:
1.- Primitivos: Se implementa gracias a la sobrecarga de metodos.
2.- Real: Se implementa gracias a la redefinicion de metodos.
3.- Generico: Se implementa gracias a las clases generias.
"Una variable es polimorfica cuando vuelve a referirse a objetos de clases 
diferentes y en consecuencias pueden adoptar distintos comportamientos".

El polimorfismo permite desplegar comportamientos distintos en las clases de una 
jerarquia de herencia cuando ellas activan metodos con la misma firma o signatura.

Ej Empleado e = new Administrador ():
Para manipular al empleado como si fuera administrador es necesario modelar el 
tipo de la subclase.
El hecho de que una variable apuntadora a un objeto (Tal como la variable "e")
pueda referirse automaticamente a tipos multiples se llaman polimorfismo.

La JV auomaticamente selecciona el metodo apropiado a tiempo de ejecucion lo que 
se denomian "LIGADURA DINAMICA". En conclusion odas las variables tipo 
superclase concretas son polimorfismo. 
*/
class Bike2{
    void run(){
        System.out.println("running...");
    }
}

public class Polimorfismo extends Bike2{
    void run(){
        System.out.println("running safely with 60km");
    }
    public static void main(String[] args) {
        Bike2 b = new Polimorfismo();
        /*
            upcasting -> Cuando la variable de referencia refiere al objeto de 
            la clase hija 
        Class A(){}
        Class B(){} extends A{}
        A a = new B();        
        */
        b.run();
    }
}
