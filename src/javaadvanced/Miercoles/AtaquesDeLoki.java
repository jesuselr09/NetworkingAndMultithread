package javaadvanced.Miercoles;

public interface AtaquesDeLoki {
    void draw();
}
class Descarga implements AtaquesDeLoki {
    @Override
    public void draw(){
        System.out.println("Descarga de energia ");
    } 
}
class Teletransportacion implements AtaquesDeLoki {
    @Override
    public void draw(){
        System.out.println("Teletransportacion ");
    } 
}
class Ilusion implements AtaquesDeLoki {
    @Override
    public void draw(){
        System.out.println("Ilusion ");
    } 
}
