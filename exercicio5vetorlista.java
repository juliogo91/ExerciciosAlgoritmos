package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio5vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] nome = new String[2];                   //entrada: declara��o das variav�is dos veotres
		double[] n1 = new double[2];
		double[] n2 = new double[2];
		double[] media = new double[2];

		double mediaturma = 0;
		double soma = 0;
		double contador = 0;

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do aluno");            //processamento 1� loop de execu��o. Uso o lenght para ficar mais exato o c�lculo
			nome[i] = sc.next();
                                                                    //nesse loop usei-o para declarar as vari�veos e obter os dados, assim como executar o c�lculo da m�dia
			System.out.println("Digite a nota");
			n1[i] = sc.nextDouble();

			System.out.println("Digite a outra nota");
			n2[i] = sc.nextDouble();

			media[i] = (n1[i] * 2 + n2[i] * 3) / 5;

		}

		for (int i = 0; i < media.length; i++) {               //sa�da de dados: usei a vari�vel soma para somar e obter o resultado da m�dia, logo ap�s, usei um contador 

			soma = soma + media[i];
			contador++;
			mediaturma = soma / contador;
			if (media[i] < mediaturma) {
				System.out.println("Aluno abaixo da m�dia " + nome[i]);
			}
			System.out.println("M�dia da turma = " + mediaturma);
		
			sc.close();
		}

	}
}
