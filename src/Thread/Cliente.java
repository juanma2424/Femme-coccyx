
package Thread;


public class Cliente {

        //-------VARIABLE-------//
	private String nombre;
	private int[] carroCompra;
        //----------------------//
        
        //EMPY CONSTRUCTOR//
	public Cliente() {
	}
        //----------------//

        //-------NAME  ARRAY  CONSTRUCTO----------------//
	public Cliente(String nombre, int[] carroCompra) {
		this.nombre = nombre;
		this.carroCompra = carroCompra;
	}
        //----------------------------------------------//

        
        
        //-----------------------GET&SET-----------------------//
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int[] getCarroCompra() {
		return carroCompra;
	}

	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}
        //-----------------------------------------------------//

}
