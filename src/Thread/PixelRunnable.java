/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import sample.pixelSample;

public class PixelRunnable implements Runnable {

    private BufferedImage imageActual;
    private int mediaPixel, colorSRGB = 0;
    private Color colorAux;
    private int pivoteX;
    private int pivoteY;
    private int pivotefX;
    private int pivotefY;
    public int id_h = 0;
    private Hashtable table;
    
    private pixelSample pixels;
    private int inicialX;
    private int inicialY;
    private int finalX;
    private int finalY;
    private int idSector;

    
    
    
    
    public PixelRunnable(int pInicialX, int pInicialY, int pFinalX, int pFinalY, Hashtable ptable) {  
        this.inicialX = pInicialX;
        this.inicialY = pInicialY;
        this.finalX = pFinalX;
        this.finalY = pFinalY;
        this.table = ptable;
        this.idSector = 0;
     
    }

    public PixelRunnable(pixelSample pixelSample) {
        
    }

    @Override
    public void run() {
       //Recorremos la imagen píxel a píxel
        for(int i = this.inicialX ; i< this.finalX ; i++ ){
            for( int j = this.inicialY; j < this.finalY; j++ ){
                
                //Almacenamos el color del píxel
                colorAux=new Color(this.imageActual.getRGB(i, j));
                
                //almacenamos los pixeles en un hastable    
                table.put(id_h, colorAux);
                id_h++;
                
            }

        }
    }

}
