/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.Banco3;

/**
 *
 * @author CC-18
 */
public interface Drawable {

    void draw();
}

class SuperHeroe implements Drawable {

    public void draw() {
        System.out.println("Dibujando a Superman");
    }
}

class SuperVillano implements Drawable {

    public void draw() {
        System.out.println("Dibujando a Lex Luthor");
    }
}

class Historia {
    public static void main(String[] args) {
        //Drawable d = new SuperHeroe(), d2 = new SuperVillano();

        Drawable d,e;
        d = new SuperHeroe();
        e = new SuperVillano();
        
        //d = new SuperVillano();
        d.draw();
        e.draw();
    }
}