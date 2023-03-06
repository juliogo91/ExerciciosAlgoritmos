package exerciciosalgoritmo;

import java.util.Scanner;

public class lista2condicionalex1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int horainicial, minutoinicial, horafinal, minutofinal, ht, mt;

		System.out.println("Digite aqui a hora inicial");
		horainicial = ler.nextInt();

		System.out.println("Digite aqui o minuto inicial");
		minutoinicial = ler.nextInt();

		System.out.println("Digite aqui a hora final");
		horafinal = ler.nextInt();

		System.out.println("Digite aqui o minuto final");
		minutofinal = ler.nextInt();

		ht = (horafinal - horainicial);

		mt = (minutofinal - minutoinicial);

		if (mt < 0) {

			mt = mt + 60;

			ht = ht - 1;
		}
		if (ht <= 0)
			;
		{

			ht = ht + 24;
		}

		System.out.println("A duração do jogo foi de: " + ht + " horas e " + mt + " minutos ");

		ler.close();
	}
}