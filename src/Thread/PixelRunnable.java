/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Hashtable;

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

    public PixelRunnable(int pInicialX, int pInicialY, int pFinalX, int pFinalY, Hashtable ptable) {
        this.pivoteX = pInicialX;
        this.pivoteY = pInicialY;
        this.pivotefX = pFinalX;
        this.pivotefY = pFinalY;
        this.table = ptable;
    }

    @Override
    public void run() {
        for (int i = pivoteX; i < pivoteX; i++) {
            for (int j = pivoteY; j < pivoteY; j++) {

                //Almacenamos el color del píxel
                colorAux = new Color(this.imageActual.getRGB(i, j));

                //Calculamos la media de los tres canales (rojo, verde, azul)
                mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);

                // almacenamos por samples
                //  pixelSample samplePix =new pixelSample(colorAux,id_h,i, j);
                //almacenamos los pixeles en un hastable por color    
                table.put(id_h, colorAux);
                id_h++;

                colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;
                //Asignamos el nuevo valor al BufferedImage
                imageActual.setRGB(i, j, colorSRGB);

            }

        }
    }

}
