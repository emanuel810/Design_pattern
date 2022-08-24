package Bridge;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		TV tv = new TV();
		ControlRemoto control = new ControlRemoto(tv);
		
		
		//como se puede ver, tiene relacion con uno u otro objeto del patron, pero con el detalle
		//de separar la abstracccion de la interfaz
		Radio radio = new Radio();
		control = new Sony(radio);
		
		
	}

}
