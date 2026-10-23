package debugger;

public class tema4ej1 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 5, 5, 5, 6,};
		ejercicio1(array, 1);
		
	}

	static void ejercicio1(int[] array, int n) {

		int contador = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n)
				contador++;
		}
		if (contador == 0)
			System.out.println("El valor " + n + " no aparece en el Array.");
		else
			System.out.println("El valor " + n + " aparece " + contador + " " + (contador == 1 ? "vez" : "veces")
					+ " en el Array.");
	}
}