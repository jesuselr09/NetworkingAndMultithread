/*
Relacion entre clase: Agregacion HAS-A
 */
package javaadvanced.Martes;

public class Usuario {
    int id;
    String nombre;
    Direccion direccion;
    
    Usuario(int id, String nombre, Direccion direccion){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    void show(){
        System.out.println(id+" "+nombre);
        System.out.println(direccion.ciudad+ " \n"+direccion.estado+" \n"
        +direccion.pais);
    }
    public static void main(String[] args) {
        Direccion dir = new Direccion("Culiacan","Sinaloa","Mexico");
        Direccion dir2 = new Direccion("Leon","Guanajuato","Mexico");
        
        Usuario u = new Usuario(111,"Adrian", dir);
        Usuario u2 = new Usuario(112,"Fer", dir2);
        
        u.show();
        u2.show();
    }
}
class Direccion{
    String ciudad, estado, pais;
    
    Direccion(){
    
    }
    Direccion(String ciudad, String estado, String pais){
        this.ciudad = ciudad;
        this.estado = estado;
        this.pais = pais;
    }
    
}
