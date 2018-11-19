package percentage;

import java.util.Hashtable;
import sample.pixelSample;

public class extractPixel {

    public pixelSample[] datos(Hashtable table, int limt, int lims) {
        int M = lims;
        int N = limt;
//        System.out.println("--------------------------------------");
//        System.out.println(" total  " + table.size());
//        System.out.println("---------------------------------");
//        System.out.println("  id h / N 1  / " + N);
//        System.out.println("  id t /M  / " + M);
//        System.out.println("---------------------------------");
        //----------------------RANMDON 10-15-----------------------//
        int valorEntero = (int) Math.floor(Math.random() * (15 - 10 + 1) + 10);
        //----------------------------------------------------------//

        //----------------------PORCENT OF SECTOR-----------------------//
        double rpta = table.size() * valorEntero / 100.0;
//         System.out.println(" porcentaje  " +  rpta);
//          System.out.println("--------------------------------------");
        //----------------------------------------------------------//
        //---------------------CREATE ARRAY SAMPLE--------------------//
        pixelSample[] dataSample = new pixelSample[(int) rpta];

        //----------------------------------------------------------//
        for (int i = 0; i < dataSample.length; i++) {
            int num = (int) Math.floor(Math.random() * (N - M + 1) + M);
            dataSample[i] = (pixelSample) table.get(num);
        }
        return dataSample;
    }


}
