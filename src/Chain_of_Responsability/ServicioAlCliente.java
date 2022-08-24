package Chain_of_Responsability;

public class ServicioAlCliente implements Cuenta{
	private Cuenta siguiente;
	
	public ServicioAlCliente(Cuenta siguiente) {
		
		this.siguiente = siguiente;
	}
	 
	@Override
	public double CalcularCredito(double cantidad) {
		// TODO Esbozo de m�todo generado autom�ticamente
		
		if (cantidad >25000) {
			System.out.println("SAC. no pudo solucionarlo...");
			System.out.println("");
			return siguiente.CalcularCredito(cantidad); 
		}else {
			System.out.println("Se solucion� en el area de servicio al cliente");
			return cantidad;
			
		} 
	}
}
