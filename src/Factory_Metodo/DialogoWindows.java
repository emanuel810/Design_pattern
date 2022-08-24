package Factory_Metodo;

public class DialogoWindows implements Dialogo {

	@Override
	public Boton crearBoton() {
		// TODO Esbozo de método generado automáticamente
		Boton boton = null;
		boton = new WindowsBoton("Windows");
		return boton;
	}
}
