package exerciciosalgoritmo;

import java.util.Scanner;

public class estruturarepeticaolista2ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	  int cont = 1;
	  int termo = 0;
	  int a = 0, b = 1, c=1, t;
	  
	  do {
		  System.out.println("Digite o n�mero!");
		  termo = sc.nextInt();
	  
		  if (termo == 1) {
			  System.out.println(termo+ "O Termo da sequ�ncia de Tribonacci �: " +1);
		  }
		  else 
			  if (termo == 2) {
				  System.out.println(termo + "O Termo da sequ�ncia de Tribonacci �: " +1); 
			  }
		  if (termo >= 3) {
			  t = a+b+c;
			  a=b;
			  b=c;
					  c=t;
					  System.out.println(termo + "Termo da sequ�ncia de Tribonacci �: "+ t);  
		  }
	  } while (termo != 0 );
		  sc.close();
	}
}