package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequenciallista5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double base, altura, volume;
        System.out.println("Digite aqui o valor da base");
        base = ler.nextDouble();
        System.out.println("Digite aqui o valor da altura");
        altura = ler.nextDouble();
        volume = 1/3 * base * altura;
        System.out.println("O valor do volume é: " + volume);

		ler.close();
	}
}