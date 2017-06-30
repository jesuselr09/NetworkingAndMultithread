/*
    La palabra reservada static es usada para la la administracion de memoria 
principalmente. Es aplicada a variables, metodos, bloques y clases anidadas.

La palabra static pertenece  a la clase que la instancia.

Para variables:  Se puede utilizar para referir una propuedad comun en todos los 
objetos.

La variable estatica obtiene memoria solo una vez en el area de la clase en 
el momento en que se crea.

Promueve la eficiencia en el rendimiento del programa.
 */
package javaadvanced.Martes;

public class Estudiante {
    int matricula;
    String nombre;
    static String Universidad = "UdeO";
    
    Estudiante(int m, String n){
        matricula = m;
        nombre = n;
    }
    void show(){
        System.out.println(matricula+" "+nombre+" "+Universidad);
    }
    public static void main(String[] args) {
        Estudiante s1 = new Estudiante(111,"Fer");
        Estudiante s2 = new Estudiante(112,"Jesus");
        
        s1.show();
        s2.show();
    }
}
