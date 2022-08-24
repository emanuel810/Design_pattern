package Chain_of_Responsability;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		SuperintendenciaDeBancos acceso5 = new SuperintendenciaDeBancos();
		//acceso5 no debe sobrepasar lo que el banco no puede hacer 
		BancoCentral  acceso4 = new BancoCentral(acceso5);
		//acceso4 no debe sobrepasar los 500,000 
		Gerente acceso3 = new Gerente(acceso4);
		//acceso3 no debe sobrepasar los 100,000 
		AsesorDeCreditos acceso2 = new AsesorDeCreditos(acceso3);
		//acceso2 no debe sobrepasar los 50,000 
		ServicioAlCliente acceso1 = new ServicioAlCliente(acceso2);
		//acceso1 no debe sobrepasar los 25,000 
	
				
		//Solicitud
		System.out.println(acceso1.CalcularCredito(400000));
	}

}
