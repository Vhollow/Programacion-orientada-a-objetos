package uva.etsii.poo.infoburger;

import java.util.ArrayList;

public class UsaProductosInfoBurguer {

	public static void main(String[] args) {
	
		/*ingredientes*/
		String lechuga = "lechuga";
		String tomate = "tomate";
		String ternera = "ternera";
		String pollo = "pollo";
		String pan = "pan";
		String bacon = "bacon";
		String ketchup = "ketchup";
		
		ArrayList<String> normal = new ArrayList<String>();
		
		normal.add(pan);
		normal.add(ternera);
		normal.add(tomate);
		normal.add(ketchup);
		
		ArrayList<String> chiken = new ArrayList<String>();
		
		chiken.add(pan);
		chiken.add(pollo);
		chiken.add(lechuga);
		chiken.add(tomate);
		chiken.add(ketchup);
		
		/*crear hamburguesas*/
		Hamburguesa hamburguesanormal = new Hamburguesa("normal","ternera basica",3.99,350,normal);
		Hamburguesa crispychiken = new Hamburguesa("pollo", "pollo basica", 3.99,340, chiken);
		
		System.out.println("el precio antiguo de la hamburguesanormal es: "+hamburguesanormal.getPrecio());
				
		hamburguesanormal.setPrecio(4.0);
		
		System.out.println("el nuevo precio de la hamburguesanormal es: "+hamburguesanormal.getPrecio());
				
		System.out.println("las calorias de la crispychiken son: "+crispychiken.getCalorias()+"\n");
		
		/*crear bebidas*/
		Bebida cocacola = new Bebida("cola","cocacola",2.0,45,true,true);
		Bebida colazero = new Bebida("colazero","cocacolazero",2.0,35,false,true);
		Bebida colasin = new Bebida("colasin","cocacolasin",2.0,40,true, false);
		Bebida naranja = new Bebida("fanta", "naranja", 2.0,50,true,false);
		
		System.out.println("la colasin tiene cafeina? "+colasin.isCafeina());
		System.out.println("la colasin tiene azucar? "+colasin.isAzucar()+"\n");
		System.out.println("la colazero tiene azucar? "+colazero.isAzucar()+"\n");
		System.out.println("la naranja tiene azucar y cafeina? "+naranja.isAzucar()+" "+naranja.isCafeina()+"\n");
		
		/*crear complementos*/
		
		Complemento fingers = new Complemento("fingers","fingers de pollo",2.0,25,2);
		Complemento patatas = new Complemento("patatas","patatas fritas",2.0,20,1);
		
		System.out.println("para cuantas personas son los fingers? "+fingers.getNumero_comensales()+"\n");
		
		/*crear combos*/
		
		ArrayList<Producto> menu1 = new ArrayList<Producto>();
		
		menu1.add(hamburguesanormal);
		menu1.add(patatas);
		menu1.add(cocacola);
		
		
		
		Producto menu = new Combo("menu","menu ternera",menu1);
		
		/*crear combo con un combo*/
		
		ArrayList<Producto> menu2 = new ArrayList<Producto>();
		
		menu2.add(crispychiken);
		menu2.add(menu);
		
		Producto menudoble = new Combo("menudoble","menu 2 hamburguesas",menu2);
		
		
		/*probar el precio de descuento del combo*/
		
		System.out.println("el precio del combo menu es: "+menu.getPrecio()+
				" mientras que el precio de los productos incividualmente es de: "
				+(hamburguesanormal.getPrecio()+patatas.getPrecio()+cocacola.getPrecio())+"\n");
		
		System.out.println("el precio del combo menu2 es: "+menudoble.getPrecio()+
				" mientras que el precio de los productos incividualmente es de: "
				+(crispychiken.getPrecio()+hamburguesanormal.getPrecio()+patatas.getPrecio()+cocacola.getPrecio())+"\n");
		
		/*probar las calorias del combo*/
		
		System.out.println("las calorias del combo son: "+ menu.getCalorias()+" = "
				+(hamburguesanormal.getCalorias()+patatas.getCalorias()+cocacola.getCalorias())
				+" que es la suma de las calorias de los productos individuales\n");
		
	}

}
