package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial10 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int centena, dezena, unidade, TresDigitos;
		System.out.println("Digite um número de três dígitos:   ");
		TresDigitos = ler.nextInt();

		centena = TresDigitos / 100;
		dezena = (TresDigitos % 100) / 10;
		unidade = (TresDigitos % 100) % 10;

		System.out.println("A centena é: " + centena);
		System.out.println("A dezena é: " + dezena);
		System.out.println("A unidade é: " + unidade);
		ler.close();
	}
}