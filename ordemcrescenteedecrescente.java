package exerciciosalgoritmo;

import java.util.Scanner;

public class ordemcrescenteedecrescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num_inicial [] = {10,9,8,7,6,5,4,3,2,1};
		int num_final [] = new int [10];
		int contador = 0, soma = 0;
	
		for (int i = 0; i <= 10; i++) {
			System.out.println("Digite o valor do vetor");
			num_inicial[i] = sc.nextInt();
		}
		for (int i = 0; i <=10; i++) {
			num_inicial = num_final;
			System.out.println("num_inicial[i]");
			if (i < 10) {
				System.out.print("");
		for (int j = 0; j <= 10; j++) {
			soma = soma + contador;
		}
			} else if (i < 10) {
				System.out.println("num_final[i]");
			}
		}
			sc.close();
	
	}
}