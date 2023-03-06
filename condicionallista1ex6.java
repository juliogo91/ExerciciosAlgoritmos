package exerciciosalgoritmo;

import java.util.Scanner;

public class condicionallista1ex6 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int matricula;
		double mediaFinal, nota1, nota2, nota3, mediaExe;
		System.out.println("Digite a matricula: ");
		matricula = ler.nextInt();
		System.out.println("Digite a nota 1: ");
		nota1 = ler.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = ler.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = ler.nextDouble();
		System.out.println("Digite a média dos exercícios: ");
		mediaExe = ler.nextDouble();
		mediaFinal = (nota1 + nota2 * 2 + nota3 * 3 + mediaExe) / 7;
		if (mediaFinal >= 9.1) {
			System.out.println("O aluno" + matricula);
			System.out.println("Nota 1" + nota1);
			System.out.println("Nota 2" + nota2);
			System.out.println("Nota 3" + nota3);
			System.out.println("Média dos Exercícios" + mediaExe);
			System.out.println("Conceito A");
			System.out.println("APROVADO");
		} else if (mediaFinal >= 7.6 && mediaFinal <= 9.0) {
			System.out.println("O aluno" + matricula);
			System.out.println("Nota 1" + nota1);
			System.out.println("Nota 2" + nota2);
			System.out.println("Nota 3" + nota3);
			System.out.println("Média dos Exercícios" + mediaExe);
			System.out.println("Conceito B");
			System.out.println("APROVADO");
		} else if (mediaFinal >= 6.1 && mediaFinal <= 7.5) {
			System.out.println("O aluno" + matricula);
			System.out.println("Nota 1" + nota1);
			System.out.println("Nota 2" + nota2);
			System.out.println("Nota 3" + nota3);
			System.out.println("Média dos Exercícios" + mediaExe);
			System.out.println("Conceito C");
			System.out.println("REPROVADO");
		} else if (mediaFinal >= 4.1 && mediaFinal <= 6.0) {
			System.out.println("O aluno" + matricula);
			System.out.println("Nota 1" + nota1);
			System.out.println("Nota 2" + nota2);
			System.out.println("Nota 3" + nota3);
			System.out.println("Média dos Exercícios" + mediaExe);
			System.out.println("Conceito D");
			System.out.println("REPROVADO");
		} else if (mediaFinal <= 4.0) {
			System.out.println("O aluno" + matricula);
			System.out.println("Nota 1" + nota1);
			System.out.println("Nota 2" + nota2);
			System.out.println("Nota 3" + nota3);
			System.out.println("Média dos Exercícios" + mediaExe);
			System.out.println("Conceito E");
			System.out.println("REPROVADO");

			ler.close();
		}
	}
}