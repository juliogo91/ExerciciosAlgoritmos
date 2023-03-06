package exerciciosalgoritmo;

import java.util.Scanner;

public class exerciciomatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//DECLARAÇÃO MATRIZES E VETORES

		double[][] MATRIXX = new double[5][4];
		double[] MAP = new double[5];
		double[] MFL = new double[4];
		String[] ITENS = { "A", "B", "C", "D", "E" };
		double ITEM1 = 0, ITEM2 = 0, ITEM3 = 0, ITEM4 = 0, MEDIA1 = 0, MEDIA2 = 0, MEDIA3 = 0, MEDIA4 = 0;
		int[] ARMAZEM = new int[5];
		// entrada

		for (int i = 0; i < MAP.length; i++) {
			for (int j = 0; j < MFL.length; j++) {
				System.out.println("\nDigite o faturamento\n");
				MATRIXX[i][j] = sc.nextDouble();
			}
		}
		// print da matriz
		for (int i = 0; i < MAP.length; i++) {
			for (int j = 0; j < MFL.length; j++) {
				System.out.print(MATRIXX[i][j] + "\t");
			}
			System.out.println();
			// maior arrecadação
		}
		for (int i = 0; i < MAP.length; i++) {
			for (int j = 0; j < MFL.length; j++) {
				if (j == 0) {
					if (MATRIXX[i][j] > ITEM1) {
						ITEM1 = MATRIXX[i][j];
						MAP[i] = ITEM1;
						ARMAZEM[i] = j + 1;
					}
				}
				if (j == 1) {
					if (MATRIXX[i][j] > ITEM2) {
						ITEM2 = MATRIXX[i][j];
						MAP[i] = ITEM2;
						ARMAZEM[i] = j + 1;
					}
				}
				if (j == 2) {
					if (MATRIXX[i][j] > ITEM3) {
						ITEM3 = MATRIXX[i][j];
						MAP[i] = ITEM3;
						ARMAZEM[i] = j + 1;
					}
				}
				if (j == 3) {
					if (MATRIXX[i][j] > ITEM4) {
						ITEM4 = MATRIXX[i][j];
						MAP[i] = ITEM4;
						ARMAZEM[i] = j + 1;
					}
				}
			}
		}
		System.out.println("Maior arrecadação");
		for (int i = 0; i < MAP.length; i++) {
			System.out.println("Armazem" + ARMAZEM[i]);
			System.out.printf("Itens" + ITENS[i] + "R$: %2f\n", MAP[i]);
		}
		// media
		System.out.println();
		for (int i = 0; i < MAP.length; i++) {
			for (int j = 0; j < MFL.length; j++) {
				if (j == 0) {
					MEDIA1 += MATRIXX[i][j];
					MFL[j] = MEDIA1 / 5;
				}
				if (j == 1) {
					MEDIA2 += MATRIXX[i][j];
					MFL[j] = MEDIA2 / 5;
				}
				if (j == 2) {
					MEDIA3 += MATRIXX[i][j];
					MFL[j] = MEDIA3 / 5;
				}
				if (j == 3) {
					MEDIA4 += MATRIXX[i][j];
					{
						MFL[j] = MEDIA4 / 5;
					}
				}
			}
		}
		System.out.println("Média de arrecadação");
		for (int i = 0; i <MFL.length; i++) {
			System.out.printf("Armazém " + (i+1) + "R$: %.2f\n",MFL[i]);
		}
		sc.close();
	}
}
