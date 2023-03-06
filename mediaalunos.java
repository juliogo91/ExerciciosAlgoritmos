package exerciciosalgoritmo;

import java.util.Scanner;

public class mediaalunos {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int total = 0, cc = 1;

		while ( cc <= 10)
		{
		System.out.println("Digite a sua nota");
		int n = ler.nextInt();
		total = total + n;
		cc = cc + 1;
		}
		int media = total / 10;
		System.out.printf("%n O total das notas é %d%n" , total);
		System.out.printf("A média é %d%n" , media);

		
		ler.close();
		
	}
}