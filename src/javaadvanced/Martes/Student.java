/*
    Es una variable de autoreferencia.
    This tiene  usos en Java.
        1-This, se usa para referir a la variable de la clase actual.
        2-This, para invocar el metodo de una clase actual.
        3-This() para invocar al constructor de una clase (actual).
        4-This puede ser pasado como argumento en la llamada a un metodo.
        5-This se puede pasar como argumento en la llamada al constructor.
        6-This se puede utilizar para devolver la instancia de la clase actual    
            del metodo.
*/
package javaadvanced.Martes;

public class Student {
    int matricula;
    String nombre;
    String universidad;
    
    //Caso 6
    public Student(){
    }
    Student getStudent(){
        return this;
    }
    void msg(){
        System.out.println("Soy un mensaje, Caso 6");
    }
    //Caso 5
    PruebaEstudiante obj;
    
    public Student(PruebaEstudiante obj){
    this.obj = obj;
    }
    
    void s(){
        System.out.println(obj.dato);
    }
    /*
    //Constructor caso 3
    public Student (){  
            System.out.println("Soy el contructor por default");
        }
    */
    //public Student(int a){
   public Student(int matricula, String nombre, String universidad, int a){
        //3
//        int a;
//        this a = a;
//        this();
        this(matricula, nombre, universidad);
        
//        System.out.println(a);
          System.out.println(matricula + nombre + universidad);
    }
    
    //This caso 1
    public Student(int matricula, String nombre, 
                String universidad){
            this.matricula = matricula;
            this.nombre = nombre;
            this.universidad = universidad;
    }
    
    // Metodo
    void display (){
        String msg = "La matricula es: "+matricula;
        msg+="\n El nombre es: "+nombre;
        msg+="\n La universidad es: "+universidad;
        System.out.println(msg);
    }
    
    //This caso 2
    void mensaje(){
        System.out.println("Soy un mensaje, Caso 2");
        this.display();
    }
}
