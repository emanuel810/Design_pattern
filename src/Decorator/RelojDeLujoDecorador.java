package Decorator;

public class RelojDeLujoDecorador extends DecoradorReloj{

    public RelojDeLujoDecorador(Reloj reloj) {
        super(reloj);
    }

    private void A�adirImpermeabilidad(){
        System.out.println("- Impermeabilidad");
    }

    private void A�adirCargaRapida(){
        System.out.println("- Carga R�pida");
    }

    private void A�adirNFC(){
        System.out.println("- NFC, campo de comunicaci�n cercano");
    }


    @Override
    public void crearFuncionalidad() {
        super.crearFuncionalidad();
        System.out.println("mas caracter�sticas de Reloj de Lujo (Decorador)");
        this.A�adirImpermeabilidad();
        this.A�adirCargaRapida();
        this.A�adirNFC();

    }
}