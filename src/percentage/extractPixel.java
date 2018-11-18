/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percentage;

import java.util.Hashtable;

public class extractPixel {
     int valorEntero;
     double size;
     double rpta ;
     int length;
     Hashtable Mytable;
     int [] dataSample;
    
    public int[] extract(Hashtable table ){
        this.Mytable = table;
        length = table.size();
        valorEntero = (int) Math.floor(Math.random()*(15-10+1)+10);
        size = table.size();
        rpta = size*valorEntero /100.0;
        System.out.println( "  vamos  "  + rpta);
        dataSample = new int[length];
        return setSamples();
    }
    
    public int[] setSamples(){
         for (int i = 0; i < dataSample.length; i++) {
            int numero = (int) (Math.random() * length);
            dataSample[i] =  numero;
        }
        return dataSample;
    }
    
}
