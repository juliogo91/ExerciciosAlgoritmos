package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequenciallista2ex1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double R, A, ALata, ALado, ABase, CLata;
		System.out.println("Digite o Raio em m�");
		R = ler.nextDouble();
		System.out.println("Digite a Altura em m�");
		A = ler.nextDouble();
		System.out.println("Digite a �rea da Lata em m�");
		ALata = ler.nextDouble();
		System.out.println("Digite a �rea do Lado em m�");
		ALado = ler.nextDouble();
		System.out.println("Digite a Altura da Base em m�");
		ABase = ler.nextDouble();
		ALata = ABase * (3.14 * (R * R) * 2) + ALado * (2 * 3.14 * (R * R) * A);
		CLata = ALata * 100;
		System.out.println("O custo total da lata �: " + CLata);

		ler.close();
	}
}