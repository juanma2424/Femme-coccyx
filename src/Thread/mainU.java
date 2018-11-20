/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import Thread.ImagePixel;
import Thread.sacanRegion;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Juanma
 */
public class mainU {
     public static void main(String[] args) {
        
        ArrayList<pixMap> PixelMap = new ArrayList<pixMap>();
        PixelMap.add(new pixMap());
       
        //<>,name,nomlist
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (pixMap sampleMap: PixelMap) {
            Runnable sector = new scanMap(sampleMap);
            executor.execute(sector);
        }
        executor.shutdown();	// Cierro el Executor
        while (!executor.isTerminated()) {
        	// Espero a que terminen de ejecutarse todos los procesos 
        	// para pasar a las siguientes instrucciones 
        }
    }
    
}
