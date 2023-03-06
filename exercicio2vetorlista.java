package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio2vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int soma = 0;
		double v[] = new double[2];
		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite o valor do vetor");
			v[i] = sc.nextDouble();
		}
		for (int i = 0; i < v.length; i++) {
			soma += v[i];
			System.out.println("A soma dos elementos do vetor é: " + soma);

			sc.close();
		}
	}
}