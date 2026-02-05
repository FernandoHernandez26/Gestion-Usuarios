package usuario;
import java.util.Scanner;
public class PedirDatos {

	protected String nombre;
	protected String email;
	protected int nomina;
	
	// Constructor}
	public PedirDatos () {
		
	}
	
	
	public PedirDatos(String nombre, String email, int nomina) {
		this.nombre = nombre;
		this.email = email;
		this.nomina = nomina;
	}
	
	
	
	// Metodo para datos de usuario 
	 public void DatosUsuario() {
		 Scanner leer = new Scanner(System.in);
		 
		 System.out.println("Ingresa tu nombre: ");
		 nombre = leer.nextLine();
		 
		 System.out.println("Ingresa tu email: ");
		 email = leer.nextLine();
		 
		 System.out.println("Ingresa tu nomina");
		 nomina = leer.nextInt();
		 
		 leer.close();
	 }
		 
	
	public void mostrarMenu() {
			System.out.println(" MENU ");
			System.out.println("1. Ver Ingresos ");
			System.out.println("2. Ver gastos ");
			System.out.println("3. Salir ");
			System.out.println("Elige una opcion ");
	}
		 
	 }
	
	 
	 
	
		
	
	
	

