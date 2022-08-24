package Prototype;

public class Circulo implements Formas{

	private int radio;
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public Circulo() {
		
	}
	
	public Circulo(Circulo circulo) {
		this.radio = circulo.radio;
	}

	@Override
	public Formas clonar() {
		// TODO Esbozo de m�todo generado autom�ticamente
		return new Circulo(this);
	}
	


	

}
