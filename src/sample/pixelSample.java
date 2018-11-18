/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.awt.Color;

public class pixelSample {
    int posX;
    int posY;
    int id;
    Color color;
    
   
    public pixelSample (int id,int pX, int pY, Color pcolor) {
        this.id = id;
        this.posX = pX;
        this.posY = pY;
        this.color = pcolor;     
    }
    
    
}
