package Adapter;

public class EspacioCuadradoAdapter extends EspacioRedondo {
	
	
	private EspacioCuadrado adaptador;
	
	
	public EspacioCuadradoAdapter(int radio,EspacioCuadrado adaptador) {
		super(radio);
		this.adaptador = adaptador;
		// TODO Esbozo de constructor generado automáticamente
	}

	
	//se adapto el area del cuadro para obtener un area redonda
	public int getRadio() {
		return (int) (adaptador.getAncho()) ;
	}

}
