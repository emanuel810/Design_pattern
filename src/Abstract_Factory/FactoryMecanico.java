package Abstract_Factory;

public class FactoryMecanico implements AbstractFactory{

	@Override
	public Carro getCarro() {
		// TODO Esbozo de método generado automáticamente
		return new CarroMecanico("2022","rojo");
	}

	@Override
	public Moto getMoto() {
		// TODO Esbozo de método generado automáticamente
		return new MotoMecanica("2022","Azul");
	}
	
}
