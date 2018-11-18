package imgBuild;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import percentage.extractPixel;
import sample.pixelSample;

public class ProcessImage {

    //---------VARIABLES-------------//
    private BufferedImage imageActual;
    private int mediaPixel, colorSRGB = 0;
    private Color colorAux;
    private int pivoteX;
    private int pivoteY;
    private int id_h = 0;
    private int id_t = 0;
    
    private pixelSample[] extract1;
    private pixelSample[] extract2;
    private pixelSample[] extract3;
    private pixelSample[] extract4;
    private pixelSample[] extract5;
    private pixelSample[] extract6;
    private pixelSample[] extract7;
    private pixelSample[] extract8;
    private pixelSample[] extract9;

    //--------------------------------//
    //---------------INSTANCE ARRAY---------------//
    extractPixel pixel1 = new extractPixel();
    extractPixel pixel2 = new extractPixel();
    extractPixel pixel3 = new extractPixel();
    extractPixel pixel4 = new extractPixel();
    extractPixel pixel5 = new extractPixel();
    extractPixel pixel6 = new extractPixel();
    extractPixel pixel7 = new extractPixel();
    extractPixel pixel8 = new extractPixel();
    extractPixel pixel9 = new extractPixel();
    
    //-------------------------------------------//

    //-----------------------HASH--SAMPLES---SECTOR--------------//
    Hashtable<String, String> sector1 = new Hashtable<String, String>();
    Hashtable<String, String> sector2 = new Hashtable<String, String>();
    Hashtable<String, String> sector3 = new Hashtable<String, String>();

    Hashtable<String, String> sector4 = new Hashtable<String, String>();
    Hashtable<String, String> sector5 = new Hashtable<String, String>();
    Hashtable<String, String> sector6 = new Hashtable<String, String>();

    Hashtable<String, String> sector7 = new Hashtable<String, String>();
    Hashtable<String, String> sector8 = new Hashtable<String, String>();
    Hashtable<String, String> sector9 = new Hashtable<String, String>();
    //----------------------------------------------------------//

    //-----------------------------PROCES SECTOR IMG----------------------------------------------//
    public void sector(int pInicialX, int pInicialY, int pFinalX, int pFinalY, Hashtable table) {

        //------------------------------ARRAY IMG  LOOP-----------------------------------------//
        for (int i = pInicialX; i < pFinalX; i++) {
            for (int j = pInicialY; j < pFinalY; j++) {

                //SAVE COLOR PIXEL
                colorAux = new Color(this.imageActual.getRGB(i, j));

                //PROM(RGB)
                mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);

                //----------------GREATE SAMPLE PIXEL-------------------//
                //---------------------------------ID--X--Y--COLOR------//
                pixelSample dato = new pixelSample(id_h, i, j, colorAux);
                //-----------------------------------------------------// 
               
                //--------------------SAVE SAMPLE PIXEL HASH------------------//
                table.put(id_h, dato);
                id_h++;//INC ID
                //------------------------------------------------------------// 

                //CANGHE COLOR
                colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;

                //---------SET NEW COLOR---------//
                imageActual.setRGB(i, j, colorSRGB);
                //-------------------------------//

            }

        }
        //--------------------------------------------------------------------------------//
    }

    //---------------------------DRAWLINEX----------------------------------//
    public void limitX(int pFinalX, int pY) {
        for (int i = 0; i < pFinalX; i++) {
            colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;
            imageActual.setRGB(i, pY, colorSRGB);
        }
    }
    //----------------------------------------------------------------------//

    //---------------------------DRAWLINEY----------------------------------//
    public void limitY(int pFinalY, int pX) {
        for (int i = 0; i < pFinalY; i++) {
            colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;
            imageActual.setRGB(pX, i, colorSRGB);
        }
    }
    //-----------------------------------------------------------------------//

    public BufferedImage escalaGrises(int n, int m) {

        pivoteX = imageActual.getWidth() / n;
        pivoteY = imageActual.getHeight() / m;

        //---------------DRAWLINEX-----------------//
        limitX(imageActual.getWidth(), pivoteY);
        limitX(imageActual.getWidth(), pivoteY * 2);
        //----------------------------------------//

        //----------------DRAWLINEY------------------// 
        limitY(imageActual.getHeight(), pivoteX);
        limitY(imageActual.getHeight(), pivoteX * 2);
        //----------------------------------------//

        // ArrayList<pixelSample> pixeles = new ArrayList<pixelSample>();
        /////////////////////-----------SECTORS------------/////////////////////
        //-----------------------inico (x,y) ,  final(x,y)-------------------//
        //01
        sector(0, 0, pivoteX, pivoteY, sector1);
        extract1 = pixel1.datos(sector1, id_h,id_t);
        id_t = id_h;
         
        //02
        sector((imageActual.getWidth() / n) * 1, 0, (imageActual.getWidth() / n) * 2, pivoteY, sector2);
         extract2 = pixel2.datos(sector2, id_h,id_t);
          id_t = id_h;
        
        //03
        sector((imageActual.getWidth() / n) * 2, 0, imageActual.getWidth(), pivoteY, sector3);
        ////////////////////////////////////////////////////////////////////////
        extract3 = pixel3.datos(sector3, id_h,id_t);
         id_t = id_h;
        //-------------------------inico (x,y) , final(x,y)-------------------//
        //11
        sector(0, (imageActual.getHeight() / m) * 1, pivoteX, (imageActual.getHeight() / m) * 2, sector4);
        extract4 = pixel4.datos(sector4, id_h,id_t);
         id_t = id_h;
        //12
        sector((imageActual.getWidth() / n) * 1, (imageActual.getHeight() / m) * 1,
                (imageActual.getWidth() / n) * 2, (imageActual.getHeight() / m) * 2, sector5);
        extract5 = pixel5.datos(sector5, id_h,id_t);
         id_t = id_h;
        //13
        sector((imageActual.getWidth() / n) * 2, (imageActual.getHeight() / m) * 1,
                imageActual.getWidth(), (imageActual.getHeight() / m) * 2, sector6);
        extract6 = pixel6.datos(sector6, id_h,id_t);
         id_t = id_h;
        ////////////////////////////////////////////////////////////////////////

        //-------------------------inico (x,y) , final(x,y)-------------------//
        //07
        sector(0, (imageActual.getHeight() / m) * 2, pivoteX, imageActual.getHeight(), sector7);
        extract7 = pixel7.datos(sector7, id_h,id_t);
         id_t = id_h;
        //08
        sector((imageActual.getWidth() / n) * 1, (imageActual.getHeight() / m) * 2,
                (imageActual.getWidth() / n) * 2, imageActual.getHeight(), sector8);
        extract8 = pixel8.datos(sector8, id_h,id_t);
         id_t = id_h;
        //09
        sector((imageActual.getWidth() / n) * 2, (imageActual.getHeight() / m) * 2,
                imageActual.getWidth(), imageActual.getHeight(), sector9);
        extract9 = pixel9.datos(sector9, id_h,id_t);
        

        ////////////////////////////////////////////////////////////////////////
        /////////////////////------------------------------/////////////////////
     
        
        

        //---RETURN IMG---//
        return imageActual;
        //----------------// 
    }

