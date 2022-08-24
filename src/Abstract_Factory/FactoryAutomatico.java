package Abstract_Factory;



public class FactoryAutomatico implements AbstractFactory{

	@Override
	public Carro getCarro() {
		// TODO Esbozo de método generado automáticamente
		 return new CarroAutomatico("2021","blanco");
	}

	@Override
	public Moto getMoto() {
		// TODO Esbozo de método generado automáticamente
		return new MotoAutomatica("2021","negro");
	}

}
