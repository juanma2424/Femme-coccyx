/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.ArrayList;
import sample.WordSample;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class sacanTxt implements Runnable{
    public pixTx map;
    
    ArrayList<WordSample> sector1 = new ArrayList<>();
    ArrayList<WordSample> sector2 = new ArrayList<>();
    ArrayList<WordSample> sector3 = new ArrayList<>();
    ArrayList<WordSample> sector4 = new ArrayList<>();
    ArrayList<WordSample> sector5 = new ArrayList<>();
    ArrayList<WordSample> sector6 = new ArrayList<>();
    ArrayList<WordSample> sector7 = new ArrayList<>();
    ArrayList<WordSample> sector8 = new ArrayList<>();
    ArrayList<WordSample> sector9 = new ArrayList<>();
    
    //----------------------//

    public pixTx getMap() {
        return map;
    }

    //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
    public sacanTxt(pixTx sampleMap) {
        this.map = sampleMap;
    }
    //----------------------------------------------------//

    @Override
    public void run() {
       
        int sizemap = this.map.getMap().size()/9;
        this.map.getMap().size();
        
        System.out.println(" acaxxxxxxxxxxx");
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
    
    public void s1(pixTx pmap , int x , int y , ArrayList<WordSample> s){
         for (int i = x; i < y; i++) {
            s.add(map.getMap().get(i));
           // System.out.println("scan map   xxxxxxxxxxx");
        }
    }

    //-------------------------------GET&SET-------------------------------//
    public ArrayList<WordSample> getSector1() {
        return sector1;
    }

    public void setSector1(ArrayList<WordSample> sector1) {
        this.sector1 = sector1;
    }

    public ArrayList<WordSample> getSector2() {
        return sector2;
    }

    public void setSector2(ArrayList<WordSample> sector2) {
        this.sector2 = sector2;
    }

    public ArrayList<WordSample> getSector3() {
        return sector3;
    }

    public void setSector3(ArrayList<WordSample> sector3) {
        this.sector3 = sector3;
    }

    public ArrayList<WordSample> getSector4() {
        return sector4;
    }

    public void setSector4(ArrayList<WordSample> sector4) {
        this.sector4 = sector4;
    }

    public ArrayList<WordSample> getSector5() {
        return sector5;
    }

    public void setSector5(ArrayList<WordSample> sector5) {
        this.sector5 = sector5;
    }

    public ArrayList<WordSample> getSector6() {
        return sector6;
    }

    public void setSector6(ArrayList<WordSample> sector6) {
        this.sector6 = sector6;
    }

    public ArrayList<WordSample> getSector7() {
        return sector7;
    }

    public void setSector7(ArrayList<WordSample> sector7) {
        this.sector7 = sector7;
    }

    public ArrayList<WordSample> getSector8() {
        return sector8;
    }

    public void setSector8(ArrayList<WordSample> sector8) {
        this.sector8 = sector8;
    }

    public ArrayList<WordSample> getSector9() {
        return sector9;
    }

    public void setSector9(ArrayList<WordSample> sector9) {
        this.sector9 = sector9;
    }
   //---------------------------------------------------------------------------//

    
}
