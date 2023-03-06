package exerciciosalgoritmo;

import java.util.Scanner;

public class condicionallista1ex3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double a, b, base;

		System.out.println("Digite lado a: ");

		a = ler.nextDouble();

		System.out.println("Digite lado b: ");

		b = ler.nextDouble();

		System.out.println("Digite o valor da base: ");

		base = ler.nextDouble();

		if (a == b && b == base) {

			System.out.println("Este triângulo é equilátero");
		} else if (a == b || a == base || b == base) {

			System.out.println("Este triângulo é isósceles");

		} else {

			System.out.println("Este triângulo é escaleno");
		}
		ler.close();
	}
}