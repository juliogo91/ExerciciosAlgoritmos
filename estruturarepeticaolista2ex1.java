package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaolista2ex1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maior = 0;
		int posicao = 1;

		for (int i = 1; i <= 100; i++) {
			int X = sc.nextInt();

			if (i == 1) {
				maior = X;
				posicao = 1;

			} else if (X > maior) {
				maior = X;
				posicao = i;
			}

		}
         System.out.println(maior);
         System.out.println(posicao);
		sc.close();
	}
}
