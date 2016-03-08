package uva.etsii.poo.infoburger;

public class Complemento extends ProductoIndividual{

	private int numero_comensales;
	
	/**
	 * 
	 * @param nombre nombre del producto
	 * @param descripcion descripcion del producto
	 * @param precio precio del producto
	 * @param calorias calorias del producto
	 * @param numero_comensales numero de comensales para el producto
	 */
	public Complemento(String nombre, String descripcion, Double precio, int calorias, int numero_comensales){
		
		super(nombre, descripcion,precio,calorias);
		this.numero_comensales=numero_comensales;
	}
	
	/**
	 * 
	 * @return numero de comensales que tiene asignado e producto
	 */
	public int getNumero_comensales() {
		
		return numero_comensales;
	}
	
	/**
	 * 
	 * @param numero_comensales nuevo numero de comensales para el producto
	 */
	/*public void setNumero_comensales(int numero_comensales) {
		
		this.numero_comensales = numero_comensales;
	}*/
}
