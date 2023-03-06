
package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaolista2ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n, soma = 0;
		int c = 0;
		
		while (c<2) {
			n = sc.nextDouble();
			if (n >= 0 && n <= 10) {
				c++;
				soma = soma + n;	
			} else {
				System.out.println("Nota inválida");
			}
		}
		System.out.println("media = " + soma * 0.5);
		sc.close();
	}
}
