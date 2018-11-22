/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proTEXT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sample.WordSample;
import sample.pixelSample;
import structures.BPTree;
import structures.Graph;

/**
 *
 * @author Juanma
 */
public class proText {
    
    ArrayList< WordSample > bigWordSample = new ArrayList<>();

    public void samblestext( HashMap<Integer,Integer> mapadavid, Map<Integer, pixelSample > davidya , Graph graph,BPTree<String, BPTree<String, WordSample>> tree, 
            ArrayList<String> bigdatax , ArrayList< ArrayList<pixelSample>> taggin  ){
        
        for (String bigdatax1 : bigdatax) {
           // System.out.println("Despues de: " + bigdatax1);    
            try{
              
                WordSample Tag = tree.search(bigdatax1.substring(0, 1)).search(bigdatax1);
                System.out.println("Despues de: " + bigdatax1);
                List<pixelSample> region = taggin.get(Tag.region);
                
                for(Integer Id: mapadavid.keySet()){
                    
                    System.out.println(" aca " +davidya.get(Id).getTag());
                    
                    for(pixelSample sample : region){
                        if (sample.getTag().equals(bigdatax1) && davidya.get(Id).getColor().equals(sample.getColor())){
                           
                            // sample.pintar(R,G,B);
                        }   
                        
                    }    
                }
            }
            catch(Exception e){
                
            }
        }
        /*try{
        for (int i = 0; i < bigdatax.size(); i++) {// tags
        String ini =  bigdatax.get(i).substring(0, 1);
        System.out.println("cabeza pb " + davidya.get(0).getFakeID());
        System.out.println("cabesa grf " + graph.head);
        WordSample Tag = tree.search((ini)).search(bigdatax.get(i));
        List<pixelSample> region =  tagggin.get(Tag.region);
        ArrayList<Integer> Ids =  graph.DFS(graph.getHead());
        for (int j = 0; j < region.size(); j++) {
        if (Tag.word.equals(region.get(i).getTag())){
        //region.get(i).getFakeID()
        }
        }*/
//            for every PixelSample in region:
//                 if (Tag.word == PixelSample.Tag):
//                    List<Caminos> map.get(PixelSample.ID):
//                    for camino en lista:
//                        pintar(tag.primeraletra, camino.color);
    ///    }  
   // } catch (Exception e) {}
       
    }
     public ArrayList<WordSample> getBigWordSample() {
        return bigWordSample;
    }

    public void setBigWordSample(ArrayList<WordSample> bigWordSample) {
        this.bigWordSample = bigWordSample;
    }
}
