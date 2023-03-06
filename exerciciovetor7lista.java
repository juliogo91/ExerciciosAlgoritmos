package exerciciosalgoritmo;

import java.util.Scanner;

public class exerciciovetor7lista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menor = 99999999;
		int maior = 0;
        
		
		int[] v = new int[2];

		for (int i = 0; i < v.length; i++) {

			System.out.println("Digite o valor do vetor");
			v[i] = sc.nextInt();

		}

		for (int i = 0; i < v.length; i++) {

			if (maior > v[i]) {
				maior = v[i];
			}

			for (int j = 0; j < v.length; j++) {
				if (menor > v[i]) {
					menor = v[i];
				}
			}
	
		} System.out.println("O menor elemento do vetor é: " + menor);

		sc.close();
	}

}
