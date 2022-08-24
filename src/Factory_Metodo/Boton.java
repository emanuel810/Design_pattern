package Factory_Metodo;

public abstract class Boton {

	private String modelo;
	
	public Boton(String modelo) {
		this.setModelo(modelo);
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
 