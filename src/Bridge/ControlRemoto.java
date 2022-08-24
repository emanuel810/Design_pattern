package Bridge;

public class ControlRemoto {

	protected Dispositivo dispositivo;
	
	
	public ControlRemoto(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	};
	
	
	public void encender(int uno) {
		if(uno ==1) {
			dispositivo.acticar();
		}else {
			dispositivo.desactivar();
		}
	
	}
	
	
	public void bajarvolumen() {
		dispositivo.setVolumen(dispositivo.getVolumen()-10);
	}
	
	
	
	public void subirvolumen() {
		dispositivo.setVolumen(dispositivo.getVolumen()+10);
	}
	
	public void subirCanal() {
		dispositivo.setChannel(dispositivo.getChannel()+10);
	}
	
	
	public void bajarCanal() {
		dispositivo.setChannel(dispositivo.getChannel()-10);
	}
	
}


