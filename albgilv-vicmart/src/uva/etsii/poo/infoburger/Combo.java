package uva.etsii.poo.infoburger;

import java.util.ArrayList;

public class Combo extends Producto{

	private ArrayList<Producto> productos;
	
	public Combo(String nombre, String descripcion, ArrayList<Producto> productos){
		super(nombre, descripcion);
		this.productos=productos;
	}
	
	
	
	/**
	 * 
	 * @param producto Producto a añadir al combo
	 */
	public void añadir(Producto producto){
		
		this.productos.add(producto);
	}
	
	/**
	 * 
	 * @return
	 */
	public double getPrecio(){
		
		double precio=0;
		Producto prod;
		for(int i=0;i<productos.size();i++){
			prod=productos.get(i);
			if( prod instanceof Combo){
				precio+=prod.getPrecio()*1.25;
			}else{
				precio+=prod.getPrecio();
			}
		}
		return precio*0.8;
	}
	
	public int getCalorias(){
		
		int calorias=0;
		for(int i=0;i<productos.size();i++){
			
			calorias+=productos.get(i).getCalorias();
		}
		return calorias;
	}
}
