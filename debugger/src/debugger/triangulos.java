package debugger;

import java.util.Scanner;

public class triangulos {
	   public static void main(String[] args) {
		   try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce altura triangulo");
			int altura=entrada.nextInt();
			
	   triangulos(altura);
		   }
	   }
	        
    //método que dibuja un triángulo decreciente sin relleno alineado a la derecha
    static void triangulos(int altura) {

        System.out.println("\n\n");

        for (int i = 0; i < altura; i++) {
            System.out.print("\t");
            for (int j = 0; j < altura; j++) {

                //primera fila, primera y última columna
                if (i == 0 || j == i || j == altura - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }

}

