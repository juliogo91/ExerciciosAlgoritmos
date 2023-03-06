package exerciciosalgoritmo;

import java.util.Scanner;

public class lista2condicionalex3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float salario, valorDoImposto, impostoTotal;

		impostoTotal = 0;

		System.out.println("Digite o valor do salário em R$:");

		salario = ler.nextFloat();

		if (salario >= 0.00 && salario <= 2000) {

			valorDoImposto = 0;

		} else {

			if (salario <= 3000) {

				valorDoImposto = (float) ((salario - 2000) * 0.08);
			} else {

				if (salario <= 4500) {

					valorDoImposto = (float) ((salario - 3000) * 0.18);

					impostoTotal = (float) (valorDoImposto + (1000 * 0.08));

				} else if (salario > 4500) {

					valorDoImposto = (float) ((salario - 4500) * 0.28);

					impostoTotal = (float) (valorDoImposto + (1000 * 0.08) + (1500 * 0.18));
				}
			}
		}
		System.out.println("O valor do Imposto de Renda a pagar é: " + impostoTotal);

		ler.close();
	}
}