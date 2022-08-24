package Decorator;

public class RelojSimple implements Reloj{


    private void añadirTemporizador(){
        System.out.println("- Temporizador");
    }

    @Override
    public void crearFuncionalidad() {
        System.out.println("Reloj básico");
        this.añadirTemporizador();
    }
}