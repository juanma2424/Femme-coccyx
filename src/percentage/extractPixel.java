
package percentage;

import java.util.Hashtable;
import sample.pixelSample;

public class extractPixel {
    
     public pixelSample[] datos(Hashtable table ,int limt){
         
         //----------------------RANMDON 10-15-----------------------//
         int valorEntero = (int) Math.floor(Math.random()*(15-10+1)+10);
         //----------------------------------------------------------//
         
         //----------------------PORCENT OF SECTOR-----------------------//
         double rpta = table.size()*valorEntero /100.0;
       
         //----------------------------------------------------------//
         
         //---------------------CREATE ARRAY SAMPLE--------------------//
         pixelSample[] dataSample = new pixelSample[(int)rpta];
           
         //----------------------------------------------------------//
         
          for (int i = 0; i < dataSample.length; i++) {
              
              int num  =  (int) Math.floor(Math.random()*(((limt)-(limt - table.size())+1) )+(table.size()));
              System.out.println(" pizza " + num  );
              dataSample[i] =  (pixelSample) table.get(num);
        }
        return dataSample;
     }
     
}
