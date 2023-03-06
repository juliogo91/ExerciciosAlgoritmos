package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio5vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] nome = new String[2];                   //entrada: declaração das variavéis dos veotres
		double[] n1 = new double[2];
		double[] n2 = new double[2];
		double[] media = new double[2];

		double mediaturma = 0;
		double soma = 0;
		double contador = 0;

		for (int i = 0; i < nome.length; i++) {
			System.out.println("Digite o nome do aluno");            //processamento 1° loop de execução. Uso o lenght para ficar mais exato o cálculo
			nome[i] = sc.next();
                                                                    //nesse loop usei-o para declarar as variáveos e obter os dados, assim como executar o cálculo da média
			System.out.println("Digite a nota");
			n1[i] = sc.nextDouble();

			System.out.println("Digite a outra nota");
			n2[i] = sc.nextDouble();

			media[i] = (n1[i] * 2 + n2[i] * 3) / 5;

		}

		for (int i = 0; i < media.length; i++) {               //saída de dados: usei a variável soma para somar e obter o resultado da média, logo após, usei um contador 

			soma = soma + media[i];
			contador++;
			mediaturma = soma / contador;
			if (media[i] < mediaturma) {
				System.out.println("Aluno abaixo da média " + nome[i]);
			}
			System.out.println("Média da turma = " + mediaturma);
		
			sc.close();
		}

	}
}
