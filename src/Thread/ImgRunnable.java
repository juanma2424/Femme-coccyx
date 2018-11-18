//https://jarroba.com/multitarea-e-hilos-en-java-con-ejemplos-ii-runnable-executors/
package Thread;

import percentage.extractPixel;

/**
 *
 * @author Juanma
 */
public class ImgRunnable implements Runnable {

        //-----VARIEABLE--------//    
	private ImgProcess cliente;
	private long initialTime;
        //----------------------//
        
        
	
        
   //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
   
    public ImgRunnable(ImgProcess pdate, long init) {
        this.cliente = pdate;
        this.initialTime = init;
    }
    //----------------------------------------------------//
	@Override
	public void run() {
//            System.out.println("\"La cajera " + Thread.currentThread().getName() 
//				+ "\" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getName()
//				+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

            for (int i = 0; i <(this.cliente.getPixelColor().length); i++) {
			
	         // System.out.println(this.cliente.getPixelColor()[i]);
		}

		
	}
        
        
        //-------------------------------GET&SET-------------------------------//
        //-----------------GETSEC------------------//
	private void esperarXsegundos(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
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
