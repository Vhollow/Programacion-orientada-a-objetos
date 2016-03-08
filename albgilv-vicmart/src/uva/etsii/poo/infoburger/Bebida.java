package uva.etsii.poo.infoburger;

public class Bebida extends ProductoIndividual{

	private boolean azucar;
	private boolean cafeina;
		
	/**
	 * 
	 * @param nombre nombre del producto
	 * @param descripcion descripcion del producto
	 * @param precio precio del producto
	 * @param calorias calorias del producto
	 * @param azucar True si la bebida es con azucar false en caso contrario
	 * @param cafeina True si la bebida es con cafeina false en caso contrario
	 */
	public Bebida(String nombre, String descripcion, Double precio, int calorias, boolean azucar,boolean cafeina){
		
		super(nombre, descripcion,precio,calorias);
		this.azucar=azucar;
		this.cafeina=cafeina;
	}
	
	/**
	 * 
	 * @return True si la bebida tiene azucar.False si no.
	 */
	public boolean isAzucar() {
		
		return azucar;
	}
	
	/**
	 * 
	 * @return True si la bebida tiene cafeina.False si no.
	 */
	public boolean isCafeina() {
		
		return cafeina;
	}
	

}
