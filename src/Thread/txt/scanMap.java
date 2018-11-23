/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.txt;

import Thread.pix.pixMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class scanMap implements Runnable {
    //-----VARIEABLE--------//    
    public pixMap map;
    
  Map<Integer, pixelSample> S1 = new HashMap<Integer, pixelSample>();
  Map<Integer, pixelSample> S2 = new HashMap<Integer, pixelSample>();
  Map<Integer, pixelSample> S3 = new HashMap<Integer, pixelSample>(); 
  Map<Integer, pixelSample> S4= new HashMap<Integer, pixelSample>();
  Map<Integer, pixelSample> S5 = new HashMap<Integer, pixelSample>();
  Map<Integer, pixelSample> S6 = new HashMap<Integer, pixelSample>();
  Map<Integer, pixelSample> S7 = new HashMap<Integer, pixelSample>();
  Map<Integer, pixelSample> S8 = new HashMap<Integer, pixelSample>();
  Map<Integer, pixelSample> S9 = new HashMap<Integer, pixelSample>();
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
        // divMap(this.map, 1,S1, 0);
       
//        s1(this.map, sizemap*1, sizemap*2,sector2);
//        s1(this.map, sizemap*2, sizemap*3,sector3);
//        
//        s1(this.map, sizemap*3, sizemap*4,sector4);
//        s1(this.map, sizemap*4, sizemap*5,sector5);
//        s1(this.map, sizemap*5, sizemap*6,sector6);
//        
//        s1(this.map, sizemap*6, sizemap*7,sector7);
//        s1(this.map, sizemap*7, sizemap*8,sector8);
//        s1(this.map, sizemap*8, sizemap*9,sector9);
        
       
        //System.out.println("scan map------------------------------------------------------------------------------------");
    }
   public void divMap( pixMap mapa ,int  sec, Map<Integer, pixelSample> Sx){
       for (int i = 0; i < 10; i++) {
           
       }
       
   }
    
}