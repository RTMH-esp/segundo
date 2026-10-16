package debugger;

public class tablaMultiplicar {

	public static void main(String[] args) {
		System.out.println("Tablas multiplcar sin repetir operaciones");

		for (int y = 0; y <= 10; y++) { //el bucle se repite cada vez que se ompleta el interior del mismo
			System.out.println("----Tabla del "+y+"----"); //cada incicio del bucle se suma +1 a Y, hasta que llegue a 10, empezando en el 0 hasta el primer bucle
			for (int x = y; x <= 10; x++) //se repite el bucle sin volver al primer for hasta que x=10
				System.out.println(y + "x" + (x) + "=" + (x * y));//muestra por pantalla las operaciones en el bucle del segundo for
			}
		System.out.println("----Terminado----");//una vez el primer for ha terminado y se sale del bucle, muestra por pantalla que hemos avanzado y terminado los bucles
	}
}

