//Fa�a um programa para criar e preencher um vetor de nomes. Ap�s o preenchimento do vetor, o programa deve solicitar ao usu�rio que digite um nome e dizer se o nome dado pelo usu�rio est� ou n�o presente no vetor.

package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio9vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome = null;
		String[] nome1 = { "Julio", "Pedro", "Andr�", "Roberto" };

		for (int i = 0; i < nome1.length; i++) {
			System.out.println("Digite o nome do vetor");
			nome1[i] = sc.next();
		}
		System.out.println("Digite o nome");
		
		nome = sc.next();

		for (int i = 0; i < nome1.length; i++) {

			if (nome.equals(nome1[i])) {                                                               //equals usado para recebeer a vari�vel string e o vetor
				System.out.println("Nome existente");
			}

			for (int j = 0; j < nome1.length; j++) {                                                   //loop de distin��o entre o nome atribu�do e o vetor
				if (nome != nome1[j]) {
					System.out.println("Nome inexistente");
				}
			}

			sc.close();
		}
	}
}
