package debugger;

import java.util.Scanner;

public class ej3 {
	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		int origen=0;
		String cadena="";
		int total=0;
		while ( (origen=entrada.nextInt())!=0) {
			if (comprobarNum(origen)) {
				total+=origen;
				if (cadena.length()>0) {
					cadena=cadena.concat("+");
				}
				cadena=cadena+origen;
			}
		}
		System.out.println(cadena+"="+total);
		entrada.close();
}
/**
 * Metodo que me dice si la suma de las cifras de ese numero corresponde con el numero de digitos
 * @param origen numero de origen
 * @return boolean true si es correcto false si no
 */
static boolean comprobarNum(int origen) {
	int numero=0;
	int suma=0;
	while (origen!=0) {
		suma+=(origen%10);
		origen=origen/10;
		numero++;
 		}
	System.out.println (numero);
	if (suma==numero) {
		return true;
	}else {
		return false;
		}
	}
}