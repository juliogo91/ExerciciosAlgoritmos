package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial14 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double CDF, CaoC;
		System.out.println("Digite aqui o Custo de Fábrica");
		CDF = ler.nextDouble();
		CaoC = CDF * 1.42;
		System.out.println("O custo do consumidor é: " + CaoC);
		ler.close();
	}
}
