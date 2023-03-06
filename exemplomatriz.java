package exerciciosalgoritmo;

import java.util.Scanner;

public class exemplomatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int MAXLIN = 3;
        int MAXCOL = 3;

        int[][] mat = new int[MAXLIN][MAXCOL];
        int maior = mat[0][0];
        
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                System.out.println("Digite o elemento [" + i + "]" + "[" + j + "]");
                mat[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                if (mat[i][j]> maior) {
                    maior = mat[i][j];
                }
            }
        }
        for (int i = 0; i < MAXLIN; i++) {
            for (int j = 0; j < MAXCOL; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("O maior elemento é: " + maior);
        sc.close();
	}
	}
