package exerciciosalgoritmo;

import java.util.Scanner;

public class pessoasentrevistadas {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int cont = 1, idade, qntPessoas;
		double media, soma = 0;

		System.out.println("Informe a quantidade de pessoas a serem entrevistadas: ");
		qntPessoas = ler.nextInt();

		while (cont <= qntPessoas) {
			System.out.println("Digite a idade da Pessoa " + cont + ": ");
			idade = ler.nextInt();

			soma = soma + idade;
			cont++;
		}

		media = soma / qntPessoas;
		System.out.println("A média das idades é: " + media);
		ler.close();
	}
}