package com.gatitos;

public class Gato {
	//atributos
		private String nombre;
		private int patas;
		private boolean adoptado;
		
		//constructor
		
		public Gato(String nombre, int patas, boolean adoptado) {
			this.nombre = nombre;
			this.patas = patas;
			this.adoptado = adoptado;
		}
		
		
		
		
		
	//todos los metodos getter y setter deben ser publicos
		
		public String getNombre() {
			return this.nombre;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public int getPatas() {
			return this.patas;
		}
		public void setPatas(int patas) {
			if(patas>0 && patas<5) {
				this.patas = patas;
			}else {
				throw new IllegalArgumentException("No es un gato.");
			}
			
			
		}
		
		
		public boolean isAdoptado() {
			return this.adoptado;
		}
		public void setAdoptado(boolean adoptado) {
			this.adoptado = adoptado;
		}
		
		
		//metodo toString desde source
		@Override
		public String toString() {
			return "Gato [getNombre()=" + getNombre() + ", getPatas()=" + getPatas() + ", isAdoptado()=" + isAdoptado()
					+ "]";
		}
		
		
		
		



	
		
		
}
