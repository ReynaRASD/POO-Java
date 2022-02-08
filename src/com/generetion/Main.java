package com.generetion;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creando objetos.
		
		//Primer objeto
		//Tacos taco1 = new Tacos("Masa azul", "Suadero", 2, "Mediana", 30f);
		//segunda manera de darle especificaciones al constructor.
		
		
		//atributos
		/*taco1.tipoDeTortilla = "Masa azul";
		taco1.tipoDeGuisado = "Suadero";
		taco1.numeroDeTortillas = 2;
		taco1.tamanioDeTortilla = "Mediana";
		taco1.precio = 30f;
		*/
		//taco1.subirPrecio(5.5f);
		
		
		
		/*
		//Cada objeto es responsable de su propia informacion.
		Tacos taco2 = new Tacos();
		taco2.tipoDeTortilla = "Trigo";
		taco2.tipoDeGuisado = "Bisteck";
		taco2.numeroDeTortillas = 1;
		taco2.tamanioDeTortilla = "Grande";
		taco2.precio = 45.6f; //se agrega la f de float
		
		
		
		Tacos taco3 = new Tacos();
		taco2.tipoDeGuisado = "Tripa";
		
		System.out.println(taco1.toString());
		System.out.println(taco2.toString());
		System.out.println(taco3.toString());
		*/
		
		Tacos tacoReyna = new Tacos();
		
		tacoReyna.setNumeroDeTortillas(3);
		tacoReyna.setPrecio(40);
		tacoReyna.setTipoDeTortilla("Harina");
		tacoReyna.setTipoDeGuisado("Bisteck");
		tacoReyna.setTamanioDeTortilla("Grande");
		
		System.out.println(tacoReyna.toString());
	}

}
