package exerciciosalgoritmo;

import java.util.Scanner;

public class acumuladorestruturarepeticao {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int c, s, idade;
		c = 1;
		s = 0;

		while (c <= 5) {
			System.out.println("Informe a idade: ");
			idade = ler.nextInt();

			s = s + idade;
			c++;
		}

		System.out.println("s =" + s);
		ler.close();
	}
}