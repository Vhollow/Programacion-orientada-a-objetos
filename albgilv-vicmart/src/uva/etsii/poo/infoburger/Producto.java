package uva.etsii.poo.infoburger;

public abstract class Producto {

	private String nombre;
	private String descripcion;
	
	/**
	 * 
	 * @param nombre caracteriza el producto por el nombre
	 * @param descripcion proporciona una descripcion del producto
	 */
	public Producto(String nombre, String descripcion){
		
		this.nombre=nombre;
		this.descripcion=descripcion;
	}
	
	public abstract double getPrecio();
	public abstract int getCalorias();
	
	
	/**
	 * 
	 * @return devuelve la descripcion del producto
	 */
	public String getDescripcion() {
		
		return descripcion;
	}




}
