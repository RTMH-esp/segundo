package debugger;

import java.util.LinkedList;
import java.util.List;

public class Prueba {
	private double suma;
	private List<Double> lista;

	public Prueba() {
		System.out.println("construyendo clase");
	}

	public double echaCuentas() {
		lista = new LinkedList<Double>();
		for (int i = 0; i < 100; i++) {
			lista.add((double) i);
		}
		suma = 0.0;
		for (Double valor : lista) {
			suma += valor;
		}
		return suma;
	}

}
