package exerciciosalgoritmo;

import java.util.Scanner;

public class matriztestedemesa3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxlin = 5, maxcol = 5;
		int m = 5;
		int mat[][] = new int[maxlin][maxcol];
		int[] v = new int[5];
		
		for (int i = 0; i < m; i++) {
			v [i] = 10 - i;
		}
		
			for (int i = 0; i < m; i++) {
				mat[i][i] = v [i] / 10;
				System.out.printf("%d \t", mat[i][i]);
			}
			System.out.println("");
		
		sc.close();
	}
}