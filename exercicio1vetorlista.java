package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio1vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] v = new int[5];
		int[] w = new int[5];
		int[] C = new int[5];

		for (int i = 0; i < v.length; i++) {
			System.out.println("Digite um valor para vetor A");
			v[i] = sc.nextInt();
			System.out.println("Digite um valor para vetor B");
			w[i] = sc.nextInt();

		}
		for (int i = 0; i < w.length; i++) {
			C[i] = v[i] + w[i];

		}
		for (int i = 0; i < C.length; i++) {
			System.out.println(C[i]);
		}

		sc.close();
	}
}
