/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proTEXT;

import java.util.ArrayList;
import java.util.List;
import sample.WordSample;
import sample.pixelSample;
import structures.BPTree;

/**
 *
 * @author Juanma
 */
public class proText {
    
    ArrayList< WordSample > bigWordSample = new ArrayList<>();

    public void samblestext(BPTree<String, BPTree<String, WordSample>> tree, 
            ArrayList<String> bigdatax , ArrayList< ArrayList<pixelSample>> tagggin  ){
        
        
  
        for (int i = 0; i < bigdatax.size(); i++) {// tags
            String ini =  bigdatax.get(i).substring(0, 1);
            WordSample Tag = tree.search((ini)).search(bigdatax.get(i));
            List<pixelSample> region =  tagggin.get(Tag.region);
            
            for (int j = 0; j < region.size(); j++) {
                if (Tag.word.equals(region.get(i).getTag())){
                    
                }
                
            }
//            for every PixelSample in region:
//                if (Tag.word == PixelSample.Tag):
//                    List<Caminos> map.get(PixelSample.ID):
//                    for camino en lista:
//                        pintar(tag.primeraletra, camino.color);
        }  
    }
     public ArrayList<WordSample> getBigWordSample() {
        return bigWordSample;
    }

    public void setBigWordSample(ArrayList<WordSample> bigWordSample) {
        this.bigWordSample = bigWordSample;
    }
}
