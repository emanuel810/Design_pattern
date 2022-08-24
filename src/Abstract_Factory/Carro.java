package Abstract_Factory;

public abstract class Carro {
	String modelo;
	String color;
	
	
	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Carro(String modelo, String color) {
		super();
		this.modelo = modelo;
		this.color = color;
	}

	
	
}
