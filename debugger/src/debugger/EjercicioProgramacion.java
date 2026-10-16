package debugger;

import java.util.Scanner;

public class EjercicioProgramacion {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.println("Introduce la nota para saber tu calificación:");
		n = entrada.nextInt();
		switch (n) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:System.out.println("Suspenso:"); break;
			case 5:System.out.println("Suficiente:"); break;
			case 6:System.out.println("Bien:"); break;
			case 7:
			case 8:System.out.println("Notable:"); break;
			case 9:
			case 10:System.out.println("Sobresaliente:"); break;
			default:System.out.println("Numero no valido:");
		}
	}
}
			