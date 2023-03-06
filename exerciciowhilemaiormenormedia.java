//Escreva um programa que leia uma quantidade de números (para teste use 10) calculando e imprimindo o maior, o menor e a média entre os números.

package exerciciosalgoritmo;

import java.util.Scanner;

public class exerciciowhilemaiormenormedia {

	public static void main(String[] args) {

		Scanner verifica = new Scanner(System.in);
		int numero = 0, maior = 0, menor = 0;
		double media = 0;
		numero = verifica.nextInt();
		System.out.println("Digite um número");
		
		while (numero <= 10) {
			numero = verifica.nextInt();
			System.out.println("Digite um número");
		   if (numero > maior) {
			   maior = numero;
		   } else if (numero < menor) {
			   menor = numero;
		   }
		   media = (maior + menor)/2;
		}
		System.out.println("/n O maior número é: " + maior);
		System.out.println("/n O menor número é: " +menor);
		System.out.println("/n A média entre os números é: " +media);

		verifica.close();
	}
}
