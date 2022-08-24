package Factory_Metodo;

public class Main {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
	
		Dialogo dialogo;
		
		int uno = 2;
		
		if(uno==1 ) {
			dialogo = new DialogoHTML();
		}else {
			dialogo = new DialogoWindows();
		}
		
		
		//se hizo una confirmacion para crear el boton y devolver el modelo sin saber que objeto fue llamado 
		
		System.out.print(dialogo.crearBoton().getModelo());
	}

}
