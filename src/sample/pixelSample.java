/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Hashtable;




public class pixelSample {
    
    private BufferedImage imageActual;
    private int mediaPixel, colorSRGB = 0;
    private Color colorAux;
    private int pivoteX;
    private int pivoteY;
    private int pivotefX;
    private int pivotefY;
    public int id_h = 0;
    private Hashtable table;
    
    public pixelSample (int pInicialX, int pInicialY, int pFinalX, int pFinalY) {
        this.pivoteX = pInicialX;
        this.pivoteY = pInicialY;
        this.pivotefX = pFinalX;
        this.pivotefY = pFinalY;
        
    }
   
}
