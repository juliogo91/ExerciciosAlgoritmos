
package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaoteste2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome;
		System.out.println("Digite seu nome ou s para sair: ");
		nome = ler.nextLine();
		while (!nome.equals("s")) {
			System.out.printf("Bem-vindo %s\n ", nome);
			System.out.println("Digite seu nome ou s para sair: ");
			nome = ler.nextLine();
		}
		System.out.println("FIM da execução!");
		ler.close();
	}
}
