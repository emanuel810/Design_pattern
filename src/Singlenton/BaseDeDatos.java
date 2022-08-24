package Singlenton;

public class BaseDeDatos {

	private static BaseDeDatos instancia;
	
	private BaseDeDatos() {
		
	}
	
	public static BaseDeDatos getBase() {
		
		if(BaseDeDatos.instancia ==null) {
			BaseDeDatos.instancia = new BaseDeDatos();
		}
		
		return BaseDeDatos.instancia;
	}
	
	
	public String select(String vairable) {
		return vairable;

	}
}
