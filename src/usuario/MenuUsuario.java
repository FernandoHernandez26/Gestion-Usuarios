package usuario;
import java.util.Scanner;
public class MenuUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
			
			PedirDatos usuario = new PedirDatos();
			usuario.DatosUsuario();
			
			// crear menu 
			
			int opcion;
			
			do {
	            System.out.println("\nMenú de Operaciones:");
	            System.out.println("1. Ver Ingresos");
	            System.out.println("2. Ver Gastos");
	            System.out.println("3. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = leer.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("\nIngresos " + usuario.nomina);
	                    break;
	                    
	                case 2:
	                   System.out.println("Gastos"  );
	                    break;

	                case 3:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción no válida. Inténtalo de nuevo.");
	                    break;
	            }
	        } while (opcion != 3);
			
		leer.close();
	}

}
