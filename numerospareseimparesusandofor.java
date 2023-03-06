// Faça um programa que imprima os números pares e ímpares de 1 até N, onde N deverá ser informado pelo usuário.
package exerciciosalgoritmo;

import java.util.Scanner;

public class numerospareseimparesusandofor {

	public static void main(String[] args) {

		Scanner verifica = new Scanner(System.in);

		int numero, contadorPar = 0, contadorImpar = 0;

		for (int i = 1; i < 10; i++) {
			System.out.println("Digite o número");
			numero = verifica.nextInt();

			if (numero % 2 == 0) {
				contadorPar++;
			} else if (numero % 2 == 1) {
				contadorImpar++;
			}
		}
		System.out.println("Os números digitados são " + contadorPar + " números pares \n");
		System.out.println("Os números digitados são " + contadorImpar + " números ímpares \n");
		verifica.close();
	}
}