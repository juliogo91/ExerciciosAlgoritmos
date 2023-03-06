package exerciciosalgoritmo;

import java.util.Scanner;

public class condicionallista1ex7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double euro, libra, dolar, iene, real;

		char moeda;

		System.out.println("Digite em R$ o valor para conversão: ");

		real = ler.nextDouble();

		System.out.println("Digite a moeda para conversão: ");

		moeda = ler.next().charAt(0);

		switch (moeda) {

		case 'E':

			euro = real / 5.10;

			System.out.println("O valor em Euro é: " + euro);

			break;

		case 'L':

			libra = real / 6.05;

			System.out.println("O valor em Libra Esterlina é: " + libra);

			break;

		case 'D':

			dolar = real / 4.71;

			System.out.println("O valor em Dólar é: " + dolar);

			break;

		case 'I':

			iene = real / 1.25;

			System.out.println("O valor em Iene é: " + iene);

			break;

		default:
			ler.close();
		}
	}
}