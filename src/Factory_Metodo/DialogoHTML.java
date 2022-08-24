package Factory_Metodo;

public class DialogoHTML implements Dialogo{

	@Override
	public Boton crearBoton() {
		Boton boton = null;
		boton = new HTMLBoton("HTML");
		return boton;
	}

}
