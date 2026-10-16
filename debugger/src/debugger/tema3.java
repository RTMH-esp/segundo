package debugger;

import java.util.Scanner;

public class tema3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		do {
			mostrarMenu();
			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.print("Introduce altura: ");
				int altura = entrada.nextInt();
				cuadrado(altura);
				break;
			case 2:
				System.out.print("Introduce altura: ");
				int altura2 = entrada.nextInt();
				cuadradoSinRelleno(altura2);
				break;
			case 3:
				System.out.print("Introduce altura: ");
				int altura3 = entrada.nextInt();
				System.out.print("Introduce base: ");
				int base = entrada.nextInt();
				rectangulo(altura3, base);
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opción no válida. Intenta de nuevo.");
			}
		} while (opcion != 3);

		entrada.close();
	}

	/**
	 * Muestra el menú de selección de figura
	 */
	static void mostrarMenu() {
		System.out.println("""

				/-----------------------------------------/
				/ Selecciona una opción entre 1 y 3       /
				/-----------------------------------------/
				/  1 - Dibujar cuadrado                   /
				/  2 - Dibujar cuadrado sin relleno       /
				/  3 - Dibujar rectangulo sin relleno     /
				/  4 - Salir                              /
				/-----------------------------------------/
				""");
	}

	/**
	 * Dibuja un cuadrado con relleno formado por asteriscos
	 *
	 * @param n Es el lado del cuadrado
	 */
	static void cuadrado(int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Dibuja un cuadrado sin relleno formado por asteriscos
	 *
	 * @param n Es el lado del cuadrado
	 */
	static void cuadradoSinRelleno(int n) {
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == 0 || j == n - 1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
	}

/**
 * Dibuja un rectangulo sin relleno formado por asteriscos
 *
 * @param n Es el lado del rectangulo
 * @param m Es el lado del rectangulo
 */
static void rectangulo(int n, int m) {
	System.out.println();
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (i == 0 || i == n - 1 || j == 0 || j == m - 1)
				System.out.print("* ");
			else
				System.out.print("  ");
		}
		System.out.println();
	}
	System.out.println();
}
}
