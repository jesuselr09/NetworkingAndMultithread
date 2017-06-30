/*
    La sentencia switch nos permite evaluar una declaracion para multiples condiciones.
    Remplazando a un if else anidado nivel 6
*/
package javaadvanced.Lunes;

public class SwitchSample {

    public static void main(String[] args) {

        int num = 20;
        char opc = 'a';
        switch (num){
            case 10:
                System.out.print("10");
            break;
            case 20:
                System.out.print("20");
                break;
            case 30:
                System.out.print("30");
                break;
            default:
                System.out.print("No esta en 10,20,30");
        }
        
        switch(opc){
            case 'a':
            case 10:
                System.out.print("La opcion es a");
            break;
            case 'b':
                System.out.print("La opcion es b");
                break;
            case 'c':
                System.out.print("La opcion es c");
                break;
            default:
                System.out.print("Seleccion no valida");
        }
    }
}
