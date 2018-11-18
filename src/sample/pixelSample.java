/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.awt.Color;

public class pixelSample {
    //----VARIEABLE--//
    int posX;
    int posY;
    int id;
    int cantidad;
    Color color;
    //----------------//
   
    //--------------MAKE A SAMBLE PIX -----------------------//
    public pixelSample (int id,int pX, int pY, Color pcolor) {
        this.id = id;
        this.posX = pX;
        this.posY = pY;
        this.color = pcolor;
        this.cantidad = 0;
    }
     //-----------------------------------------------------//
   
    
    //------------------GET&SET------------------------//
    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    //-------------------------------------------------//
    
    
    
    
    
}
