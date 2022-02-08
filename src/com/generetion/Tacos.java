package com.generetion;

public class Tacos {
	
	//Caracteristicas
	private String tipoDeTortilla;
	private String tipoDeGuisado;
	private int numeroDeTortillas;
	private String tamanioDeTortilla;
	private float precio;
	
	
	
	//getters && setters       ///////////////////////REYNA
	

	public String getTipoDeTortilla() {
		return this.tipoDeTortilla;
	}


	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}


	public String getTipoDeGuisado() {
		return this.tipoDeGuisado;
	}


	public void setTipoDeGuisado(String tipoDeGuisado) {
		this.tipoDeGuisado = tipoDeGuisado;
	}


	public int getNumeroDeTortillas() {
		return this.numeroDeTortillas;
	}


	public void setNumeroDeTortillas(int numeroDeTortillas) {
		if(numeroDeTortillas>=1 && numeroDeTortillas<4) {
			this.numeroDeTortillas = numeroDeTortillas;
		}else {
			throw new IllegalArgumentException("Demasiadas tortillas para un taco.");
		}
		
	}


	public String getTamanioDeTortilla() {
		return this.tamanioDeTortilla;
	}


	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}


	public float getPrecio() {
		return this.precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}

	
	
	@Override
	public String toString() {
		return "Tacos [tipoDeTortilla=" + tipoDeTortilla + ", tipoDeGuisado=" + tipoDeGuisado + ", numeroDeTortillas="
				+ numeroDeTortillas + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	///////////////////////////////////////////

	
	
	//Constructor = metodo que se invoca para inicializar objetos.
	// cada clase tiene un constructor, implicito o no.
	
	

	/*
	public Tacos() {
		//Esta es otra manera, lo manipulas
		// desde el main el objeto
		//si no tienes contructor.
	}
	*/
	
	/*
	 
	public Tacos(String tipoDeTortilla, String tipoDeGuisado, int numeroDeTortillas, String tamanioDeTortilla,
			float precio) {
		
		this.tipoDeTortilla = tipoDeTortilla;
		this.tipoDeGuisado = tipoDeGuisado;
		this.numeroDeTortillas = numeroDeTortillas;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	*/
	


	//Acciones-Metodos
	void preparar() {
		System.out.println("Preparando tu pedido.");
	}
	

	void vender() {
		System.out.println("Taco vendido.");
	}
	
	void ponerSalsa() {
		System.out.println("Agregando salsa de la que no pica.");
	}
	
	void subirPrecio(float aumento) {
		precio = precio + aumento;
	}


}
