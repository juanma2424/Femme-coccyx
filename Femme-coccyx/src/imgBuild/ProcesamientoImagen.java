 
package imgBuild;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ProcesamientoImagen {
    
    private BufferedImage imageActual;
    private int mediaPixel,colorSRGB = 0;
    private Color colorAux;
    private int pivoteX ;
    private int pivoteY;
     

    public void sector(int pInicialX,int  pInicialY, int pFinalX,int  pFinalY){
          
       //Recorremos la imagen píxel a píxel
        for(int i = pInicialX ; i<  pFinalX; i++ ){
            for( int j = pInicialY; j <  pFinalY; j++ ){
                //Almacenamos el color del píxel
                colorAux=new Color(this.imageActual.getRGB(i, j));
                //Calculamos la media de los tres canales (rojo, verde, azul)
                mediaPixel=(int)((colorAux.getRed()+colorAux.getGreen()+colorAux.getBlue())/3);
                //Cambiamos a formato sRGB                
                colorSRGB=(mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;
                //Asignamos el nuevo valor al BufferedImage
                imageActual.setRGB(i, j,colorSRGB);
               
            }
            
        } 
        
      
    
    }
    
     
    
    
    
    
    
    public void limitX(int pFinalX,int pY){
        for(int i = 0 ; i<  pFinalX ; i++ ){            
                colorSRGB=(mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;
                imageActual.setRGB(i,pY,colorSRGB);
        }
    }
    
    
     public void limitY(int pFinalY,int pX){
        for(int i = 0 ; i<  pFinalY ; i++ ){            
                colorSRGB=(mediaPixel << 8) | (mediaPixel << 8) | mediaPixel;
                imageActual.setRGB(pX,i,colorSRGB);
        }
    }
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    public BufferedImage escalaGrises(int n , int m){
       
        
        
        pivoteX = imageActual.getWidth()/n;
        pivoteY = imageActual.getHeight()/m;
        
        limitX( imageActual.getWidth(), pivoteY );
        limitX( imageActual.getWidth(), pivoteY*2 );
        
        limitY( imageActual.getHeight() , pivoteX );
        limitY( imageActual.getHeight() , pivoteX*2 );
        
         //inico (x,y) , final(x,y)
        ///////////////////////////////////////////////////////////////////////
        //01
        sector(0,0,pivoteX,pivoteY);
        //02
        sector((imageActual.getWidth()/n)*1 , 0 ,(imageActual.getWidth()/n)*2,pivoteY);
        //03
        sector((imageActual.getWidth()/n)*2 , 0 ,imageActual.getWidth(),pivoteY);
        
        ////////////////////////////////////////////////////////////////////////
        //04
        sector(0, (imageActual.getHeight()/m)*1 , pivoteX , (imageActual.getHeight()/m)*2 );
        //05
        sector((imageActual.getWidth()/n)*1 , (imageActual.getHeight()/m)*1 ,
                (imageActual.getWidth()/n)*2  , (imageActual.getHeight()/m)*2 );
        //06
        sector((imageActual.getWidth()/n)*2 , (imageActual.getHeight()/m)*1 , 
                imageActual.getWidth(), (imageActual.getHeight()/m)*2 );
        
        ////////////////////////////////////////////////////////////////////////
        //07
        sector(0, (imageActual.getHeight()/m)*2 , pivoteX , imageActual.getHeight() );
        //08
        sector((imageActual.getWidth()/n)*1 , (imageActual.getHeight()/m)*2 ,
                (imageActual.getWidth()/n)*2  , imageActual.getHeight() );
        //09
        sector((imageActual.getWidth()/n)*2 , (imageActual.getHeight()/m)*2 , 
                imageActual.getWidth(), imageActual.getHeight() );
         
        //Retornamos la imagen
        return imageActual;
    }
    

    ////////////////////////////GET&SET////////////////////////////////////////
    public BufferedImage getImageActual() {
        return imageActual;
    }

    public void setImageActual(BufferedImage imageActual) {
        this.imageActual = imageActual;
        pivoteX = imageActual.getWidth();
        pivoteY = imageActual.getHeight();
    }
}
