package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double salario, salarioAumento, salariocomDescontofinal;

		System.out.println("Digite o valor do sal�rio: ");
		salario = ler.nextDouble();

		salarioAumento = salario * 1.15;
		salariocomDescontofinal = salarioAumento * 0.92;

		System.out.println("sal�rio " + salario);

		System.out.println("Sal�rio com aumento: " + salarioAumento);

		System.out.println("Sal�rio com desconto: " + salariocomDescontofinal);

		ler.close();
	}
}