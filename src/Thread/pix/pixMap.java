/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.pix;

import java.util.ArrayList;
import sample.pixelSample;

public class pixMap {

    //-------VARIABLE-------//
    private ArrayList<pixelSample> map = new ArrayList<>();
    //----------------------//
    //EMPY CONSTRUCTOR//
	public pixMap (){
	}
        //----------------//

        //-------NAME  ARRAY  CONSTRUCTO----------------//
	public pixMap(ArrayList<pixelSample> pmap) {
		this.map = pmap;
	}
        //----------------------------------------------//

        //-----------------------GET&SET-----------------------//
	
        //-----------------------------------------------------//

    public ArrayList<pixelSample> getMap() {
        return map;
    }

    public void setMap(ArrayList<pixelSample> map) {
        this.map = map;
    }

}