/////////////////////////////////GET&SET////////////////////////////////////////
    public BufferedImage getImageActual() {
        return imageActual;
    }

    public void setImageActual(BufferedImage imageActual) {
        this.imageActual = imageActual;
        pivoteX = imageActual.getWidth();
        pivoteY = imageActual.getHeight();
    }

    public Hashtable<String, String> getSector1() {
        return sector1;
    }

    public void setSector1(Hashtable<String, String> sector1) {
        this.sector1 = sector1;
    }

    public Hashtable<String, String> getSector2() {
        return sector2;
    }

    public void setSector2(Hashtable<String, String> sector2) {
        this.sector2 = sector2;
    }

    public Hashtable<String, String> getSector3() {
        return sector3;
    }

    public void setSector3(Hashtable<String, String> sector3) {
        this.sector3 = sector3;
    }

    public Hashtable<String, String> getSector4() {
        return sector4;
    }

    public void setSector4(Hashtable<String, String> sector4) {
        this.sector4 = sector4;
    }

    public Hashtable<String, String> getSector5() {
        return sector5;
    }

    public void setSector5(Hashtable<String, String> sector5) {
        this.sector5 = sector5;
    }

    public Hashtable<String, String> getSector6() {
        return sector6;
    }

    public void setSector6(Hashtable<String, String> sector6) {
        this.sector6 = sector6;
    }

    public Hashtable<String, String> getSector7() {
        return sector7;
    }

    public void setSector7(Hashtable<String, String> sector7) {
        this.sector7 = sector7;
    }

    public Hashtable<String, String> getSector8() {
        return sector8;
    }

    public void setSector8(Hashtable<String, String> sector8) {
        this.sector8 = sector8;
    }

    public Hashtable<String, String> getSector9() {
        return sector9;
    }

    public void setSector9(Hashtable<String, String> sector9) {
        this.sector9 = sector9;
    }

    public pixelSample[] getExtract1() {
        return extract1;
    }

    public void setExtract1(pixelSample[] extract1) {
        this.extract1 = extract1;
    }

    public pixelSample[] getExtract2() {
        return extract2;
    }

    public void setExtract2(pixelSample[] extract2) {
        this.extract2 = extract2;
    }

    public pixelSample[] getExtract3() {
        return extract3;
    }

    public void setExtract3(pixelSample[] extract3) {
        this.extract3 = extract3;
    }

    public pixelSample[] getExtract4() {
        return extract4;
    }

    public void setExtract4(pixelSample[] extract4) {
        this.extract4 = extract4;
    }

    public pixelSample[] getExtract5() {
        return extract5;
    }

    public void setExtract5(pixelSample[] extract5) {
        this.extract5 = extract5;
    }

    public pixelSample[] getExtract6() {
        return extract6;
    }

    public void setExtract6(pixelSample[] extract6) {
        this.extract6 = extract6;
    }

    public pixelSample[] getExtract7() {
        return extract7;
    }

    public void setExtract7(pixelSample[] extract7) {
        this.extract7 = extract7;
    }

    public pixelSample[] getExtract8() {
        return extract8;
    }

    public void setExtract8(pixelSample[] extract8) {
        this.extract8 = extract8;
    }

    public pixelSample[] getExtract9() {
        return extract9;
    }

    public void setExtract9(pixelSample[] extract9) {
        this.extract9 = extract9;
    }
    
   

////////////////////////////////////////////////////////////////////////////////    
}
