package exerciciosalgoritmo;

import java.util.Scanner;

public class lista2condicionalex4 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float valorincarro, valorcomacessorio;

		String resposta;

		System.out.println("Digite o valor do carro:");

		valorincarro = leia.nextFloat();

		valorcomacessorio = valorincarro;

		System.out.println("Ar condicionado: sim ou n�o");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

		}
		valorcomacessorio = valorcomacessorio + 1750.00f;

		System.out.println("Pintura Met�lica: sim ou n�o");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

			valorcomacessorio = valorcomacessorio + 800f;
		}

		System.out.println("Vidro El�trico: sim ou n�o");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

			valorcomacessorio = valorcomacessorio + 1200f;
		}

		System.out.println("Dire��o Hidr�ulica: sim ou n�o");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

			valorcomacessorio = valorcomacessorio + 2000f;
		}

		System.out.println("O valor total do carro: " + valorcomacessorio);

		leia.close();
	}
}