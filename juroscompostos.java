package exerciciosalgoritmo;

import java.util.Scanner;

public class juroscompostos {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double montante;
		double principal = 1000.0;
		double juros = 0.05;
		System.out.printf("%s%20 %n", "ano", "montante em depósito");

		for (int ano = 1; ano <= 10; ++ ano) {
			montante = principal * Math.pow(1.0 + juros, ano);

			System.out.printf("%4d%,20.2f%n", ano, montante);
			ler.close();
		}
	}
}
