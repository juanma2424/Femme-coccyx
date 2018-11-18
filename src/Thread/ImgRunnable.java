/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            System.out.println("\"La cajera " + Thread.currentThread().getName() 
				+ "\" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getName()
				+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

            for (int i = 0; i < this.cliente.getPixelColor().length; i++) {
			// Se procesa el pedido en X segundos
			System.out.println("El COLOR ES  " + (i + 1) + " del " + this.cliente.getPixelColor()[i].getColor()
				+ "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
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
