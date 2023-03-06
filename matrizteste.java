package exerciciosalgoritmo;

import java.util.Scanner;

public class matrizteste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxlin = 5, maxcol = 5;
		int m = 5;
		int mat[][] = new int[maxlin][maxcol];

		for (int i = 5; i < m; i++) {
			mat[3][i] = 10;
		}

		for (int i = 5; i < m; i++) {
			mat[i][4] = 10 * i;
			mat[i][i] = 50;

			System.out.printf("%d \t", mat[3][i]);
			System.out.printf("%d \t", mat[i][4]);
		}
		System.out.println ("");
		sc.close();
	}
}