//Escreva um programa que leia uma quantidade de n�meros (para teste use 10) calculando e imprimindo o maior, o menor e a m�dia entre os n�meros.

package exerciciosalgoritmo;

import java.util.Scanner;

public class exerciciowhilemaiormenormedia {

	public static void main(String[] args) {

		Scanner verifica = new Scanner(System.in);
		int numero = 0, maior = 0, menor = 0;
		double media = 0;
		numero = verifica.nextInt();
		System.out.println("Digite um n�mero");
		
		while (numero <= 10) {
			numero = verifica.nextInt();
			System.out.println("Digite um n�mero");
		   if (numero > maior) {
			   maior = numero;
		   } else if (numero < menor) {
			   menor = numero;
		   }
		   media = (maior + menor)/2;
		}
		System.out.println("/n O maior n�mero �: " + maior);
		System.out.println("/n O menor n�mero �: " +menor);
		System.out.println("/n A m�dia entre os n�meros �: " +media);

		verifica.close();
	}
}
