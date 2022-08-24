package Abstract_Factory;

public class FactoryMecanico implements AbstractFactory{

	@Override
	public Carro getCarro() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new CarroMecanico("2022","rojo");
	}

	@Override
	public Moto getMoto() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new MotoMecanica("2022","Azul");
	}
	
}
