package uva.etsii.poo.infoburger;

import java.util.ArrayList;

public class Hamburguesa extends ProductoIndividual{

	protected ArrayList<String> ingredientes=new ArrayList<String>();
	
	/**
	 * 
	 * @param nombre nombre del producto
	 * @param descripcion descripcion del producto
	 * @param precio precio del producto
	 * @param calorias calorias del producto
	 * @param ingredientes ArrayList de ingredientes
	 */
	public Hamburguesa(String nombre, String descripcion, Double precio, int calorias, ArrayList<String> ingredientes){
		
		super(nombre, descripcion,precio,calorias);
		this.ingredientes=ingredientes;
	}

	/**
	 * 
	 * @return devuelve la lista de los ingredientes
	 */
	public ArrayList<String> getIngredientes() {
		
		return this.ingredientes;
	}


}
