//https://jarroba.com/multitarea-e-hilos-en-java-con-ejemplos-ii-runnable-executors/
package Thread;

import java.util.ArrayList;
import percentage.extractPixel;

/**
 *
 * @author Juanma
 */
public class ImgRunnable implements Runnable {

        //-----VARIEABLE--------//    
	private ImgProcess cliente;
	private long initialTime;
        ArrayList<Integer> ids = new ArrayList<>();
        //----------------------//
        
        
	
        
   //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
   
    public ImgRunnable(ImgProcess pdate, long init) {
        this.cliente = pdate;
    }
    //----------------------------------------------------//
	@Override
	public void run() {
//            System.out.println("\"La cajera " + Thread.currentThread().getName() 
//				+ "\" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getName()
//				+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
           try {
                for (int i = 0; i <(this.cliente.getPixelColor().length); i++) {
	          ids.add(this.cliente.getPixelColor()[i].getId());
		}
                }  
             catch(Exception e){
      
             }

            
            

		
	}
        //-------------------------------GET&SET-------------------------------//
        //-----------------GETSEC------------------//
	private void esperarXsegundos() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
        //-----------------------------------------//

        //----------GETTIME----------//
	public long getInitialTime() {
		return initialTime;
	}
        //---------------------------//

        //-----------SETTIME-----------------------//
	public void setInitialTime(long initialTime) {
		this.initialTime = initialTime;
	}
        //------------------------------------------//

        //------------SETCLIENTE-------------------//
	public ImgProcess getCliente() {
		return cliente;
	}
        //------------------------------------------//
        
        //------------GETCLIENTE-------------------//
	public void setCliente(ImgProcess cliente) {
		this.cliente = cliente;
	}
        //------------------------------------------//
}
