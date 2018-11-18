
package percentage;

import java.util.Hashtable;
import sample.pixelSample;

public class extractPixel {
     int valorEntero;
     double size;
     double rpta ;
     int length;
     Hashtable Mytable;

    public Hashtable getMytable() {
        return Mytable;
    }
     pixelSample [] dataSample;
    
    public pixelSample[] extract(Hashtable table ){
        this.Mytable = table;
        length = table.size();
        valorEntero = (int) Math.floor(Math.random()*(15-10+1)+10);
        size = table.size();
        rpta = size*valorEntero /100.0;
        dataSample = new pixelSample[length];
        return setSamples();
    }
    
    public pixelSample[] setSamples(){
         for (int i = 0; i < dataSample.length; i++) {
            int numero = (int) (Math.random() * length);
            dataSample[i] =  (pixelSample) this.Mytable.get(numero);
        }
        return dataSample;
    }
    
}
