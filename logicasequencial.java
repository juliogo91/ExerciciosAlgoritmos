package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		 double x, resultadofuncao;
	      
	        System.out.println("Digite o valor de x: ");
	        
	        x = ler.nextDouble();
	        
	        resultadofuncao = 2 * (x * x) - 3;
	        
	        System.out.println("Resultado: " + resultadofuncao);	
	ler.close();
	}
}