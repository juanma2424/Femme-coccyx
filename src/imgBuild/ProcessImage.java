package imgBuild;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import percentage.extractPixel;
import sample.pixelSample;

public class ProcessImage {

    //---------VARIABLES-------------//
    private BufferedImage imageActual;
    private int mediaPixel, colorSRGB = 0;
    private Color colorAux;
    private int pivoteX;
    private int pivoteY;
    int nID =0;
    ArrayList<pixelSample> bigID = new ArrayList<>();

    public ArrayList<pixelSample> getBigID() {
        return bigID;
    }
    public int getnID() {
        return nID;
    }
    private int id_h = 0;
    private int max;

    ArrayList<pixelSample> listPixSample = new ArrayList<>();
    ArrayList<pixelSample> extract1 = new ArrayList<>();
    ArrayList<pixelSample> bigsample = new ArrayList<>();
    Map<Integer, pixelSample > mapdavid = new HashMap<Integer, pixelSample >();

    public Map<Integer, pixelSample> getMapdavid() {
        return mapdavid;
    }

    public void setMapdavid(Map<Integer, pixelSample> mapdavid) {
        this.mapdavid = mapdavid;
    }
    //--------------------------------//
    //---------------INSTANCE ARRAY---------------//
    extractPixel pixel1 = new extractPixel();
    //-------------------------------------------//

    //-----------------------HASH--SAMPLES---SECTOR--------------//
    Hashtable<String, String> sector1 = new Hashtable<String, String>();
    Hashtable<String, String> yadavid = new Hashtable<String, String>();
    
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
                listPixSample.add(dato);
                //--------------------SAVE SAMPLE PIXEL HASH------------------//
                table.put(id_h, dato);
                id_h++;//INC ID
                //------------------------------------------------------------// 

                //CANGHE COLOR
                colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;

                //---------SET NEW COLOR---------//
                // imageActual.setRGB(i, j, colorSRGB);
                //-------------------------------//
            }

        }
        //--------------------------------------------------------------------------------//
    }

    public ArrayList<pixelSample> getListPixSample() {
        return listPixSample;
    }

    public void setListPixSample(ArrayList<pixelSample> listPixSample) {
        this.listPixSample = listPixSample;
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

     public BufferedImage efect(){
         
         for (int i = 100; i < 100; i++) {
            for (int j = 100; j < 100; j++) {

                //SAVE COLOR PIXEL
                colorAux = new Color(this.imageActual.getRGB(i, j));

                //PROM(RGB)
                mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()) / 3);

                //----------------GREATE SAMPLE PIXEL-------------------//
                //---------------------------------ID--X--Y--COLOR------//
                pixelSample dato = new pixelSample(id_h, i, j, colorAux);
                //-----------------------------------------------------// 
                //listPixSample.add(dato);
                //--------------------SAVE SAMPLE PIXEL HASH------------------//
               // table.put(id_h, dato);
                //id_h++;//INC ID
                //------------------------------------------------------------// 

                //CANGHE COLOR
                colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;

                //---------SET NEW COLOR---------//
                imageActual.setRGB(i, j, colorSRGB);
                //-------------------------------//
            }
         }
        return  imageActual;
     
     }
    
    
    
    
//    public BufferedImage efect(int pInicialX, int pInicialY,
//            int pFinalX, int pFinalY, int RDistancia, int BDistancia) {
//
//        //------------------------------ARRAY IMG  LOOP-----------------------------------------//
//        for (int i = pInicialX; i < pFinalX; i++) {
//            for (int j = pInicialY; j < pFinalY; j++) {
//
//                //SAVE COLOR PIXEL
//                colorAux = new Color(this.imageActual.getRGB(i, j));
//
//                //PROM(RGB)
//                mediaPixel = (int) ((colorAux.getRed() + colorAux.getGreen() + colorAux.getBlue()));
//
//               
//
//                //CANGHE COLOR
//                //| R-distancia % 256|, G, | B+distancia % 256 |  
//                colorSRGB = (RDistancia % 256) | (colorAux.getGreen()) | (BDistancia % 256);
//
//                //---------SET NEW COLOR---------//
//                imageActual.setRGB(i, j, colorSRGB);
//                //-------------------------------//
//
//            }
//        }
//        return imageActual;
  //  }

     
     
     //---------------------------DRAWLINEY----------------------------------//
    public void pos(int pFinalY, int pX) {
         for (int i = 0; i < pFinalY; i++) {
        for (int j = 0; i < pFinalY; i++) {
            colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;
            imageActual.setRGB(pX, i, colorSRGB);
            imageActual.setRGB(j, i, colorSRGB);
         }
         }
    }
    //-----------------------------------------------------------------------//
     
     
    public BufferedImage newPaint() {

      

        //---------------DRAWLINEX-----------------//
        pos(imageActual.getWidth(), pivoteY);
        //----------------------------------------//

       

       
       

        //---RETURN IMG---//
        return imageActual;
        //----------------// 
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public BufferedImage escalaGrises(int n, int m) {

        pivoteX = imageActual.getWidth() / n;
        pivoteY = imageActual.getHeight() / m;

        int media = imageActual.getWidth() * imageActual.getWidth();

        //---------------DRAWLINEX-----------------//
        limitX(imageActual.getWidth(), pivoteY);
        limitX(imageActual.getWidth(), pivoteY * 2);
        //----------------------------------------//

        //----------------DRAWLINEY------------------// 
        limitY(imageActual.getHeight(), pivoteX);
        limitY(imageActual.getHeight(), pivoteX * 2);
        //----------------------------------------//

        // int pFinalX, int pFinalY, Hashtable table) {
        sector(0, 0, imageActual.getWidth(), imageActual.getHeight(), sector1);//carga el hast y un list de pixselsample
        extract1 = pixel1.datos(sector1);//entrae el 15%

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

    public ArrayList<pixelSample> getExtract1() {
        return extract1;
    }

    public void setExtract1(ArrayList<pixelSample> extract1) {
        this.extract1 = extract1;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void getid(ArrayList<pixelSample> dato) {
       
        try {
            for (int i = 0; i < (dato.size()); i++) {
                if ( (dato.get(i)) != (null) ) {
                    nID =0;
                    //dato.get(i).setFakeID(nID);
                    mapdavid.put(nID, dato.get(i) );
                    bigID.add((dato.get(i)));
                    this.bigsample.add(dato.get(i));
                    nID++;
                }
            }
        } catch (Exception e) {

        }
        /// System.out.println("///" + bigID.size());
     //   return bigID;
    }

    public int principalColor(ArrayList<pixelSample> dato) {
        ArrayList<Integer> bigID = new ArrayList<>();
        int aux = 0;
        try {
            for (int i = 0; i < dato.size(); i++) {
                bigID.add(dato.get(i).getId());
                if (max < dato.get(i).getCantidad()) {
                    max = dato.get(i).getCantidad();
                    aux = i;
                }
            }
        } catch (Exception e) {
        }
        return aux;
    }

    public ArrayList<pixelSample> getBigsample() {
        return bigsample;
    }

    public void setBigsample(ArrayList<pixelSample> bigsample) {
        this.bigsample = bigsample;
    }

////////////////////////////////////////////////////////////////////////////////    
}
