package uva.etsii.poo.infoburger;

public abstract class ProductoIndividual extends Producto{

	private double precio;
	private int calorias;
	
	/**
	 * 
	 * @param nombre caracteriza el producto por el nombre
	 * @param descripcion proporciona una descripcion del producto
	 * @param precio precio del producto a vender. Debe ser mayor que 0
	 * @param calorias calorias totales del producto. Debe ser mayor que 0
	 */
	public ProductoIndividual(String nombre, String descripcion, Double precio, int calorias){
		
		super(nombre, descripcion);
		this.precio=precio;
		this.calorias=calorias;
		
	}
	
	/**
	 * 
	 * @param devuelve el precio del producto
	 */
	public double getPrecio(){
		return precio;
	}
	
	/**
	 * 
	 * @return devuelve el numero de calorias
	 */
	public int getCalorias() {
		
		return calorias;
	}
	
	/**
	 * 
	 * @param precio fija el precio al producto
	 */
	public void setPrecio(double precio) {
		
		this.precio = precio;
	}
	
}
