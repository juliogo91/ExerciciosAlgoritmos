//Fa�a um programa que leia um n�mero e imprima todos os n�meros de 0 at� o n�mero digitado.
package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaoimprimirtodososnumerosateodigi {

	public static void main(String[] args) {

		Scanner verifica = new Scanner(System.in);

		int numero = 0;
		int soma = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o n�mero");
			numero = verifica.nextInt();
			if (numero < 100) {
				soma = soma + numero;
			}
		}
		System.out.println("Os n�meros a serem impressos s�o: " + numero);
		verifica.close();
	}
}