package debugger;

import java.util.Scanner;

public class tema3ej2 {
	public static void main(String[] args) {

		Scanner a = new Scanner(System.in);
		System.out.println("Introduce la Base");
		final int BASE = a.nextInt();
		Scanner b = new Scanner(System.in);
		System.out.println("Introduce el Exponente");
		final int EXP = b.nextInt();

		System.out.println("El número " + BASE + " elevado a " + EXP + " es igual a " + potencia(BASE, EXP) + ".");

	}

	static int potencia(int base, int exp) {
		if (exp == 0)
			return 1;
		return base * potencia(base, --exp);
	}
}
