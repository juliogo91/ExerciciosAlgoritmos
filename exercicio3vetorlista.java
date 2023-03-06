package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio3vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int [] a = new int [2];
		int [] b = new int [2];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Digite um valor para o vetor a");
			a[i] = sc.nextInt();
		}
	for (int i = 0; i < b.length; i++) {
		System.out.println("Digite um valor para o vetor b");
		b[i] = sc.nextInt();
		
		if (i % 2 == 0) {
			System.out.println("Esse índice é par");
		} else {
			if (i % 2 == 1) {
				System.out.println("Esse índice é ímpar");
			}
		}
	}

			sc.close();
		}
	}
