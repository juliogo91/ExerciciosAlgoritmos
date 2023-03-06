package exerciciosalgoritmo;

import java.util.Scanner;

public class exercio1slidematriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int maxlin = 2, maxcol = 2;

		int[][] matriz = new int[maxlin][maxcol];

		for (int j = 0; j < maxlin; j++) {
			for (int i = 0; i < maxcol; i++) {
				System.out.println("Informe a matriz [" + i + "] " + " [" + j + "] : ");
				matriz[i][j] = sc.nextInt();
				while (matriz[i][j] < 0) {
					System.out.println("Informe apenas valores positivos ");
					System.out.println("Informe a matriz [" + i + "] " + " [" + j + "] : ");
					matriz[i][j] = sc.nextInt();
				}
			}
		}
		int maiorarrecadacao = matriz[0][0];
		int menorfaturamento = matriz[0][0];
		double media = matriz[0][0];

		int linmaior = 0, colmaior = 0;
		int linmenor = 0, colmenor = 0;

		for (int j = 0; j < maxlin; j++) {
			for (int i = 0; i < maxcol; i++) {
				if (matriz[i][j] > maiorarrecadacao) {
					maiorarrecadacao = matriz[i][j];
					linmaior = i;
					colmaior = j;
				}
			}
		}

		for (int j = 0; j < maxlin; j++) {
			for (int i = 0; i < maxcol; i++) {
				if (matriz[i][j] > menorfaturamento) {
					menorfaturamento = matriz[i][j];
					linmenor = i;
					colmenor = j;
				}
			}
		}
		for (int j = 0; j < maxlin; j++) {
			for (int i = 0; i < maxcol; i++) {
				if (matriz[i][j] > media) {
					media = matriz[i][j];
					linmaior = i;
					colmaior = j;
				}
			}

			System.out.println("\n\nA maior arrecadação da matriz é o  " + maiorarrecadacao + " na posição [" + linmaior + "] " + " ["
					+ colmaior + "] \n");
			System.out.println("\n\nO menor elemento da matriz é o  " + menorfaturamento + " na posição [" + linmenor + "] " + " ["
					+ colmenor + "] \n");
			System.out.println("A média entre os valores é o: " + media);
			sc.close();
		}
	}
}