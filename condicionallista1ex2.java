package exerciciosalgoritmo;

import java.util.Scanner;

public class condicionallista1ex2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int s, t, f, chegada;
		System.out.println("Digite a hora de saída");
		s = ler.nextInt();
		System.out.println("Digite o tempo de viagem");
		t = ler.nextInt();
		System.out.println("Digite o fuso horário");
		f = ler.nextInt();
		chegada = s + t + f;
		if (chegada >= 24) {
			chegada = chegada - 24;
		} else {
			if (chegada > 24);
		}
		System.out.println("O horário de chegada é: " + chegada);

		ler.close();
	}
}