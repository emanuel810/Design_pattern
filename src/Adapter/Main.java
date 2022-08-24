package Adapter;

public class Main {

	public static void main(String[] args) {
		
		AgujeroCircular agujero = new AgujeroCircular(5);
		EspacioRedondo redondo = new EspacioRedondo(5);
		
		//retorna verdadero, ya que contiene el mismo area
		System.out.println( agujero.encajar(redondo));
		
		
		//creamos 2 objetos con sus areas
		EspacioCuadrado pequeñoCuadrado = new EspacioCuadrado(5);
		EspacioCuadrado grandeCuadrado = new EspacioCuadrado(10);
		
		
		//es incompatible ya que no pide los mismos argumentos
		//agujero.encajar(pequeñoCuadrado);
		
		
		//pasa por el adaptador
		EspacioCuadradoAdapter pequeñoAdaptado = new EspacioCuadradoAdapter(0,pequeñoCuadrado);
		EspacioCuadradoAdapter grandeAdaptado = new EspacioCuadradoAdapter(0,grandeCuadrado);
		
		
		
		//es compatible ya que hereda de la clase padre
		System.out.println(agujero.encajar(pequeñoAdaptado));
		System.out.println(agujero.encajar(grandeAdaptado));
		
		System.out.print(pequeñoAdaptado.getRadio());
	}
	
}
