package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequenciallista2ex2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		 double grausF, grausC, CPolegadas, CMilimetro;
	        System.out.println("Digite a temperatura em Fahrenheit");
	        grausF = ler.nextDouble();
	        grausC = (grausF - 32) * 5/9;
	        System.out.println("O valor em graus Celsius é: " + grausC);
	        System.out.println("Digite a quantidade de chuva em polegadas");
	        CPolegadas = ler.nextDouble();
	        CMilimetro = CPolegadas * 25.4;
	        System.out.println("A quantidade chuvas em milímetros é: " + CMilimetro);

		ler.close();
	}
}