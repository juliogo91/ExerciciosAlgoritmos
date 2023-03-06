package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial12 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double R, A, ALata, ALado, ABase, CLata;

		System.out.println("Digite o Raio em m²: ");
		R = ler.nextDouble();
		System.out.println("Digite o Área em m²: ");
		A = ler.nextDouble();
		System.out.println("Digite o Altura da Lata em m²: ");
		ALata = ler.nextDouble();
		System.out.println("Digite o Altura do Lado em m²: ");
		ALado = ler.nextDouble();
		System.out.println("Digite o Altura da Base em m²: ");
		ABase = ler.nextDouble();

		ALata = (3.14 * R * R * 2) + ALado * (2 * 3.14 * R * R * A);
		CLata = ALata * 100;

		System.out.println("O custo total da lata é: " + CLata);
		ler.close();
	}
}
