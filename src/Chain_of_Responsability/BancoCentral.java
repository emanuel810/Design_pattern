package Chain_of_Responsability;

public class BancoCentral implements Cuenta {
	private Cuenta siguiente;
	
	public BancoCentral(Cuenta siguiente) {
		
		this.siguiente = siguiente;
	}
	
	@Override
	public double CalcularCredito(double cantidad) {
		// TODO Esbozo de método generado automáticamente
		
		if (cantidad >500000) {
			System.out.println("El banco central. no pudo solucionarlo...");
			System.out.println("");
			return siguiente.CalcularCredito(cantidad); 
		}else {
			System.out.println("Se solucionó en el area del banco central");
			return cantidad;
		
		} 
	}
}