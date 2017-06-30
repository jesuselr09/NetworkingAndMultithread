package javaadvanced.Miercoles;

public interface AtaquesDeThor   {
        void draw();
}
class Curacion implements  AtaquesDeThor {
    public void draw(){
        System.out.println("Curacion ");
    } 
}
class SuperVelocidad implements  AtaquesDeThor {
    public void draw(){
        System.out.println("Super velocidad ");
    } 
}

class FuersaSobreHumana implements  AtaquesDeThor {
    public void draw(){
        System.out.println("Fuerza sobre humana ");
    } 
}
class LluviaTruenos implements  AtaquesDeThor {
    public void draw(){
        System.out.println("Lluvia de truenos ");
    } 
}