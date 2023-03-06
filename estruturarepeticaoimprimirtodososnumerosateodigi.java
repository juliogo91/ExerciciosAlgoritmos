//Faça um programa que leia um número e imprima todos os números de 0 até o número digitado.
package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaoimprimirtodososnumerosateodigi {

	public static void main(String[] args) {

		Scanner verifica = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número");
			numero = verifica.nextInt();
			if (numero < 100) {
				soma = soma + numero;
			}
		}
		System.out.println("Os números a serem impressos são: " + numero);
		verifica.close();
	}
}