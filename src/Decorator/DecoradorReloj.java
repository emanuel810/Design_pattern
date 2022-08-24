package Decorator;

public abstract class DecoradorReloj implements Reloj{

    private final Reloj reloj;

    public DecoradorReloj(Reloj reloj){
        this.reloj = reloj;
    }

    @Override
    public void crearFuncionalidad() {
        this.reloj.crearFuncionalidad();
    }


}