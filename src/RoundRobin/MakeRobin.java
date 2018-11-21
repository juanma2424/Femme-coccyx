/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoundRobin;

import java.util.ArrayList;
import percentage.extractPixel;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class MakeRobin {
    
    
    RoundRobin make = new RoundRobin();
    
    
    public void RRobin(ArrayList<pixelSample> bigTag){
         
//        for (int i = 0; i < bigTag.size(); i++) {
//            make.distribute(conf, tag, bigTag);
//            
//        }
//       
//       
//        int name[] = make.distribute(1, tag, bigTag);

        // llegada para cada proceso
        int arrivaltime[] = {0, 1, 2, 3};

        // tiempo de ráfaga para cada proceso
        int bursttime[] = {10, 4, 5, 3};

        // time quantum de cada proceso
        int q = 3;

        //roundRobin(name, arrivaltime, bursttime, q);
    }
    
}
