 
package imgBuild;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import percentage.extractPixel;



public class ProcesamientoImagen {
    
    private BufferedImage imageActual;
    private int mediaPixel,colorSRGB = 0;
    private Color colorAux;
    private int pivoteX ;
    private int pivoteY;
    public int id_h=0 ;
    
    extractPixel pixel = new extractPixel();
    
    Hashtable<String,String> secto1=new Hashtable<String,String>();
    Hashtable<String,String> secto2=new Hashtable<String,String>();
    Hashtable<String,String> secto3=new Hashtable<String,String>(); 
    
    Hashtable<String,String> secto4=new Hashtable<String,String>();
    Hashtable<String,String> secto5=new Hashtable<String,String>();
    Hashtable<String,String> secto6=new Hashtable<String,String>(); 
    
    Hashtable<String,String> secto7=new Hashtable<String,String>();
    Hashtable<String,String> secto8=new Hashtable<String,String>();
    Hashtable<String,String> secto9=new Hashtable<String,String>(); 

    public void sector(int pInicialX,int  pInicialY, int pFinalX,int  pFinalY,Hashtable table){
          
       //Recorremos la imagen píxel a píxel
        for(int i = pInicialX ; i<  pFinalX; i++ ){
            for( int j = pInicialY; j <  pFinalY; j++ ){
                
                //Almacenamos el color del píxel
                colorAux=new Color(this.imageActual.getRGB(i, j));
                
                //Calculamos la media de los tres canales (rojo, verde, azul)
                mediaPixel=(int)((colorAux.getRed()+colorAux.getGreen()+colorAux.getBlue())/3);
                
                
                //almacenamos los pixeles en un hastable    
                table.put(id_h, colorAux);
                id_h++;
                
                
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
        sector(0,0,pivoteX,pivoteY,secto1);
        pixel.extract(secto1);
        //02
        sector((imageActual.getWidth()/n)*1 , 0 ,(imageActual.getWidth()/n)*2,pivoteY,secto2);
        //03
        sector((imageActual.getWidth()/n)*2 , 0 ,imageActual.getWidth(),pivoteY,secto3);
        
        ////////////////////////////////////////////////////////////////////////
        //04
        sector(0, (imageActual.getHeight()/m)*1 , pivoteX , (imageActual.getHeight()/m)*2,secto4 );
        //05
        sector((imageActual.getWidth()/n)*1 , (imageActual.getHeight()/m)*1 ,
                (imageActual.getWidth()/n)*2  , (imageActual.getHeight()/m)*2,secto5 );
        //06
        sector((imageActual.getWidth()/n)*2 , (imageActual.getHeight()/m)*1 , 
                imageActual.getWidth(), (imageActual.getHeight()/m)*2 , secto6);
        
        ////////////////////////////////////////////////////////////////////////
        //07
        sector(0, (imageActual.getHeight()/m)*2 , pivoteX , imageActual.getHeight(),secto7 );
        //08
        sector((imageActual.getWidth()/n)*1 , (imageActual.getHeight()/m)*2 ,
                (imageActual.getWidth()/n)*2  , imageActual.getHeight(),secto8 );
        //09
        sector((imageActual.getWidth()/n)*2 , (imageActual.getHeight()/m)*2 , 
                imageActual.getWidth(), imageActual.getHeight() , secto9);
         
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
