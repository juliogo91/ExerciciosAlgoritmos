package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int positivos = 0, entrada, soma = 0;
		double m;

		for (int v = 0; v < 3; v++) {

			System.out.println("Digite um Valor");
			entrada = ler.nextInt();
			if (entrada > 0) {
				positivos++;
				soma = soma + entrada;
			}
		}

		m = soma / positivos;

		System.out.println("quatidade de positivos " + positivos);
		System.out.println("media   " + m);

		ler.close();
	}
}