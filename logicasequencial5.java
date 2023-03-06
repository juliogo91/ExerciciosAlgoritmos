package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial5 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		 double a, b, c, Vt, valorDivisao;
	        
	        System.out.println("Digite o valor total é: ");
	        Vt = ler.nextDouble();
	        
	        valorDivisao = Vt /3;
	        
	        a = valorDivisao;
	        b = valorDivisao;
	        c = Vt - (a+b);
	        
	        System.out.println("O valor de a é : " + a);
	        System.out.println("O valor de b é : " + b);
	        System.out.println("O valor de c é : " + c);
	        System.out.println("O valor total é : " + Vt);

		ler.close();
	}
}