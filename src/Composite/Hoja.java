package Composite;

public class Hoja implements Grafico {
	private int x,y;
	
	
	public Hoja(int x, int y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public void move(int x, int y) {
		// TODO Esbozo de m�todo generado autom�ticamente
		this.x =+ x;
		this.y =+ y;
	}


	@Override
	public void dibujar() {
		// TODO Esbozo de m�todo generado autom�ticamente
		
	}
	
	
	
	
}
