package Decorator;

public class Main {
	
	
	
	
	   //Se puede agregar varias clases en un solo objeto
	
	public static void main(String[] args) {
        //---------1----------
        System.out.println("\n------------------");
        Reloj relojsimple1 = new RelojSimple();
        relojsimple1.crearFuncionalidad();
        System.out.println("\n------------------");
        
        
        
      //---------2----------
        System.out.println("==================");
        System.out.println("reloj deportivo");
        System.out.println("==================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
     
        Reloj relojdeportivo1 = new RelojDeportivoDecorador(new RelojSimple());
        relojdeportivo1.crearFuncionalidad();
        System.out.println("\n------------------");

        
        //---------3----------
        
        System.out.println("==================");
        System.out.println("reloj deportivo/delujo");
        System.out.println("==================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
       
        Reloj relojdeportivodelujo1 = new RelojDeLujoDecorador(new RelojDeportivoDecorador(new RelojSimple()));
        relojdeportivodelujo1.crearFuncionalidad();
        System.out.println("\n------------------");

        System.out.println("==================");
        System.out.println("reloj delujo");
        System.out.println("=================="); 
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        
        Reloj relojdelujo1 = new RelojDeLujoDecorador(new RelojSimple());
        relojdelujo1.crearFuncionalidad();
        System.out.println("\n------------------");

        
        
        System.out.println("==================");
        System.out.println("reloj doblelux");
        System.out.println("==================");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        
        Reloj dobledelux = new RelojDeLujoDecorador(new RelojDeLujoDecorador(new RelojSimple()));
        dobledelux.crearFuncionalidad();

    }
}
