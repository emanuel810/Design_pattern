package Decorator;

public class RelojSimple implements Reloj{


    private void a�adirTemporizador(){
        System.out.println("- Temporizador");
    }

    @Override
    public void crearFuncionalidad() {
        System.out.println("Reloj b�sico");
        this.a�adirTemporizador();
    }
}