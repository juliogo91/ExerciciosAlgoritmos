package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequenciacaoexemplo {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		int n, i, maior = 0, menor = 1001;

		for (i = 1; i <= 10; i++) {
			System.out.println("Digite um número: ");
			n = ler.nextInt();

			if (n > maior)
				maior = n;
			if (n < menor)
				menor = n;
		}
		System.out.println("O maior número é: " + maior);
		System.out.println("O maior número é: " + menor);
		System.out.println("A diferença entre o maior e o menor: " + (maior - menor));
	    ler.close();
	}
}