package Builder;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de m�todo generado autom�ticamente
		Director director = new Director();
		
		CarroBuilder hilux = new CarroBuilder();
		
		System.out.println(director.construirHilux(hilux));
		
		Carro carro = hilux.getResultado();
		
		
		ManualBuilder manualHilux = new ManualBuilder();
		director.construirHilux(manualHilux);
		Manual manual = manualHilux.getResultado();
	
		
	}

}
