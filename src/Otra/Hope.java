/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otra;


import java.io.IOException;
import java.util.ArrayList;
import sample.pixelSample;

/**
 *
 * @author Juanma
 */
public class Hope {
    
     ArrayList<Integer> ids = new ArrayList<>();
    
    public  void dataJNI( pixelSample[] dato) throws IOException {
    Runnable  miRunnable = () -> {
        
        for (int i = 0; i < dato.length; i++) {
              // ids.add(dato[i].getId());
              System.out.println(dato[i].getId());
        }
        } //Clase para ejecutar hilo independiente del main
        ; 
        Thread hilo = new Thread(miRunnable);//Instancia del hilo 
        hilo.start(); 
      
    }
        

    
    
}
