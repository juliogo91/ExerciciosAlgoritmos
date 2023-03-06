package exerciciosalgoritmo;

import java.util.Scanner;

public class exerciciovetor6vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maior = 0;

		int[] v = new int[2];

		for (int i = 0; i < v.length; i++) {

			System.out.println("Digite o valor do vetor");
			v[i] = sc.nextInt();

		}

		for (int i = 0; i < v.length; i++) {

			if (maior < v[i]) {
				maior = v[i];
			}
		}
		System.out.println("O maior elemento do vetor é: " + maior);
		sc.close();
	}

}
