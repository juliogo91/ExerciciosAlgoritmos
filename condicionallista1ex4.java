package exerciciosalgoritmo;

import java.util.Scanner;

public class condicionallista1ex4 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		double raiz;

		System.out.println("Digite um n�mero inteiro positivo");

		numero = ler.nextInt();

		raiz = Math.sqrt(numero);

		if (raiz * raiz == numero) {
			System.out.println("Este n�mero � um quadrado perfeito");

		} else {

			System.out.println("Este n�o � um n�mero quadrado perfeito");

			ler.close();
		}
	}
}