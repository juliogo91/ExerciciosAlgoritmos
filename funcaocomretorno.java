package exerciciosalgoritmo;

import java.util.Scanner;

public class funcaocomretorno {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num, resposta;

		System.out.println("Informe um n�mero a ser calculado o fatorial");
		num = ler.nextInt();

		if (num >= 0) {
			resposta = fatorial(num);
			System.out.println("O fatorial de " + num + " � " + resposta);

		} else {
			System.out.println("n�o existe fatorial de numero negativo");
		}
	}

	public static int fatorial(int x) {
		int fat = 1;
		for (int i = 1; i <= x; i++) {
			fat = fat * i;
		}

		return fat;
	}

}
