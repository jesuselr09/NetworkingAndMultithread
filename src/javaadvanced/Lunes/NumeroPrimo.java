package javaadvanced.Lunes;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0,i,num;
        System.out.println("Ingrese un numero");
        
        num =sc.nextInt();
        for (i=1;i<(num+1);i++){
        if (num%i==0){
            contador++;
            }
        }
        if (contador!=2){
            System.out.println("No es Primo");
        }else{
            System.out.println("Si es Primo");
        }
    }
}
