package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		 double a, b, c, Vt, valorDivisao;
	        
	        System.out.println("Digite o valor total �: ");
	        Vt = ler.nextDouble();
	        
	        valorDivisao = Vt /3;
	        
	        a = valorDivisao;
	        b = valorDivisao;
	        c = Vt - (a+b);
	        
	        System.out.println("O valor de a � : " + a);
	        System.out.println("O valor de b � : " + b);
	        System.out.println("O valor de c � : " + c);
	        System.out.println("O valor total � : " + Vt);

		ler.close();
	}
}