//Faça um programa que leia dois números inteiros, o primeiro é o valor inicial de um contador, e o segundo é o valor final do contador (testar se o valor inicial fornecido é
// inferior ao valor final). Usando o comando While, escreva na tela uma contagem que comece no primeiro número lido, escreva os números seguintes colocando sempre
// apenas um número em cada nova linha da tela, e terminando a contagem quando chegar ao valor final indicado.
package exerciciosalgoritmo;

import java.util.Scanner;

public class leituradedoisnumerosinteiroscomwhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menor, numeroinicial, numerofinal = 0, aux = 0, cont = 1;
		;
		System.out.print("Número inicial : ");
		numeroinicial = sc.nextInt();
		menor = numeroinicial;
		System.out.print("Número final: ");
		numerofinal = sc.nextInt();
		aux = numerofinal;

		while (cont <= 4) {
			System.out.print("Número " + cont + " : ");
			numeroinicial = sc.nextInt();
			if (numeroinicial < menor) {
				menor = numeroinicial;
				cont++;
			} else if (numerofinal > aux) {
				aux = numerofinal;
				cont++;
			}
		}
		System.out.println("O número inicial é: " + numeroinicial);
		System.out.println("O número final é: " + numerofinal);
		sc.close();
	}
}
