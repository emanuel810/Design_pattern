package Builder;

public class ManualBuilder implements Builder {
	
	private Manual manual;
	
	
	public ManualBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		// TODO Esbozo de m�todo generado autom�ticamente
		this.manual = new Manual();
		
	}

	@Override
	public int setAsiento(int asientos) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return 0;
	}

	@Override
	public String setMotor(String motor) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return null;
	}

	@Override
	public String setGPS(String gps) {
		// TODO Esbozo de m�todo generado autom�ticamente
		return null;
	}
	
	public Manual getResultado() {
		Manual producto = this.manual;
		this.reset();	
		return producto;
	}

}
