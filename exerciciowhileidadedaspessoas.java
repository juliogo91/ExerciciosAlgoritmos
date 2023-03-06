//Escreva um programa que receba a idade de várias pessoas (para teste utilize 10 pessoas). Calcule e imprima: a quantidade de pessoas com menos de 18 anos;
// quantidade de pessoas entre 18 e 65 anos; quantidade de pessoas com mais de 65 anos.
package exerciciosalgoritmo;

import java.util.Scanner;

public class exerciciowhileidadedaspessoas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade = 0, cont18 = 0, cont19 = 0, cont66 = 0;
		System.out.print("Digite a idade");
		idade = sc.nextInt();
		while (idade >= 10) {
			idade = sc.nextInt();
			if (idade <= 18) {
				cont18++;
			} else if (idade >= 19 || idade <= 65) {
				cont19++;
			} else if (idade >= 66) {
				cont66++;
			}
		}
		System.out.println("O total de pessoas com menos de 18 anos é: " +cont18);
		System.out.println("O total de pessoas com idade entre 18 e 65 anos é: " +cont19);
		System.out.println("O total de pessoas com idade acima dos 65 anos é: " +cont66);
		sc.close();
	}
}
