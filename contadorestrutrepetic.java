package exerciciosalgoritmo;

import java.util.Scanner;

public class contadorestrutrepetic {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int x;
		x = 1;

		while (x <= 5) {
			System.out.printf("%d\n", x);
		}

		ler.close();
	}
}