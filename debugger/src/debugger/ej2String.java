package debugger;

import java.util.Scanner;

public class ej2String {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		System.out.println("Introduce 5 palabras y muetro la/s palabaras mas largas");
		
		String cadenaDePalabras="";
		int mayor=0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("introduce una palabra;");
			String palabra= entrada.next();
			
			if (palabra.length() > mayor) {
				mayor=palabra.length();
				cadenaDePalabras=palabra;
			} else if (palabra.length() == mayor) {
				if (!cadenaDePalabras.contains(palabra))
				cadenaDePalabras=cadenaDePalabras +" "+ palabra;
				
			}
		}
		System.out.println("la palabra mas larga es: "+ mayor+ " "+ cadenaDePalabras);
		}
	

}
