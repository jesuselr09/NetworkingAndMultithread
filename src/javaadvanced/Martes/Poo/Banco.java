
package javaadvanced.Martes.Poo;

public class Banco {
    int getRazaDeInteres(){
        return 0;
    }
}
class Bancomer extends Banco{
    @Override
    int getRazaDeInteres(){
        return 8;
    }
}

class HSBC extends Banco{
    @Override
    int getRazaDeInteres(){
        return 7;
    }
}

class BanCoppel extends Banco{
    @Override
    int getRazaDeInteres(){
        return 9;
    }
}
class PruebaBanco{
    public static void main(String[] args) {
        Bancomer b = new Bancomer();
        HSBC h = new HSBC();
        BanCoppel bc = new BanCoppel();
        
        System.out.println("Bancomer taza de interes: "+ b.getRazaDeInteres());
        System.out.println("HSBC taza de interes: "+ h.getRazaDeInteres());
        System.out.println("BanCoppel taza de interes: "+ bc.getRazaDeInteres());
    }
}