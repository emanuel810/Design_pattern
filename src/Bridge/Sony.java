package Bridge;

public class Sony extends ControlRemoto{


	
	public Sony(Dispositivo dispositivo) {
		super(dispositivo);
		// TODO Esbozo de constructor generado autom�ticamente
	}
	
	public void mute() {
		dispositivo.setVolumen(0);
	}


}
