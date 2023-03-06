//Fa�a um programa que leia dois n�meros inteiros, o primeiro � o valor inicial de um contador, e o segundo � o valor final do contador (testar se o valor inicial fornecido �
// inferior ao valor final). Usando o comando While, escreva na tela uma contagem que comece no primeiro n�mero lido, escreva os n�meros seguintes colocando sempre
// apenas um n�mero em cada nova linha da tela, e terminando a contagem quando chegar ao valor final indicado.
package exerciciosalgoritmo;

import java.util.Scanner;

public class leituradedoisnumerosinteiroscomwhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menor, numeroinicial, numerofinal = 0, aux = 0, cont = 1;
		;
		System.out.print("N�mero inicial : ");
		numeroinicial = sc.nextInt();
		menor = numeroinicial;
		System.out.print("N�mero final: ");
		numerofinal = sc.nextInt();
		aux = numerofinal;

		while (cont <= 4) {
			System.out.print("N�mero " + cont + " : ");
			numeroinicial = sc.nextInt();
			if (numeroinicial < menor) {
				menor = numeroinicial;
				cont++;
			} else if (numerofinal > aux) {
				aux = numerofinal;
				cont++;
			}
		}
		System.out.println("O n�mero inicial �: " + numeroinicial);
		System.out.println("O n�mero final �: " + numerofinal);
		sc.close();
	}
}
