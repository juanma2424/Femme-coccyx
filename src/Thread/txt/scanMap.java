/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.txt;

import Thread.pix.pixMap;
import java.util.ArrayList;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class scanMap implements Runnable {
    //-----VARIEABLE--------//    
    public pixMap map;
    
    ArrayList<pixelSample> sector1 = new ArrayList<>();
    ArrayList<pixelSample> sector2 = new ArrayList<>();
    ArrayList<pixelSample> sector3 = new ArrayList<>();
    ArrayList<pixelSample> sector4 = new ArrayList<>();
    ArrayList<pixelSample> sector5 = new ArrayList<>();
    ArrayList<pixelSample> sector6 = new ArrayList<>();
    ArrayList<pixelSample> sector7 = new ArrayList<>();
    ArrayList<pixelSample> sector8 = new ArrayList<>();
    ArrayList<pixelSample> sector9 = new ArrayList<>();
    
    //----------------------//

    public pixMap getMap() {
        return map;
    }

    //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
    public scanMap(pixMap sampleMap) {
        this.map = sampleMap;
    }
    //----------------------------------------------------//

    @Override
    public void run() {
       
        int sizemap = this.map.getMap().size()/9;
        this.map.getMap().size();
        
        s1(this.map, sizemap*0, sizemap*1,sector1);
        s1(this.map, sizemap*1, sizemap*2,sector2);
        s1(this.map, sizemap*2, sizemap*3,sector3);
        
        s1(this.map, sizemap*3, sizemap*4,sector4);
        s1(this.map, sizemap*4, sizemap*5,sector5);
        s1(this.map, sizemap*5, sizemap*6,sector6);
        
        s1(this.map, sizemap*6, sizemap*7,sector7);
        s1(this.map, sizemap*7, sizemap*8,sector8);
        s1(this.map, sizemap*8, sizemap*9,sector9);
        
       
        //System.out.println("scan map------------------------------------------------------------------------------------");
    }
    
    public void s1(pixMap pmap , int x , int y , ArrayList<pixelSample> s){
         for (int i = x; i < y; i++) {
            s.add(map.getMap().get(i));
            //System.out.println("scan map   xxxxxxxxxxx");
        }
    }

    //-------------------------------GET&SET-------------------------------//
    public ArrayList<pixelSample> getSector1() {
        return sector1;
    }

    public void setSector1(ArrayList<pixelSample> sector1) {
        this.sector1 = sector1;
    }

    public ArrayList<pixelSample> getSector2() {
        return sector2;
    }

    public void setSector2(ArrayList<pixelSample> sector2) {
        this.sector2 = sector2;
    }

    public ArrayList<pixelSample> getSector3() {
        return sector3;
    }

    public void setSector3(ArrayList<pixelSample> sector3) {
        this.sector3 = sector3;
    }

    public ArrayList<pixelSample> getSector4() {
        return sector4;
    }

    public void setSector4(ArrayList<pixelSample> sector4) {
        this.sector4 = sector4;
    }

    public ArrayList<pixelSample> getSector5() {
        return sector5;
    }

    public void setSector5(ArrayList<pixelSample> sector5) {
        this.sector5 = sector5;
    }

    public ArrayList<pixelSample> getSector6() {
        return sector6;
    }

    public void setSector6(ArrayList<pixelSample> sector6) {
        this.sector6 = sector6;
    }

    public ArrayList<pixelSample> getSector7() {
        return sector7;
    }

    public void setSector7(ArrayList<pixelSample> sector7) {
        this.sector7 = sector7;
    }

    public ArrayList<pixelSample> getSector8() {
        return sector8;
    }

    public void setSector8(ArrayList<pixelSample> sector8) {
        this.sector8 = sector8;
    }

    public ArrayList<pixelSample> getSector9() {
        return sector9;
    }

    public void setSector9(ArrayList<pixelSample> sector9) {
        this.sector9 = sector9;
    }
   //---------------------------------------------------------------------------//
}
