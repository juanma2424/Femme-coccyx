//http://www.myjavazone.com/2011/02/cargar-una-imagen-desde-una-url.html
package imgBuild;

import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.imageio.ImageIO;
import static sun.security.jgss.GSSToken.debug;

public class searchImg {

    //---------VARIEABLE------------//
    private URLConnection urlCon;//Para obtener datos de la conexión 
    //-----------------------------//

    //-------------------GET IMG BY URL------------------------// 
    public Image ImagenURL(String URLDATA) throws IOException {
        try {
            //------ SET URL AND OPEN CONECTION ----// 
            URL url = new URL(URLDATA);
            urlCon = url.openConnection();
            //---------------------------------------//
            try {
                // SETIMG IN LABEL    
                if (urlCon.getContentType() != null) {
                    Image image = ImageIO.read(url);
                    return image;
                } //GET ERROR URL
                else {
                    return null;
                }
            } catch (IOException e) {
                debug(e.getMessage());
            }
        } catch (MalformedURLException e) {//IF DONT URL  
        }
        return null;
    }  
}  
    
//    public Image fastShare(String urldate) throws IOException{
//        Runnable  miRunnable = () -> {
//            try {
//                 ImagenURL(urldate);//carga img
//            } catch (IOException ex) {
//                Logger.getLogger(searchImg.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } //Clase para ejecutar hilo independiente del main
//        ; 
//        Thread hilo = new Thread(miRunnable);//Instancia del hilo 
//        hilo.start(); 
//        return ImagenURL(urldate);
//    }

//}

//    public Image fastShare(String urldate) throws IOException{
//        Runnable  miRunnable = () -> {
//            try {
//                 ImagenURL(urldate);//carga img
//            } catch (IOException ex) {
//                Logger.getLogger(searchImg.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } //Clase para ejecutar hilo independiente del main
//        ; 
//        Thread hilo = new Thread(miRunnable);//Instancia del hilo 
//        hilo.start(); 
//        return ImagenURL(urldate);
//    }
