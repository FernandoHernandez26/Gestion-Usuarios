package USU;

public class Principal01 {
	    public static void main(String[] args) {

	     
	        PedirDatosGastos gasto = new PedirDatosGastos();
	        gasto.gasto();

	        
	        System.out.println("----------------------------");
	        System.out.println("Gastos varios: " + gasto.getGastosVarios() + " €");
	        System.out.println("Total a pagar: " + gasto.calcularTotal() + " €");
	    }
	}


