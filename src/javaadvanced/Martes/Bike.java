/*  
Constructor de una clase:
    Es un conjunto de instrucciones diseñando para inicializar una instancia 
de una clase. En su decladarion o encabezado puede aceptar parametros.

Bike b = new Bike();
Bike() <- Hace referencia al constructor por omision.

Antes de su ejecucion, b es null; al final de la llamada "b"  es un apuntador 
de un objeto (referencia) con espacio reservado en RAM para contener sus 
valores de atributo y sus apuntadores a metodos.

¿Por que el constructor no es un metodo?
No puedo llamar al contructor usando operador de indireccion.

Carece de un valo de retorno distinto a un apuntador.

No se puede ser REDEFINIDO ()
No puede ser declarado con un type.

 */
package javaadvanced.Martes;

public class Bike {
    //Propiedades del objeto
    int velocidad;
    String color, marca;
    
    //Declaro el constructor implicito
    public Bike(){
    
    }
    public int getVelocidad(){ return velocidad;}

    public void setVelocidad(int velocidad) {this.velocidad = velocidad;}

    public String getColor() {return color;}

    //Inmutable cuando su valor no cambia durante la ejecucion
    public void setColor(String color) {this.color = color;}
    
    public String getMarca() {return marca;}

    public void setMarca(String marca) {this.marca = marca;}

    //del programa
    public Bike(String color, int velocidad) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
    }


}
