package Builder;

public class ManualBuilder implements Builder {
	
	private Manual manual;
	
	
	public ManualBuilder() {
		this.reset();
	}

	@Override
	public void reset() {
		// TODO Esbozo de método generado automáticamente
		this.manual = new Manual();
		
	}

	@Override
	public int setAsiento(int asientos) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public String setMotor(String motor) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public String setGPS(String gps) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}
	
	public Manual getResultado() {
		Manual producto = this.manual;
		this.reset();	
		return producto;
	}

}
