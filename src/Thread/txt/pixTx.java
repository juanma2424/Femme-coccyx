/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.txt;

import java.util.ArrayList;
import sample.WordSample;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class pixTx {
    //-------VARIABLE-------//
    private ArrayList<WordSample> map = new ArrayList<>();
    //----------------------//
    //EMPY CONSTRUCTOR//
	public pixTx (){
	}
        //----------------//

        //-------NAME  ARRAY  CONSTRUCTO----------------//
	public pixTx(ArrayList<WordSample> pmap) {
		this.map = pmap;
	}
        //----------------------------------------------//

   

        //-----------------------GET&SET-----------------------//
	
        //-----------------------------------------------------//

    public ArrayList<WordSample> getMap() {
        return map;
    }

    public void setMap(ArrayList<WordSample> map) {
        this.map = map;
    }

    
}
