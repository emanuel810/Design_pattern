package Facade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		FacadeCompra fachada = new FacadeCompra();
		System.out.print("Bienvenido a nuestra tienda");
		
		System.out.println("Desea comprar un cheeto?");
		System.out.print("Si. 1       ");
		System.out.println("No. 2");
		

		Scanner lectura = new Scanner(System.in);
		int respuesta = lectura.nextInt();
		
		if(respuesta==1) {
			
			//solo se debe instanciar una vez, sin acceso a las demas subclases
			fachada.comprar();
		}
		if(respuesta==2) {
			System.out.print("vuelva pronto");
		}else {
			System.out.println("Escoja una de las opciones");
		}

	}

}
