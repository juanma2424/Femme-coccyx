/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proTEXT;

import java.util.ArrayList;
import sample.WordSample;
import sample.pixelSample;
import structures.BPTree;

/**
 *
 * @author Juanma
 */
public class proText {
    
     ArrayList< WordSample > bigWordSample = new ArrayList<>();


    public void samblestext(BPTree<String, BPTree<String, WordSample>> tree,  ArrayList<String> bigdatax ){
        for (int i = 0; i < bigdatax.size(); i++) {
            String ini =  bigdatax.get(i).substring(0, 1);
           bigWordSample.add(tree.search((   ini   )).search(bigdatax.get(i)));
        }  
    }
     public ArrayList<WordSample> getBigWordSample() {
        return bigWordSample;
    }

    public void setBigWordSample(ArrayList<WordSample> bigWordSample) {
        this.bigWordSample = bigWordSample;
    }
}
