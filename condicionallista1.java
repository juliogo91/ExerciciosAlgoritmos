package exerciciosalgoritmo;

import java.util.Scanner;

public class condicionallista1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num;
        System.out.println("Digite um n�mero entre 1 e 12");
        num = ler.nextInt();
        
        switch (num){
            case 1: 
                System.out.println("O m�s escolhido � Janeiro");
            break;    
            case 2: 
                System.out.println("O m�s escolhido �  Fevereiro");
            break;
            case 3: 
                System.out.println("O m�s escolhido � Mar�o");
            break;
            case 4:
                System.out.println("O m�s escolhido � Abril" );
                break;
            case 5: 
                System.out.println("O m�s escolhido � Maio");
                break;
            case 6: 
                System.out.println("O m�s escolhido � Junho");
                break;
            case 7:
                System.out.println("O m�s escolhido � Julho");
                break;
            case 8:
                System.out.println("O m�s escolhido � Agosto");
                break;
            case 9: 
                System.out.println("O m�s escolhido � Setembro");
                break;
            case 10:
                System.out.println("O m�s escolhido � Outubro");
                break;
            case 11:
                System.out.println("O m�s escolhido � Novembro");
                break;
            case 12: 
                System.out.println("O m�s escolhido � Dezembro");
            default:      
        }
		ler.close();
	}
}