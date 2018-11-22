/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewImage;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class NewIMG {
    
    private BufferedImage imageActual;   
    private Color colorAux;
    private int colorSRGB = 0;
    int NewImageX, NewImageY;
    
    
    public void setImageActual(BufferedImage imageActual) {
        this.imageActual = imageActual;
        NewImageX = imageActual.getWidth();
        NewImageY = imageActual.getHeight();
    }
    
    
    
    
     public BufferedImage efect(ArrayList<pixelSample> bigdatax, int RDistancia, int BDistancia) {
        //------------------------------ARRAY IMG  LOOP-----------------------------------------//
        for (int i = 0; i < bigdatax.size(); i++) {
           
                //SAVE COLOR PIXEL
                colorAux = new Color(this.imageActual.getRGB(bigdatax.get(i).getPosX(), bigdatax.get(i).getPosY()));
                
                colorSRGB = (RDistancia % 256) | (colorAux.getGreen()) | (BDistancia % 256);

                //---------SET NEW COLOR---------//
                imageActual.setRGB(bigdatax.get(i).getPosX(), bigdatax.get(i).getPosY(), colorSRGB);
                //-------------------------------//
            
        }
        return imageActual;
    }
   public BufferedImage getImageActual() {
        return imageActual;
    }

}
