package Prototype;

public class Main {
	public static void main(String[] args) {
		
		
		//Se crea el primer objeto
		Rectangulo rectangulo1 = new Rectangulo();
		
		rectangulo1.setAltura(15);
		rectangulo1.setAnchura(20);
		
		
		//ya si se desea copiar todos los atributos del mismo, se utiliza la funcion clonar
		Rectangulo rectangulo2 = (Rectangulo) rectangulo1.clonar();
		
		
		//para comprobar que se copiarion correctamente
		System.out.println(rectangulo1.devolver());
		System.out.println(rectangulo2.devolver());
		System.out.print(rectangulo1==rectangulo2);
	}
}
