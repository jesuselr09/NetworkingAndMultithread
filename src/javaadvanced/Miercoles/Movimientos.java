package javaadvanced.Miercoles;


public class Movimientos extends Thread{
    public void draw(){
    }    
}

class Saltar extends Thread{
    public void draw(){
        System.out.println("Salto ");
    }
}
class Volar extends Thread{
    public void draw(){
        System.out.println("Vuelo por los aires ");
    }
}
class Esquivar extends Thread{
    public void draw(){
        System.out.println("Esquiva ataque ");
    }
}

