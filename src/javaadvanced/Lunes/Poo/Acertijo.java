package javaadvanced.Lunes.Poo;

public class Acertijo {
    
    public static void main(String[] args) {
        
        Acertijo Adivinanza = new Acertijo();
        Adivinanza.show();
    
    }
    public void show(){
        
        Taza tasa = new Taza();
        Fb fb = new Fb();
        Cafe cafe = new Cafe();
        fb.setColor("ROJO ");
        tasa.setColor("NARANJA ");
        cafe.setRegion("AMERICANO ");
        
        //tasa.setVolumen(0);
        String msg="Se me cayó un arete ";
        msg +="de color "+ fb.getColor();
        msg +="mientras preparaba mi café en la taza ";
        msg +="de color "+ tasa.getColor();
        msg +="con café  "+ cafe.getRegion();
        msg +="y este no se mojo "+ tasa.getVolumen();
        
        System.out.println(msg);
}
public class Taza{
    String volumen;
    String color;
        
        public String getVolumen() {
            return volumen;
        }

        public String setVolumen() {
            return volumen;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

}

public class Fb{
    String Arete;
    String Color;
    String Material;

        public String getArete() {
            return Arete;
        }

        public void setArete(String Arete) {
            this.Arete = Arete;
        }

        public String getColor() {
            return Color;
        }

        public void setColor(String Color) {
            this.Color = Color;
        }

        public String getMaterial() {
            return Material;
        }

        public void setMaterial(String Material) {
            this.Material = Material;
        }
    

    
}
public class Cafe{
    String color, region;

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }
    
}

}