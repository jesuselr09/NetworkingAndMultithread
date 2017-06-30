/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Lunes.Poo;

/**
 *
 * @author CC-18
 */
public class MountainBike {
    int velocidad;
    String color;

    public int getVelocidad() {
        return velocidad;
    }

    protected boolean setVelocidad(int velocidad) {
        if (velocidad > 0){
            this.velocidad = velocidad;
            return true;
        }else {
            return false;
        } 
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
