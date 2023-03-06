//Fa�a um algoritmo que realize a leitura de um vetor de inteiros com 10 posi��es e garanta que todos os elementos presentes no vetor s�o distintos entre si.
package exerciciosalgoritmo;

import java.util.Scanner;

public class exercício3vetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] v = new int[10];

		for (int i = 0; i < v.length; i++) {
			System.out.println("\nDigite os números:\n");
			v[i] = sc.nextInt();

			for (int j = 0; j < i; j++) {
				if (v[i] == v[j]) {
					System.out.println("\nElemento existente\n");
					i--; // FAZ A DISTIN��O DE N�MEROS PARA QUE N�O SE REPITAM
				}
			}
		}
		for (int j = 0; j < v.length; j++) {
			System.out.println(v[j]);
		}
		sc.close();
	}
}
