/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.txt;

import Thread.txt.pixTx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sample.WordSample;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class sacanTxt implements Runnable{
    Map<Integer, pixelSample> mapaBitsDivResult = new HashMap<Integer, pixelSample>();
    
    
    //----------------------//

    public Map<Integer, pixelSample> getMap() {
        return  mapaBitsDivResult ;
    }

    //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
    public sacanTxt( Map<Integer, pixelSample> sampleMap) {
        this.mapaBitsDivResult = sampleMap;
    }
    //----------------------------------------------------//

    @Override
    public void run() {
       
          int sizemap = this.mapaBitsDivResult.size()/9;
        
        
//        System.out.println(" acaxxxxxxxxxxx");
//        s1(this.map, sizemap*0, sizemap*1,sector1);
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
    
    public void s1(pixTx pmap , int x , int y ,Map<Integer, pixelSample> s){
         for (int i = x; i < y; i++) {
           // s.add(map.getMap().get(i));
           // System.out.println("scan map   xxxxxxxxxxx");
        }
    }

    //-------------------------------GET&SET-------------------------------//
   
   //---------------------------------------------------------------------------//

    
}
