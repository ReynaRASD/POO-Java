package com.gatitos;

public class MainGato {
	public static void main(String[] args) {
		
		Gato g = new Gato("Pato", 4, true);
		
		//g.nombre = "Taco";
		//g.patas = 3;
		//Esto es sin encampsulamiento. 
		
		/*  esto se usa si no tenemos constructor
		g.setNombre("Michi");
		g.setPatas(3);
		g.setAdoptado(true);
		*/
		
		
		System.out.println(g.toString());
		System.out.println("Mi gato se llama " + g.getNombre());
	}
}
