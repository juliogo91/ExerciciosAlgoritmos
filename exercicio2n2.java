//A pesquisa perguntou o sexo dos estrevistados e sua resposta (sim ou n�o). Sabendo-se que foram entrevistadas 10 pessoas, fazer um algoritmo que calcule e escreva:
//O n�mero de pessoas que responderam sim.
//O n�mero de pessoas que responderam n�o.
//A porcentagem de pessoas do sexo masculino que responderam sim.
//A porcentagem de pessoas do sexo feminino que responderam n�o.
//Compara��o de Strings � feita com a fun��o .equals(). Ex: resposta.equals("sim").
package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio2n2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String[] sexo = new String[10];
		String[] resposta = new String[10];
		double percentualsim, percentualnao;
		int Masc = 0, Fem = 0, i, SIM = 0, NAO = 0, masculino = 0, feminino = 0;

		for (i = 0; i < resposta.length; i++) {
			System.out.println("\nEst� contente com o novo produto\n?");
			resposta[i] = ler.next();

			if (resposta[i].equals("SIM")) {
				SIM++;
			}
			if (resposta[i].equals("NAO")) {
				NAO++;
			}
			System.out.println("\nQual o seu sexo?\n");
			System.out.println("\nCaso seja masculino digite Masc, sen�o se for feminino digite Fem\n");
			sexo[i] = ler.next();

			if (sexo[i].equals("Masc") && resposta[i].equals("SIM")) {
				masculino++;
			}
			if (sexo[i].equals("Fem") && resposta[i].equals("NAO")) {
				feminino++;
			}
		}
		percentualsim = (masculino * 100) / 10;
		percentualnao = (feminino * 100) / 10;
		System.out.println("\nA quantidade de pessoas que disseram sim �: " + Masc + "\n");
		System.out.println("\nA quantidade de pessoas que disseram n�o �: " + Fem + "\n");
		System.out.println("\nO percentual de pessoas que disseram sim �: " + percentualsim + "\n");
		System.out.println("\nO percentual de pessoas que disseram n�o �: " + percentualnao + "\n");
	}
}
