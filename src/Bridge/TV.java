package Bridge;

public class TV implements Dispositivo{
	private int canal;
	private int volumen;
	@Override
	public void acticar() {
		// TODO Esbozo de método generado automáticamente
		
	}
	@Override
	public void desactivar() {
		// TODO Esbozo de método generado automáticamente
		
	}
	@Override
	public void permitir() {
		// TODO Esbozo de método generado automáticamente
		
	}
	@Override
	public int getVolumen() {
		// TODO Esbozo de método generado automáticamente
		return volumen;
	}
	@Override
	public void setVolumen(int volumen) {
		// TODO Esbozo de método generado automáticamente
		this.volumen = volumen;
	}
	@Override
	public int getChannel() {
		// TODO Esbozo de método generado automáticamente
		return canal;
	}
	@Override
	public void setChannel(int canal) {
		// TODO Esbozo de método generado automáticamente
		this.canal = canal;
	}
}
