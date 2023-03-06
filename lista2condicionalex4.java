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

		System.out.println("Ar condicionado: sim ou não");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

		}
		valorcomacessorio = valorcomacessorio + 1750.00f;

		System.out.println("Pintura Metálica: sim ou não");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

			valorcomacessorio = valorcomacessorio + 800f;
		}

		System.out.println("Vidro Elétrico: sim ou não");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

			valorcomacessorio = valorcomacessorio + 1200f;
		}

		System.out.println("Direção Hidráulica: sim ou não");

		resposta = leia.next();

		if ("S".equalsIgnoreCase(resposta)) {

			valorcomacessorio = valorcomacessorio + 2000f;
		}

		System.out.println("O valor total do carro: " + valorcomacessorio);

		leia.close();
	}
}