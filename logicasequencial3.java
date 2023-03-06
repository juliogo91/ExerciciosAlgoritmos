package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial3 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int qt350, qt600, qt2L;
        double total;
        
        System.out.println("Digite a quantidade de latas 350 ml: ");
        qt350 = ler.nextInt();
        
        System.out.println("Digite a quantidade de garrafas 600 ml: ");
        qt600 = ler.nextInt();
        
        System.out.println("Digite a quantidade de garrafas 2L: ");
        qt2L = ler.nextInt();
        
        total = (qt350 * 0.35) + (qt600 * 0.6) + (qt2L * 2);
        
        System.out.println("O valor  total é: " + total);

		ler.close();
	}
}