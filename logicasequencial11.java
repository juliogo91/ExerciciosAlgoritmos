package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial11 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double real1, cent50, cent25, cent10, cent5, valorTotal;

		System.out.println("Digite a quantidade de moedas de 1 real:  ");
		real1 = ler.nextDouble();
		System.out.println("Digite a quantidade de moedas de 0,50 centavos:  ");
		cent50 = ler.nextDouble();
		System.out.println("Digite a quantidade de moedas de 0,25 centavos:  ");
		cent25 = ler.nextDouble();
		System.out.println("Digite a quantidade de moedas de 0,10 centavos:  ");
		cent10 = ler.nextDouble();
		System.out.println("Digite a quantidade de moedas de 0,05 centavos:  ");
		cent5 = ler.nextDouble();

		valorTotal = (real1 * 1.00) + (cent50 * 0.50) + (cent25 * 0.25) + (cent10 * 0.10) + (cent5 * 0.05);

		System.out.println("O valor total é: " + valorTotal);

		ler.close();
	}
}