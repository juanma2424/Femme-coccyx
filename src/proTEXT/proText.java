/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proTEXT;

import java.awt.Color;
import java.awt.image.BufferedImage;
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
    private Color colorAux;
    private BufferedImage imageActual;

    
    private int mediaPixel, colorSRGB = 0;

    public void samblestext( HashMap<Integer,Integer> mapadavid, Map<Integer, pixelSample > davidya , Graph graph,BPTree<String, BPTree<String, WordSample>> tree, 
            ArrayList<String> bigdatax , ArrayList< ArrayList<pixelSample>> taggin  ){
        
        int cont = 0;
        for (String bigdatax1 : bigdatax) {
            try{
                WordSample Tag = tree.search(bigdatax1.substring(0, 1)).search(bigdatax1); 
                //System.out.println("El tag es " + bigdatax1);
               // System.out.println("Despues de: " + bigdatax1);
               // System.out.println("La region de este tag es " + Tag.region);
                List<pixelSample> region = taggin.get(Tag.region);
                //System.out.println(region.size());
                //System.out.println(mapadavid.keySet().size());
                //System.out.println(region.size());
               // System.out.println("El tamano total es de: " + mapadavid.keySet().size());
                for(Integer Id: mapadavid.keySet()){
                  //    System.out.println(mapadavid.keySet());
                  //  System.out.println(Id);
                    for(pixelSample sample : region){
                 //       System.out.println(  "   acac error " + sample.getTag());
                          if (sample.getTag().equals(bigdatax1) && sample.getColor().equals(davidya.get(Id).getColor())){
                          //  System.out.println(" aca " +davidya.get(Id).getTag());
                        //       System.out.println(" Este sample cumple ");
                               //System.out.println(cont);
                               cont++;
                               
                               int x = sample.getPosX();
                               int y = sample.getPosY();
                               Color Pixel = sample.getColor();
                               Color Pixelverde = sample.getColor();
                               int R = Math.abs((Pixel.getRed() - (mapadavid.get(sample.getFakeID())))%256);
                               int B = Math.abs((Pixel.getBlue() + (mapadavid.get(sample.getFakeID())))%256);
                                       
                                setRGB(x,y,R,B, (Pixelverde) );
                               //ACTUALIZAR IMG
                            //public void setRGB(int x ,int y , int R , int B , Color pixcolor){
                          }   
                        
                    }    
                }
            }
            catch(Exception e){
            }    
        }
        System.out.println("La total cantidd de pixeles es: " + cont);
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
       
     //int x = sample.getPosX();
                               //int y = sample.getPosY();
                               //Pixel = img.getPixelRGB(x,y);
                               
                               //int R = Math.abs( (Pixel.R - (mapadavid.getsample.getFakeID()))%256 )
                               //int B = Math.abs((Pixel.R - (mapadavid.getsample.getFakeID()))%256) 
                                       
                               //img.setRGB(R,Pixel.G,B,x,y);
                               //ACTUALIZAR IMG
    
    public void setRGB(int x ,int y , int R , int B , Color pixcolor){
       
                colorAux = new Color(this.imageActual.getRGB(x, y));
                
                //colorSRGB = (R % 256) | (pixcolor) | (256 % B);

                //---------SET NEW COLOR---------//
                //imageActual.setRGB(x,y);
                //-------------------------------//
                //colorSRGB = (mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;

                //---------SET NEW COLOR---------//
                // imageActual.setRGB(i, j, colorSRGB);
        
        
        
        
        
    }
    
    
    
     public ArrayList<WordSample> getBigWordSample() {
        return bigWordSample;
    }

    public void setBigWordSample(ArrayList<WordSample> bigWordSample) {
        this.bigWordSample = bigWordSample;
    }
    
    public BufferedImage getImageActual() {
        return imageActual;
    }

    public void setImageActual(BufferedImage imageActual) {
        this.imageActual = imageActual;
    }
}
