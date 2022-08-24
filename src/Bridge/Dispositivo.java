package Bridge;

public interface Dispositivo {
	
	void acticar();
	void desactivar();
	void permitir();
	int getVolumen();
	void setVolumen(int volumen);
	int getChannel();
	void setChannel(int canal);

}
