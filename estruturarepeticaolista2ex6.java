package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaolista2ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N;
		
		N = sc.nextInt();
		
		for (int i = 1; i <=1000; i++) {
			int soma = 0;
			
			for (int j = 1; j <i; j++) {
				
				if (i% N == 0) {
					soma += N;
				}
			if (soma == i) {
				System.out.println("Número perfeito: " +soma);
			}
			}
			
		}
		
			sc.close();
	}
}