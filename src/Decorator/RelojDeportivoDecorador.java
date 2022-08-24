package Decorator;

public class RelojDeportivoDecorador extends DecoradorReloj{


    public RelojDeportivoDecorador(Reloj reloj) {
        super(reloj);
    }

    private void A�adirPodometro(){
        System.out.println("- Pod�metro: contador de pasos");
    }
    private void A�adirModoSue�o(){
        System.out.println("- Modo de Sue�o: monitorear calidad de sue�o");
    }

    @Override
    public void crearFuncionalidad() {
        super.crearFuncionalidad();
        System.out.println("mas caracter�sticas de Reloj Deportivo (Decorador)");
        this.A�adirModoSue�o();
        this.A�adirPodometro();
    }
}