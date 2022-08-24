package Abstract_Factory;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		AbstractFactory factory;
		
		
		boolean carro = false;
		
		boolean moto = false;
		
		Random numero = new Random();
		int resultado = numero.nextInt(10);
		
		
		//dependiendo el resultado escojera si es automatico o mecanico
		if(resultado>5) {
			factory = new FactoryAutomatico();
		}else {
			factory = new FactoryMecanico();
		}
		
		
		//y de igual manera, el resultado que tenga  devolvera un carro o una moto
		if(resultado>5) {
			System.out.println(factory.getCarro());
		}else {
			System.out.println(factory.getMoto());
		}
		
		
	}

}
