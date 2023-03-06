package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double salario, salarioAumento, salariocomDescontofinal;

		System.out.println("Digite o valor do salário: ");
		salario = ler.nextDouble();

		salarioAumento = salario * 1.15;
		salariocomDescontofinal = salarioAumento * 0.92;

		System.out.println("salário " + salario);

		System.out.println("Salário com aumento: " + salarioAumento);

		System.out.println("Salário com desconto: " + salariocomDescontofinal);

		ler.close();
	}
}