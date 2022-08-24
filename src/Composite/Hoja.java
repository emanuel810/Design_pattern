package Composite;

public class Hoja implements Grafico {
	private int x,y;
	
	
	public Hoja(int x, int y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public void move(int x, int y) {
		// TODO Esbozo de método generado automáticamente
		this.x =+ x;
		this.y =+ y;
	}


	@Override
	public void dibujar() {
		// TODO Esbozo de método generado automáticamente
		
	}
	
	
	
	
}
