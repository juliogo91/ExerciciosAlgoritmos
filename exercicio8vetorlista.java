package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio8vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double menor = 0;
		double maior = 0;
		double diverge = 0;
		double[] v = new double[4];

		for (int i = 0; i < v.length; i++) {

			System.out.println("Digite o valor do vetor");
			v[i] = sc.nextDouble();
			maior = v[0];
			menor = v[0];
		}

		for (int i = 0; i < v.length; i++) {

			if (maior < v[i]) { // como é para se achar a maior diferença, aqui o elemento maior precisa ser
								// menor que o vetor
				maior = v[i];
			}

			for (int j = 0; j < v.length; j++) {
				if (menor > v[i]) { // logo, aqui o menor elemento precisa ser maior que o vetor
					menor = v[i];
					diverge = maior - menor;
				}
			}

		}
		System.out.println("O menor elemento do vetor é: " + menor);
		System.out.println("O maior elemento do vetor é: " + maior);
		System.out.println("A maior diferença entre os dois elementos é: " + diverge);

		sc.close();
	}

}
