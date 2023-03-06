package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial9 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double gas, dindin, litros;
		System.out.println("Digite o valor que deseja abastecer: ");
		dindin = ler.nextDouble();
		System.out.println("Digite o valor do litro da gasolina: ");
		gas = ler.nextDouble();

		litros = dindin / gas;

		System.out.println("A quantidade a ser abastecida em litros é: " + litros);

		ler.close();
	}
}