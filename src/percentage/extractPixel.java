package percentage;
import java.util.ArrayList;
import java.util.Hashtable;
import sample.pixelSample;

public class extractPixel {

    public ArrayList<pixelSample> datos(Hashtable table, int limt, int lims) {
        ArrayList<pixelSample> Extrac = new ArrayList<>();
        int M = lims;
        int N = limt;
        //----------------------RANMDON 10-15-----------------------//
        int valorEntero = (int) Math.floor(Math.random() * (15 - 10 + 1) + 10);
        //----------------------------------------------------------//

        //----------------------PORCENT OF SECTOR-----------------------//
        double rpta = table.size() * valorEntero / 100.0;
        //----------------------------------------------------------//
        
        
        //---------------------CREATE ARRAY SAMPLE--------------------//
        pixelSample[] dataSample = new pixelSample[(int) rpta];
        //----------------------------------------------------------//
        
        for (int i = 0; i < dataSample.length; i++) {
            int num = (int) Math.floor(Math.random() * (N - M + 1) + M);
            Extrac.add((pixelSample) table.get(num));
        }
        return Extrac;
    }

}
