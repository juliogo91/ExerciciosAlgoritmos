package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial6{

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
        int qtpF, qtpQ;
        double vpF, vpQ, vT, vG;
        
        System.out.println("Digite a quantidade de p�o franc�s: ");
        qtpF = ler.nextInt();
        
        System.out.println("Digite a quantidade de p�o de queijo: ");
        qtpQ = ler.nextInt();
        
        vpF = (qtpF * 0.12);
        vpQ = (qtpQ * 1.50);
        vT = vpF + vpQ;
        vG = vT * 0.1;
        System.out.println("Imprima o valor de p�o franc�s: " + vpF);
        System.out.println("Imprima o valor de p�o de queijo: " + vpQ);
        System.out.println("Imprima o valor total: " + vT);

		ler.close();
	}
}