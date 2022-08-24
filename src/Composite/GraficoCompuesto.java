package Composite;

public class GraficoCompuesto implements Grafico {

	private Grafico[] ninos;
	private static int contador = 0;
	
	
	public void agregar(Grafico nino) {
		ninos[contador] = nino;
		contador++;
	}
	
	
	@Override
	public void move(int x, int y) {
		// TODO Esbozo de método generado automáticamente
		for(Grafico nino : ninos) {
			nino.move(x, y);
		}
	}

	@Override
	public void dibujar() {
		// TODO Esbozo de método generado automáticamente
		
	}
	
}
