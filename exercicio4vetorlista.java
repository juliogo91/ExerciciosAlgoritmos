package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio4vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] nome = new String[20];
		double[] n1 = new double[20];
		double[] n2 = new double[20];
		double[] media = new double[20];

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do aluno");
			nome[i] = sc.next();

			System.out.println("Digite a nota");
			n1[i] = sc.nextDouble();

			System.out.println("Digite a outra nota");
			n2[i] = sc.nextDouble();
			media[i] = (n1[i] * 2 + n2[i] * 3) / 5;
		}

		for (int i = 0; i < nome.length; i++) {
			System.out.printf("aluno %s media %.2f\n", nome[i], media[i]);
		}
		sc.close();
	}
}
