package exerciciosalgoritmo;

import java.util.Scanner;

public class condicionallista1ex5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double valorAvista, valorEtiqueta, valor2, valor3, valor4, valor5;
		int codigo;
		System.out.println("Digite o valor do produto: ");
		valorAvista = ler.nextDouble();
		System.out.println("Digite o código ");
		codigo = ler.nextInt();
		if (codigo == 1) {
			valor2 = valorAvista * 0.90;
			System.out.println("À vista, dinheiro ou cheque, 10% de desconto");
			System.out.println("O valor a ser pago é " + valor2);
		} else if (codigo == 2) {
			valor3 = valorAvista * 0.95;
			System.out.println("À vista, cartão de credito, 5% de desconto");
			System.out.println("O valor a ser pago é " + valor3);
		} else if (codigo == 3) {
			valor4 = valorAvista / 2;
			System.out.println("Em 2 vezes, preço normal da etiqueta sem juros");
			System.out.println("O valor a ser pago é " + valor4);
		} else if (codigo == 4) {
			valor5 = valorAvista / 3 * 1.10;
			System.out.println("Em 3 vezes, preço normal da etiqueta + 10% de juros");
			System.out.println("O valor a ser pago é " + valor5);
		}

		ler.close();
	}
}