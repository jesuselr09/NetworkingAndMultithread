package javaadvanced.Martes.Banco2;

public class Banco {
    double getRazaDeInteres(){
        return 0;
    }
}
class Bancomer extends Banco{
    double getRazaDeInteres(){
        return 8.4;
    }
}
class HSBC extends Banco{
    double getRazaDeInteres(){
        return 7.3;
    }
}
class BanCoppel extends Banco{
    double getRazaDeInteres(){
        return 9.7;
    }
}
class TestP{
    public static void main(String[] args) {
        Banco b;
        
        b = new Bancomer();
        System.out.println("La tasa interes "+ "de Bancomer es: "+b.getRazaDeInteres());
        
        b = new HSBC();
        System.out.println("La tasa interes "+ "de HSBC es: "+b.getRazaDeInteres());
        
        b = new BanCoppel();
        System.out.println("La tasa interes "+ "de BanCoppel es: "+b.getRazaDeInteres());
    }
}