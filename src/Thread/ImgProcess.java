/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import sample.pixelSample;

public class ImgProcess {

    //-------VARIABLE-------//
    private String name;

    private pixelSample[] pixelColor;
    //----------------------//

    //EMPY CONSTRUCTOR//
    public ImgProcess() {
    }
    //----------------//

    //-------NAME  ARRAY  CONSTRUCTO----------------//
    public ImgProcess(String pName, pixelSample[] pColor) {
        this.name = pName;
        this.pixelColor = pColor;
    }
    //----------------------------------------------//

    //-----------------------GET&SET-----------------------//
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public pixelSample[] getPixelColor() {
        return pixelColor;
    }

    public void setPixelColor(pixelSample[] pixelColor) {
        this.pixelColor = pixelColor;
    }
    //-----------------------------------------------------//

}
