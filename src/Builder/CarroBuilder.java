package Builder;

public class CarroBuilder implements Builder {
	
	private Carro carro;

	
	public CarroBuilder() {
		this.reset();
	}
	
	@Override
	public void reset() {
		// TODO Esbozo de m�todo generado autom�ticamente
		this.carro = new Carro();
	}


	@Override
	public int setAsiento(int asientos) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return asientos;
	}


	@Override
	public String setMotor(String motor) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return motor;
	}


	@Override
	public String setGPS(String gps) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return gps;
	}

	
	
	public Carro getResultado() {
		carro = this.carro;
		this.reset();	
		return carro;
	}


}
