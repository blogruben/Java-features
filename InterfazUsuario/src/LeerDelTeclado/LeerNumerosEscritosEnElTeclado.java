package LeerDelTeclado;

import java.util.Scanner;

/**
 * This program demonstrates keyboard input.
 */
public class LeerNumerosEscritosEnElTeclado {
	public static void main(String[] args) {

		// Metodos de Scanner
		// hasNext() devuelce true si tiene otro token
		// nextInt() escanea como integer
		// nextFloat() escanea como float.
		// nextLine() escanea como String
		// nextDouble() escanea como double.
		// close() cerrar el recurso

		try (Scanner console = new Scanner(System.in);) {
			System.out.print("Sumando 1 : ");
			int primero = console.nextInt();

			System.out.print("Sumando 2 : ");
			int segundo = console.nextInt();

			System.out.println("La suma es " + (primero + segundo));

		}

	}
}