//Faça um programa que leia o seu nome e o imprima 100 vezes.
package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturaderepeticaonome100x {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome = null;

		for (int i = 0; i < 100; i++) {
			System.out.println("Digite o seu nome");

			nome = ler.next();

			if (nome.equals(nome)) {

			}
		}
		System.out.println("O nome é " + nome);
		ler.close();
	}
}