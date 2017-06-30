package javaadvanced.Martes;
/*
    La herencia: es un mecanismo que permite que un objeto adquiera todas las 
propiedades y comportamientos de un objeto padre.

La idea de la herencia es que puedas crear nuevas clases a partir de las ya 
existentes.
Existen diversas clasificaciones de relacion en la herencia.

Relaciones entre clases: Asociacion, Composicion, Agregacion, Herencia.

Hay un termino que permite distinguir los distintos tipos de relaciones, llamado 
ACOPLAMIENTO.

-Medida de la dependencia que hay entre 2 modulos, existen grados de 
acoplamiento(bajo o alto).

-Cada clase y metodo hace una sola cosa y la hace bien (COHESION). Numero de
tareas que tiene cada clase o metodo.

Es deseable que 2 o mas modulos de un programa mantengan alta cohesion y bajo 
acoplamiento.

Relaciones entre clases:
Asiciacion: Cuando entre 2 o mas clases se da una interaccion que no modifica
en nada el comportamiento de los objetos antes o despues de terminarda la 
relacion.

La asociacion es un modo de interaccion entre objetos donde uno utiliza los
servicios de otro a corto plazo.

La asociacion es una relacion de objetos debilmente acoplados.

Agregacion (Tiene un): Es una relacion de objetos que afecta el comportamiento 
entre ellos mientras que dura la relacion. Es decir un objeto depende de los 
servicios de otro a largo plazo.

Composicion: Cuando un objeto complejo usa otros objetos permanentemente. La
composicion es una relacion entre objetos cuya esencia tiene sentido solo 
cuando ellos estan acoplados.
Por ultimo podemos decir que la composicion es un tipo de agregacion a muy largo
plazo.

Herencia:Cuando un objeto tiene las caracteristicas de otro permanentemente,
tendremos una relacion entre objeto intimamente acoplados cuya existencia
depende de un ancestro irrenunciablemente.

*/
// Relacion de Asociacion IS-A
public class Empleado {
    double salario = 40000;
}

class Programador extends Empleado{
    int bono = 1000;
    public void main() {
        Programador p = new Programador();
        System.out.println("El salario del programador es: "+ p.salario);
        System.out.println("El bono del programador es: "+ p.bono);
    }
    void mensaje(){
        System.out.println("Soy un programador");
        main();
    }
}
// Herencia simple es de Empleado a Programador
// Herencia multinivel Empleado a Programador - Web
// Herencia jerarquica Empleado a Programador y
// Empleado a Web
class Web extends Programador{
    public static void main(String[] args) {
        Web w = new Web();
        w.mensaje();
    }
}