package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial7 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		 int Anos, Meses, Dias, Temposemacidentes;
	        
	        System.out.println("Digite o tempo sem acidentes: ");
	        Temposemacidentes = ler.nextInt();
	        
	        Anos = Temposemacidentes /365;
	        Meses = (Anos%365)/30;
	        Dias = (Anos%365)%30;
	        
	        System.out.println("A quantidade de anos sem acidentes é: " + Anos);
	        System.out.println("A quantidade de meses sem acidentes é: " + Meses);
	        System.out.println("A quantidade de dias sem acidentes é: " + Dias);

		ler.close();
	}
}