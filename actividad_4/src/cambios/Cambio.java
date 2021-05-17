package cambios;

import java.util.Scanner;

public class Cambio {

	public static void main(String[] args) {

		System.out.println("Prueba con git. Clase cambios para resta");
		System.out.println("RESTA");
		//--------------------------------------------------------------
		
		
		Scanner teclado = new Scanner(System.in);
		int resultado, valor1, valor2;
		valor1 = datos(teclado, "Introduce el primer valor: ");
		valor2 = datos(teclado, "Introduce el segundo valor: ");

		resultado = resta(valor1, valor2);

		System.out.println("La suma de los valores es: " + resultado);

	}

	public static int resta(int a, int b) {

		int resultado = a - b;
		return resultado;
	}

	public static int datos(Scanner sc, String mnsj) {
		System.out.println(mnsj);
		return sc.nextInt();
	}
}
