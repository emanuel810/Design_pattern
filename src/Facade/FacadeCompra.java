package Facade;

public class FacadeCompra {
	
	private SubCompra compra = new SubCompra();
	private SubAlmacen almacen = new SubAlmacen();
	private SubEnvio envio = new SubEnvio();

	//por medio de una funcion, se puede acceder a las subclases
	public void comprar() {
		compra.comprar();
		almacen.buscarProducto();
		envio.enviarPedido();
	}
}
