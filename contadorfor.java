package exerciciosalgoritmo;

import java.util.Scanner;

public class contadorfor {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int n, c;
		
		System.out.println("Digite um n�mero");
		n = ler.nextInt();

		for (c = 1; c <= 10; c++) {
		
			n = c + 2;
			System.out.printf("\n" , + c);
		}
		
		ler.close();
	}
}
