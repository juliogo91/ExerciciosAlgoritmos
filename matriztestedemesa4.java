package exerciciosalgoritmo;

import java.util.Scanner;

public class matriztestedemesa4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		int maxlin = 4, maxcol = 4;
	     int  n = 4;
		int mat[][] = new int[maxlin][maxcol];

		for (int i = 3; i < n; i++) {


		for (int j = 3; j < i; j++) {

			mat[i][j] = ( i + 1 )* 10;

		}
		}
		for (int j = 3; j < maxlin; j++) { // usar esse código para printar
			for (int i = 0; i < maxcol; i++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}
}