
package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaolista2ex5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int gasolina = 0, alcool = 0, diesel = 0, opcao = 0;

		while (opcao != 4) {
			opcao = sc.nextInt();

			while (opcao < 1 || opcao > 4) {
				opcao = sc.nextInt();
			}

			switch (opcao) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				diesel++;
				break;
			}

		}
		System.out.println("Muito obrigado!");
		System.out.println("�lcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}
}
