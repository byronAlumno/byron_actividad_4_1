package actividad_4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("creacion de variables del ejercicio.");
		System.out.println("Creacion de metodos");
		System.out.println("resolucion del ejercicio.");
		//--------------------------------------------------------
		
		
		System.out.println("Hola, Byron");

		Scanner teclado = new Scanner(System.in);
		int resultado, valor1, valor2;
		valor1 = datos(teclado, "Introduce el primer valor: ");
		valor2 = datos(teclado, "Introduce el segundo valor: ");
		
		resultado = suma(valor1, valor2);
		
		System.out.println("La suma de los valores es: " + resultado);


	}
	
	public static int suma(int a, int b) {
		return a + b;
	}

	public static int datos(Scanner sc, String mnsj) {
		System.out.println(mnsj);
		return sc.nextInt();
	}

}
