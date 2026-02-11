package gestion_usuario_ingreso;

import java.util.Scanner;

public class MenUsuario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Ingresos ingreso = new Ingresos();
		ingreso.ventaWallapod(sc);
		ingreso.Pedirdatos(sc);
		System.out.println(ingreso.calculoIngreso());
		System.out.println(ingreso.toString());
	}

}
