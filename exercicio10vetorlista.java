//Escreva um programa que leia e mostre um vetor de 20 elementos inteiros. a seguir, conte quantos valores pares existem no vetor
package exerciciosalgoritmo;

import java.util.Scanner;

public class exercicio10vetorlista {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		     int contador = 0;                                                                         // int contador = 0;
		     int [] v = new int [2];                                                                        // int[] v = new int[20];
                                                                                   //  for (int i = 0; i < v.lenght; i++) {
		for (int i = 0; i < v.length; i++) {                                  // System.out.println ("Digite o valor do vetor");
			System.out.println("Digite o valor do vetor");                        //  v [i] = sc.nextInt;
			v[i] = sc.nextInt();                                               //  }
		}                                                                      //    for (int i = 0; i < v.lenght; i++) {
		   for (int i = 0; i < v.length; i++) {                                                                  //    if (v [i] % 2 == 0){
		     if (v [i] % 2 == 0) {                                                               //   contador++ 
		       contador ++;                                                               // System.out.println ("A quantidade de números pares = %d\n" ,contador);
               System.out.printf("Quantidade de números pares = %d\n" , contador) ;                                                            //     }
		     }
			
			sc.close();
		}
	}
}