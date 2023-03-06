package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequenciallista2ex4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double x1, y1, x2, y2, Distancia;

		System.out.println("Digite aqui o valor de x1");
		x1 = ler.nextDouble();
		System.out.println("Digite aqui o valor de x2");
		x2 = ler.nextDouble();
		System.out.println("Digite aqui o valor de y1");
		y1 = ler.nextDouble();
		System.out.println("Digite aqui o valor de y2");
		y2 = ler.nextDouble();

		Distancia = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Distancia é: " + Distancia);

		ler.close();
	}
}