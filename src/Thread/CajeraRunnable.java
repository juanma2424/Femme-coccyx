
package Thread;



public class CajeraRunnable implements Runnable {

        //-----VARIEABLE--------//    
	private Cliente cliente;
	private long initialTime;
        //----------------------//
        
        //-----------CONSTRUCTOR----CLIENTE---TIEMPO-----------//
	public CajeraRunnable(Cliente cliente, long initialTime) {
		this.cliente = cliente;
		this.initialTime = initialTime;
	}
        //----------------------------------------------------//

	@Override
	public void run() {
		System.out.println("\"La cajera " + Thread.currentThread().getName() 
				+ "\" COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + this.cliente.getNombre() 
				+ " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

		for (int i = 0; i < this.cliente.getCarroCompra().length; i++) {
			// Se procesa el pedido en X segundos
			this.esperarXsegundos(cliente.getCarroCompra()[i]);
			System.out.println("Procesado el producto " + (i + 1) + " del " + this.cliente.getNombre() 
				+ "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
		}

		System.out.println("\"La cajera " + Thread.currentThread().getName() + "\" HA TERMINADO DE PROCESAR " 
				+ this.cliente.getNombre() + " EN EL TIEMPO: "
				+ (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

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
	public Cliente getCliente() {
		return cliente;
	}
        //------------------------------------------//
        
        //------------GETCLIENTE-------------------//
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
        //------------------------------------------//
}
