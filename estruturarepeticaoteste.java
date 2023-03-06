package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaoteste {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int contador = 1;
		while (contador <= 50) {
			System.out.println(contador);
			contador++;
		}

		ler.close();
	}
}