// Fa�a um programa que imprima os n�meros pares e �mpares de 1 at� N, onde N dever� ser informado pelo usu�rio.
package exerciciosalgoritmo;

import java.util.Scanner;

public class numerospareseimparesusandofor {

	public static void main(String[] args) {

		Scanner verifica = new Scanner(System.in);

		int numero, contadorPar = 0, contadorImpar = 0;

		for (int i = 1; i < 10; i++) {
			System.out.println("Digite o n�mero");
			numero = verifica.nextInt();

			if (numero % 2 == 0) {
				contadorPar++;
			} else if (numero % 2 == 1) {
				contadorImpar++;
			}
		}
		System.out.println("Os n�meros digitados s�o " + contadorPar + " n�meros pares \n");
		System.out.println("Os n�meros digitados s�o " + contadorImpar + " n�meros �mpares \n");
		verifica.close();
	}
}