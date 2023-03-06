package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial6{

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
        int qtpF, qtpQ;
        double vpF, vpQ, vT, vG;
        
        System.out.println("Digite a quantidade de pão francês: ");
        qtpF = ler.nextInt();
        
        System.out.println("Digite a quantidade de pão de queijo: ");
        qtpQ = ler.nextInt();
        
        vpF = (qtpF * 0.12);
        vpQ = (qtpQ * 1.50);
        vT = vpF + vpQ;
        vG = vT * 0.1;
        System.out.println("Imprima o valor de pão francês: " + vpF);
        System.out.println("Imprima o valor de pão de queijo: " + vpQ);
        System.out.println("Imprima o valor total: " + vT);

		ler.close();
	}
}