package javaadvanced.Martes;
/*
    Firma o signatura de un metodo 
    Es lo que permite distinguir sin ambiguedad a los metodos tanto en 
declaracion como en la invocacion(Emision de mensaje) y contiene 3 elementos:

El valor de retorno (tipo) : double 
Nombre del metodo : pow
Numero, tipo y orden de los parametros
: Math.pow(x,2) Math.pow(2.x)

En la herencia ademar de producir una clase nueva basada en una antigua 
añadiendo caracteristicas adicionales (especializan);puedes extender el 
comportamiento existente de la superclase.

 si un metodo se define en la subclase de modo que el nombre, el tipo de retorno
y su lista de parametros coinciden exactamente con algun metodo de la clase 
ancestro, entonces ese nuevo metodo decimos que REDEFINE el comportamiento del 
antiguo.

Los metodos con el mismo nombre, pero diferentes lista de parametros dentro de 
la misma clase se consideran simplemente sobrecargados.
Esto provoca que el compilador utilice los argumentos proporcionados en un mensaje
oara determninar cual metodo ha de llamar.

To overload <- sobrecargar
To override <- redefinir (Sobremontar)
/To overwrite <- sobreescribir

Override: Metodo con la misma signatura en distintas clases (de una jerarquia 
de herencia)

Overload: Metodo con el mismo nombre que la clase y distinta signatura.

Reglas para redefinir metodos
1.- El tipo de retorno del metodo redefinido debe ser identico al metodo que
redefine.
2.- Un metodo redefinido no puede ser menos accesible que un metodo al que
redefine.
Superclase es publica, el redefinido no pude ser protected.
3.- Un metodo redefinido no puede lanzar excepciones diferentes al metodo que 
redefine.

Diferencia entre sobrecaga y redefinicion.
1.- La sobrecarga (overload) puede codificarse en una sola clase y la redefinicion
(override) requiere 2 o mas clases.
2.- Los metodos sobrecargados tienen distinta signatura.
3.- Los metodos redefinidos tienen la misma signatura.
//Sobrecarga

*/
public class Adder {
    //1.- Combunamos el numero de argumentos
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    //2.- Combinanado el tipo de datos
    static int suma(int c, int d){
        return c+d;
    }
    static double suma(double c, double d){
        return c+d;
    }
    
    public static void main(String[] args) {
        
        //1.- Combunamos el numero de argumentos
        System.out.println(Adder.add(111, 222));
        System.out.println(Adder.add(111, 222, 333));
        
        //2.- Combinanado el tipo de datos
        System.out.println(Adder.suma(11, 22));
        System.out.println(Adder.suma(15.1, 32.2));
    }
}
