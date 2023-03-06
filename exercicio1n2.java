package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio1n2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1, n2;
		double mediaturma = 0;
		int qtdalunos;
		double media;
		double soma = 0;
		int cont1 = 0, cont2 = 0, cont3 = 0;
		System.out.println("Digite a quantidade de alunos");
		qtdalunos = sc.nextInt();
		String[] nome = new String[qtdalunos];
		for (int i = 0; i < 2; i++) { // quantidade de notas atribuídas

			System.out.println("\nDigite o nome do aluno");
			nome[i] = sc.next();

			System.out.println("\nDigite a primeira nota");
			n1 = sc.nextDouble();

			System.out.println("\nDigite a outra nota");
			n2 = sc.nextDouble();
			media = (n1 + n2) / 2;
			soma = soma + media;
			mediaturma = media / qtdalunos;
			if (media < 4) {
				System.out.println("\nO aluno\n" + nome[i] + "\nestá REPROVADO");
				cont1++;
			}
			if (media >= 4 && media <= 6) {
				System.out.println("\nO aluno\n" + nome[i] + "\nestá de EXAME");
				cont2++;
			}
			if (media > 6) {
				System.out.println("\nO aluno\n" + nome[i] + "\nestá APROVADO");
				cont3++;
			}
			if (media < mediaturma) {
				System.out.println("\nO aluno\n" + nome[i] + "\nestá abaixo da média da turma");
			} else if (media > mediaturma) {
				System.out.println("\nO aluno\n" + nome[i] + "\nestá acima da média da turma");
			}
		}

		sc.close();
	}
}
