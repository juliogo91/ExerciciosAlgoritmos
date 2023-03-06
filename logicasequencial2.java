package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double anelChip, anelAlimento, gasto;
		int quantidadeFrango;
		anelChip = 4.00;
		anelAlimento = 7.00;

		System.out.println("Digite a quantidade de frangos:  ");
		quantidadeFrango = ler.nextInt();

		gasto = quantidadeFrango * anelChip * anelAlimento;

		System.out.println("O gasto total é: " + gasto);

		ler.close();
	}
}