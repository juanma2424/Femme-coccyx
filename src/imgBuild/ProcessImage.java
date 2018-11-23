package imgBuild;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import sample.pixelSample;

public class ProcessImage {

    //---------VARIABLES-------------//
    private BufferedImage imageActual;
    private int mediaPixel, colorSRGB = 0;
    private int pivoteX;
    private int pivoteY;
    int moreAperret = 0;

    Map<Integer, pixelSample> mapaBitsAux = new HashMap<Integer, pixelSample>();
    Map<String, Boolean> postXY = new HashMap<String, Boolean>();
    Map<Integer, ArrayList<pixelSample>> regionesAux = new HashMap<Integer, ArrayList<pixelSample>>();
    ArrayList<pixelSample> region1 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region2 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region3 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region4 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region5 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region6 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region7 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region8 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> region9 = new ArrayList<pixelSample>();
    
    
    
    ArrayList<pixelSample> aregion1 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion2 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion3 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion4 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion5 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion6 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion7 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion8 = new ArrayList<pixelSample>();
    ArrayList<pixelSample> aregion9 = new ArrayList<pixelSample>();
    
    
    Map<String, Integer> myMap = new HashMap<String, Integer>();
    Map<Integer, pixelSample> tagMap = new HashMap<Integer, pixelSample>();
    int ID = 0;
    int guia = 0;
    // int sizeImege = imageActual.getWidth() * imageActual.getWidth();

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

    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx// 
    //-----------------------------------------------------------------------//
    public BufferedImage divSectors(int n, int m) {

        pivoteX = (imageActual.getWidth() / n);
        pivoteY = (imageActual.getHeight() / m);

        //---------------DRAWLINEX-----------------//
        limitX(imageActual.getWidth(), pivoteY);
        limitX(imageActual.getWidth(), pivoteY * 2);
        //----------------------------------------//

        //----------------DRAWLINEY------------------// 
        limitY(imageActual.getHeight(), pivoteX);
        limitY(imageActual.getHeight(), pivoteX * 2);
        //----------------------------------------//
//        for (int i = 0; i < (n+1); i++) {
//         percent(pivoteX * 0, pivoteX * (1), pivoteY * i, pivoteY * (i+1),i);
//         percent(pivoteX * 1, pivoteX * (2), pivoteY * i, pivoteY * (i+1),i);
//         percent(pivoteX * 2, pivoteX * (3)-1, pivoteY * i, pivoteY * (i+1),i);
//
//        }

//        int sector;
//        
//        for (int i = 0; i < (n * m); i++) {
//            percent(pivoteX * i, pivoteX * (i + 1), pivoteX * i, pivoteY * (i + 1));
//            System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
//        }
        //---RETURN IMG---//
        return imageActual;
        //----------------// 

    }
//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx//    

    public Map<Integer, pixelSample> div(Map<Integer, pixelSample> pmapaBitsAux) {
        percent(pivoteX * 0, pivoteX * (1), pivoteY * 0, pivoteY * (1), 1, pmapaBitsAux, region1);
        regionesAux.put(1, region1);

        percent(pivoteX * 1, pivoteX * (2), pivoteY * 0, pivoteY * (1), 2, pmapaBitsAux, region2);
        regionesAux.put(2, region2);

        percent(pivoteX * 2, pivoteX * (3) - 1, pivoteY * 0, pivoteY * (1), 3, pmapaBitsAux, region3);
        regionesAux.put(3, region3);

        percent(pivoteX * 0, pivoteX * (1), pivoteY * (1), pivoteY * (2), 4, pmapaBitsAux, region4);
        regionesAux.put(4, region4);

        percent(pivoteX * 1, pivoteX * (2), pivoteY * (1), pivoteY * (2), 5, pmapaBitsAux, region5);
        regionesAux.put(5, region5);

        percent(pivoteX * 2, pivoteX * (3) - 1, pivoteY * (1), pivoteY * (2), 6, pmapaBitsAux, region6);
        regionesAux.put(6, region6);

        percent(pivoteX * (0), pivoteX * (1), pivoteY * (2), pivoteY * (3) - 1, 7, pmapaBitsAux, region7);
        regionesAux.put(7, region7);

        percent(pivoteX * (1), pivoteX * (2), pivoteY * (2), pivoteY * (3) - 1, 8, pmapaBitsAux, region8);
        regionesAux.put(8, region8);

        percent(pivoteX * (2), pivoteX * (3) - 1, pivoteY * (2), pivoteY * (3) - 1, 9, pmapaBitsAux, region9);
        regionesAux.put(9, region9);

        return pmapaBitsAux;

    }

