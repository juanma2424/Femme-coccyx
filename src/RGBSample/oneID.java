
package RGBSample;

import java.util.ArrayList;
import java.util.Objects;
import sample.pixelSample;

public class oneID {
    
    public ArrayList<pixelSample> ONEIDS = new ArrayList<>();
    ArrayList<Integer> IDSFINAL = new ArrayList<>();
   
    
    public void imp(){
        for (int i = 0; i < ONEIDS.size(); i++) {
            System.out.println(ONEIDS.get(i).getId());
        }
    }
    
   
    public void ID_One(){
        for (int i = 0; i <  ONEIDS.size(); i++){
            for (int j =0; j < ONEIDS.size(); j++){
                if (i != j && ( Objects.equals( ONEIDS.get(i),ONEIDS.get(j)))){
                    ONEIDS.remove(j);
                    ONEIDS.get(i).setCantidad((ONEIDS.get(i).getCantidad()+1));
                }
            }
        }
    }
    
    
    public void checkRe(){
        for (int i = 0; i <  ONEIDS.size(); i++){
            for (int j =0; j < ONEIDS.size(); j++){
                if (i != j && ( Objects.equals( ONEIDS.get(i),ONEIDS.get(j)))){
                    System.out.println("hay repetidos");
                }
            }
        }
    }
  
    
    
    
    public void one(ArrayList<pixelSample> pID){
        this.ONEIDS = pID;
        ID_One();
    }    
}