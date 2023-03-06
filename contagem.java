package exerciciosalgoritmo;

import java.util.Scanner;

public class contagem {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int contador = 1;
		while (contador <= 10) {
			System.out.printf("%d ", contador);
			++contador;
		}
		System.out.println();
		ler.close();
	}
}