    public void percent(int InicioX, int finX, int inicioY, int finY, int sec, Map<Integer, pixelSample> pmapaBitsAux, ArrayList<pixelSample> reg) {

        //----------------------RANMDON 10-15-----------------------//
        int valorEntero = (int) Math.floor(Math.random() * ((15 - 10) + 1) + 10);
        //----------------------------------------------------------//

        //----------------------PORCENT OF SECTOR-----------------------//
        double rpta = (((pivoteX) * (pivoteY)) * (valorEntero / 100.0));
        //----------------------------------------------------------//

        //---------------------CREATE ARRAY SAMPLE--------------------//
        int dataSample = ((int) rpta);
        System.out.println("  ");
        //----------------------------------------------------------//

        for (int i = 0; i < (dataSample); i++) {// estsblece el 15 de laimagen

            int posX = (int) Math.floor(Math.random() * ((finX - InicioX) + 1) + InicioX);
            int posY = (int) Math.floor(Math.random() * ((finY - inicioY) + 1) + inicioY);
            Color colorAux = new Color(this.imageActual.getRGB(posX, posY));
            String Xp = Integer.toString(posX);
            String Yp = Integer.toString(posY);

            if ((postXY.get(Xp + "," + Yp)) != null) {

                if ((postXY.get(Xp + "," + Yp))) {
                    int cant = (pmapaBitsAux.get((myMap.get(Xp + "," + Yp))).getCantidad()) + 1;
                    pmapaBitsAux.get((myMap.get(Xp + "," + Yp))).setCantidad(cant);
                    pmapaBitsAux.get((myMap.get(Xp + "," + Yp))).setPosition(posX, posY);

                    if (getMoreAperret() <= (pmapaBitsAux.get((myMap.get(Xp + "," + Yp))).getCantidad())) {
                        setMoreAperret((pmapaBitsAux.get((myMap.get(Xp + "," + Yp))).getCantidad()));
                    }
                } else {
                    pmapaBitsAux.put(ID, new pixelSample(ID, posX, posY, colorAux, sec));
                    reg.add(new pixelSample(ID, posX, posY, colorAux, sec));
                    String keyXY = Xp + "," + Yp;
                    postXY.put(keyXY, true);
                    ID++;

                }
            } else {
                pmapaBitsAux.put(ID, new pixelSample(ID, posX, posY, colorAux, sec));
                reg.add(new pixelSample(ID, posX, posY, colorAux, sec));
                String keyXY = Xp + "," + Yp;
                postXY.put(keyXY, true);
                myMap.put(keyXY, ID);
                ID++;

            }

//            if ((pmapaBitsAux.get(putamierda)!=null) && ( (pmapaBitsAux.get(putamierda).getPosX()) == posX) && 
//                    (pmapaBitsAux.get(putamierda).getPosY()== posY)) {
//                int cant = pmapaBitsAux.get(putamierda).getCantidad() + 1;
//                pmapaBitsAux.get(putamierda).setCantidad(cant);
//                pmapaBitsAux.get(putamierda).setPosition(posX, posY);
//                 if(moreAperret<pmapaBitsAux.get(putamierda).getCantidad()){
//                     moreAperret= putamierda;
//                 }
//                
//            }
//            pmapaBitsAux.put( putamierda, new  pixelSample( putamierda,posX,posY ,rgb,sec));
//            regionX.add(new  pixelSample( putamierda,posX,posY ,rgb,sec));
//            putamierda++;
//        }
        }
    }
    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx//     

    public Map<Integer, ArrayList<pixelSample>> tagallsampes(Map<Integer, pixelSample> ptagMap) {
        for (int i = 0; i < ptagMap.size(); i++) {
            if (ptagMap.get(i).getSector() == 1) {
                aregion1.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 2) {
                aregion2.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 3) {
                aregion3.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 4) {
                aregion4.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 5) {
                aregion5.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 6) {
                aregion6.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 7) {
                aregion7.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 8) {
                aregion8.add(ptagMap.get(i));
            }
            if (ptagMap.get(i).getSector() == 9) {
                aregion9.add(ptagMap.get(i));
            }
        }
        regionesAux.put(1, aregion1);
        regionesAux.put(2, aregion2);
        regionesAux.put(3, aregion3);
        regionesAux.put(4, aregion4);
        regionesAux.put(5, aregion5);
        regionesAux.put(6, aregion6);
        regionesAux.put(7, aregion7);
        regionesAux.put(8, aregion8);
        regionesAux.put(9, aregion9);
        return regionesAux;

    }

    /////////////////////////////////GET&SET////////////////////////////////////////
    public BufferedImage getImageActual() {
        return imageActual;
    }

    public void setImageActual(BufferedImage imageActual) {
        this.imageActual = imageActual;
    }
////////////////////////////////////////////////////////////////////////////////
//CXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//

    public Map<Integer, pixelSample> getMapaBitsAux() {
        return mapaBitsAux;
    }

    public void setMapaBitsAux(Map<Integer, pixelSample> mapaBitsAux) {
        this.mapaBitsAux = mapaBitsAux;
    }

    public Map<Integer, ArrayList<pixelSample>> getRegionesAux() {
        return regionesAux;
    }

    public void setRegionesAux(Map<Integer, ArrayList<pixelSample>> regionesAux) {
        this.regionesAux = regionesAux;
    }

    public int getMoreAperret() {
        return moreAperret;
    }

    public void setMoreAperret(int moreAperret) {
        this.moreAperret = moreAperret;
    }
}
