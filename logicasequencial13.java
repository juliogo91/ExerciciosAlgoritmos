package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial13 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double grausF, grausC, CPolegadas, Cmilimetro;
        System.out.println("Digite aqui a temperatura em Fahrenheit");
        grausF = ler.nextDouble();
        grausC = (grausF - 32)* 5/9;
        System.out.println("O valor de Celsius é: " + grausC);
        System.out.println("Digite a quantidade de chuva em polegadas");
        CPolegadas = ler.nextDouble();
        Cmilimetro = CPolegadas * 25.4;
        System.out.println("O Valor da chuva em milímetro é: " + Cmilimetro);   
		ler.close();
	}
}
