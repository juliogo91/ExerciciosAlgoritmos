package exerciciosalgoritmo;

import java.util.Scanner;

public class numeropessoasidademediagrupomenoridademaioridade {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int n, c;

		System.out.println("Digite um número: ");
		n = ler.nextInt();

		c = 1;

		while (c <= 10) {
			System.out.printf("\n %d X %d = %d", n, c, n * c);
			c = c + 1;
		}
		ler.close();
	}
}