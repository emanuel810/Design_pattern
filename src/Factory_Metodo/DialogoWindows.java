package Factory_Metodo;

public class DialogoWindows implements Dialogo {

	@Override
	public Boton crearBoton() {
		// TODO Esbozo de m�todo generado autom�ticamente
		Boton boton = null;
		boton = new WindowsBoton("Windows");
		return boton;
	}
}
