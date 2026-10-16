package debugger;

import java.util.Scanner;

public class programacion {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		Double n;
		System.out.println("Introduce la nota para saber tu calificación:");
		n = entrada.nextDouble();
		if (n >= 9 && n <= 10) {
			System.out.println("Sobresaliente");
		} else {
			if (n < 9 && n >= 7) {
				System.out.println("Notable");
			} else {
				if (n < 7 && n >= 6) {
					System.out.println("Bien");
				} else {
					if (n < 6 && n >= 5) {
						System.out.println("Suficiente");
					} else {
						if (n < 5 && n >= 0) {
							System.out.println("Suspenso");
						} else {
							System.out.println("Introduce un número valido");
						}
					}
				}
			}
		}

	}
}
