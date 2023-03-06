package exerciciosalgoritmo;

import java.util.Scanner;

public class matriztestedemesa2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxlin = 3, maxcol = 3;
		int n = 3;
		int mat[][] = new int[maxlin][maxcol];
		int x = 0;
		int[] v = new int[3];
		for (int i = 0; i < n; i++) {
			x = 0;

			for (int j = 0; j < n; j++) {
				mat[i][j] = i + j;
				x = x + mat[i][j];
				System.out.printf("%d \t", mat[i][j]);
			}
			v[i] = x;
			System.out.println("");
		}
		sc.close();
	}
}