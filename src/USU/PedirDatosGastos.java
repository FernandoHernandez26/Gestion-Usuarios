package USU;
import java.util.Scanner;
public class PedirDatosGastos {

    // Atributos
	
    private int alquiler = 700;    
    private double gastosVarios = 0;

    // Constructor 
    public PedirDatosGastos() {
    
    }

    // Métodos
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.gastosVarios += cantidad;
            System.out.println("Gasto añadido: " + cantidad + " €");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }
    
    public void gasto () {
	Scanner leer = new Scanner(System.in);
    	
    	double cantidad;

        do {
            System.out.println("Introduce tus gastos sino teclea el número 0 para salir: ");
            cantidad = leer.nextDouble();

            if (cantidad > 0) {
                ingresar(cantidad);
            }

        } while (cantidad != 0);
	
    	leer.close();
    }
    

    public double calcularTotal() {
        return alquiler + gastosVarios;
    }

    // Getters
    public int getAlquiler() {
        return alquiler;
    }

    public double getGastosVarios() {
        return gastosVarios;
    }
}