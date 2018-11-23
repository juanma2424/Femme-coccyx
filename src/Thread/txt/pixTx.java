/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread.txt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sample.WordSample;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class pixTx {

    //-------VARIABLE-------//
    Map<Integer, pixelSample> mapaBitsDiv = new HashMap<Integer, pixelSample>();

    //----------------------//
    //EMPY CONSTRUCTOR//
    public pixTx() {
    }
    //----------------//

    //-------NAME  ARRAY  CONSTRUCTO----------------//
    public pixTx(Map<Integer, pixelSample> pmapaBitsDiv) {
        this.mapaBitsDiv = pmapaBitsDiv;
    }

}
