//Escreva um programa que leia uma matriz A 4x4 e outra matriz B 4x4. Calcule e imprima a matriz Soma, correspondente a A + B.
package exerciciosalgoritmo;

import java.util.Scanner;

public class matrizexercicio55 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxlin = 4, maxcol = 4;
		int A = 4;
		int B = 4;
		int mat[][] = new int[maxlin][maxcol];
		int soma = 0;

		for (int i = 0; i < A; i++) {
			System.out.printf("%d Digite o valor da matriz A \t", mat[i][i]);
	
			for (int j = 0; j < B; j++) {
			System.out.printf("%d Digite o valor da matriz B \t", mat[j][j]); 
		}
		 for (int j = 0; j < A; j++) {
			if (soma < j)
			 soma = A + B;
			 System.out.printf("%d O valor da soma das matrizes é \t" + soma);
		 }
		}
		System.out.println ("");
		sc.close();
	}
}