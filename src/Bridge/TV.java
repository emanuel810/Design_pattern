package Bridge;

public class TV implements Dispositivo{
	private int canal;
	private int volumen;
	@Override
	public void acticar() {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}
	@Override
	public void desactivar() {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}
	@Override
	public void permitir() {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}
	@Override
	public int getVolumen() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return volumen;
	}
	@Override
	public void setVolumen(int volumen) {
		// TODO Esbozo de m�todo generado autom�ticamente
		this.volumen = volumen;
	}
	@Override
	public int getChannel() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return canal;
	}
	@Override
	public void setChannel(int canal) {
		// TODO Esbozo de m�todo generado autom�ticamente
		this.canal = canal;
	}
}
