package gestion_usuario_ingreso;

import java.util.Scanner;

public class Ingresos {

	// ATRIBUTOS.
	private int nominaNeto;
	private int cuantiaHerencia;
	private String Wallapod;
	private String nombreProducto;
	private int precioProducto;

	// CONSTRUCTORES.

	public Ingresos() {

	}

	public Ingresos(int nominaNeto, int cuantiaHerencia) {
		this.nominaNeto = nominaNeto;
		this.cuantiaHerencia = cuantiaHerencia;
	}

	public Ingresos(String Wallapod, String nombreProducto, int precioProducto) {
		this.Wallapod = Wallapod;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
	}

	// METODOS.

	public void ventaWallapod(Scanner sc) {
		System.out.println("Has vendido algún producto en wallapod si/no");
		Wallapod = sc.next();

		if (Wallapod.equalsIgnoreCase("si")) {

			System.out.println("Que producto has vendido\n");
			nombreProducto = sc.nextLine();
			sc.next();
			System.out.println("A cuanto vendiste el producto\n");
			precioProducto = sc.nextInt();
		} else {
			precioProducto = 0;
		}

	}

	public void Pedirdatos(Scanner sc) {
		System.out.println("Ingrese la cuantia que le correspondio de herencia\n");
		cuantiaHerencia = sc.nextInt();

		System.out.println("Ingrese su nomina neta");
		nominaNeto = sc.nextInt();

	}

	public int calculoIngreso() {
		int Ingreso = cuantiaHerencia + nominaNeto + precioProducto;
		return Ingreso;
	}

	@Override
	public String toString() {
		return "Ingresos [nominaNeto=" + nominaNeto + ", cuantiaHerencia=" + cuantiaHerencia + ", Wallapod=" + Wallapod
				+ ", nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + "]";
	}
	

}
