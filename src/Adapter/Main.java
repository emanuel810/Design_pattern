package Adapter;

public class Main {

	public static void main(String[] args) {
		
		AgujeroCircular agujero = new AgujeroCircular(5);
		EspacioRedondo redondo = new EspacioRedondo(5);
		
		//retorna verdadero, ya que contiene el mismo area
		System.out.println( agujero.encajar(redondo));
		
		
		//creamos 2 objetos con sus areas
		EspacioCuadrado peque�oCuadrado = new EspacioCuadrado(5);
		EspacioCuadrado grandeCuadrado = new EspacioCuadrado(10);
		
		
		//es incompatible ya que no pide los mismos argumentos
		//agujero.encajar(peque�oCuadrado);
		
		
		//pasa por el adaptador
		EspacioCuadradoAdapter peque�oAdaptado = new EspacioCuadradoAdapter(0,peque�oCuadrado);
		EspacioCuadradoAdapter grandeAdaptado = new EspacioCuadradoAdapter(0,grandeCuadrado);
		
		
		
		//es compatible ya que hereda de la clase padre
		System.out.println(agujero.encajar(peque�oAdaptado));
		System.out.println(agujero.encajar(grandeAdaptado));
		
		System.out.print(peque�oAdaptado.getRadio());
	}
	
}
