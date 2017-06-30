package javaadvanced.Miercoles.Banco3;

interface Bank { 
    
    int getTasaDeInteres();
}
class HSBC1 implements Bank{

    @Override
    public int getTasaDeInteres() {  
        return 7;
    }
}
class BanCoppeL implements Bank{

    @Override
    public int getTasaDeInteres() {  
        return 9;
    }
}
class BancomeR implements Bank{

    @Override
    public int getTasaDeInteres() {  
        return 8;
    }
}
class TestBank{
    public static void main(String[] args) {
        Bank a,b,c;
        
        a = new HSBC1();
        System.out.println("Tasa de interes: "+a.getTasaDeInteres());
        
        b = new BanCoppeL();
        System.out.println("Tasa de interes: "+b.getTasaDeInteres());
        
        c = new BancomeR();
        System.out.println("Tasa de interes: "+c.getTasaDeInteres());
    }
}