package Prototype;

public class Rectangulo implements Formas{



	private int altura;
	private int anchura;
	
	
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}
	
	public String devolver() {
		return"Anchura: "+anchura+", Altura: "+altura;
	}


	public Rectangulo() {	
	}
	
	public Rectangulo(Rectangulo rectangulo) {
		this.altura = rectangulo.altura;
		this.anchura = rectangulo.anchura;
	}
	
	@Override
	public Formas clonar() {
		// TODO Esbozo de método generado automáticamente
		return new Rectangulo(this);
	}


	
}
