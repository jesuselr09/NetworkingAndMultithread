/*
Clase: Conjunto de objetos con caracteristicas similares que se identifican
por nombres, atributos y una serie de funciones o metodos aplicables a todo 
el conjunto. Es una plantilla para caracterizar o definir objetos.

Abstaccion: Es la facultad intuitiva que permite conocer la escencia de las cosas.

Modularidad: Es un proceso mental que permite distribuir los componentes de los
objetos que estan siendo estudiados.

Encapsulamiento: Permite ocultar las caracteristicas no relevantes, de una clase,
destacar las reelevantes y modelar su comportamiento.Dando como resultado 
la Abstraccion de Datos.

Herencia: Relacion entre clases cuya existencia depende de un ancestro, la clase 
base delega sus atributos y metodos, a las clases derivadas.

Polimorfismo: Es el conjunto de operaciones aplicables a un objeto por medio de 
los mensajes que invoca a alguno de los metodos definidos en la clase a la que 
pertenece el objeto de acuerdo al dominio de la aplicaciom (Contexto)

Objeto: Es una entidad real o imaginaria que tiene identidad, estado, y un 
comportamiento, conforme al conjunto de objetos (clase) a la que pertenece. 
Es una  instancia de una clase.

Un objeto mujer es una instancia de una mujer con clase.
Mujer mujer = mujer Mujer();

Una clase en java contiene lo siguiente:

    campos
    metodos
    constructores
    bloques
    clases anidadas e interfaces

class <clase_name>{
    field;
    method;
}
Variables de instancia son las que hacen referencia a algo.
 Mujer mujer = new Mujer();
*/
package javaadvanced.Lunes.Poo;


public class Bike {
    
    public static void main(String[] args) {
        
        Bike bici = new Bike();  
        /*bici.setColor("Azul");
        bici.setVelocidad(6);*/
        bici.show();
        
    }
    
    public void show(){
        
        MountainBike bici = new MountainBike();
        bici.setColor("Azul ");
        bici.setVelocidad(6);
        String msg= "Soy una bici de montaña ";
        msg += "y mi color es "+ bici.getColor();
        msg += "y tengo: "+ bici.getVelocidad();
        msg += " velocidades";
        System.out.println(msg);
        
    }
}


