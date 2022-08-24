package Singlenton;

public class Main {
	public static void main(String[] args) {
		
		//Se creo un objeto No.1
		BaseDeDatos poo1 = BaseDeDatos.getBase();
		
		
		//Se creo un objeto No.2
		BaseDeDatos poo2 = BaseDeDatos.getBase();
		
		
		//Se hace la comparacion si los 2 objetos son el mismo
		System.out.print(poo1 == poo2);
	}
}
