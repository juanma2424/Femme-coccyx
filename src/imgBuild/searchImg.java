/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imgBuild;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import static sun.security.jgss.GSSToken.debug;


public class searchImg {

    private URLConnection urlCon;//Para obtener datos de la conexión 
    private Image img;
    public Image fastShare(String urldate) throws IOException{
        Runnable  miRunnable = () -> {
            try {
                 ImagenURL(urldate);//carga img
            } catch (IOException ex) {
                Logger.getLogger(searchImg.class.getName()).log(Level.SEVERE, null, ex);
            }
        } //Clase para ejecutar hilo independiente del main
        ; 
        Thread hilo = new Thread(miRunnable);//Instancia del hilo 
        hilo.start(); 
        return ImagenURL(urldate);
    }
    
    
    
    
    public Image ImagenURL(String URLDATA) throws IOException {

           try{
            URL url = new URL(URLDATA);
            urlCon = url.openConnection();
            
            try { 
            if (urlCon.getContentType() != null) {
                Image image = ImageIO.read(url);
                return image;
            }
             else {//Si urlCon.getContentType()==null 
                return null;
            }
            }
            catch (IOException e) { 
                debug(e.getMessage()); 
            } 
           }
           catch (MalformedURLException e) {//Si la URL ingresada no corresponde con el formato URL  
        }     
            return null; 
    }

}
