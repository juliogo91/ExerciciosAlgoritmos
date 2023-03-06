package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequenciallista2ex3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double Custocons, Custofab, Impostoaplicado, Percentualdistrib;
		System.out.println("Digite o custo ao consumidor");
		Custocons = ler.nextDouble();
		System.out.println("Digite o custo de fabricação");
		Custofab = ler.nextDouble();
		System.out.println("Digite o imposto aplicado ao custo de fabricação");
		Impostoaplicado = ler.nextDouble();
		System.out.println("Digite o percentual da distribuição");
		Percentualdistrib = ler.nextDouble();
		Custocons = (Custofab * Impostoaplicado + Percentualdistrib);
		ler.close();

	}
}