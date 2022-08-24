package Adapter;

public class AgujeroCircular {
	
	private int radio;
	
	public AgujeroCircular(int radio) {
		this.radio = radio;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	
	public boolean encajar(EspacioRedondo redondo) {
		
		
		return this.getRadio() == redondo.getRadio();
	}
	

}
