package Bridge;

public class Sony extends ControlRemoto{


	
	public Sony(Dispositivo dispositivo) {
		super(dispositivo);
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public void mute() {
		dispositivo.setVolumen(0);
	}


}
