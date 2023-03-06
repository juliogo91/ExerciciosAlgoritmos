package exerciciosalgoritmo;

import java.util.Scanner;

public class matrizcomfuncao {

	 public static void main(String[] args) {

	        int maxlin = 3, maxcol = 3;
	        int mat[][] = new int[maxlin][maxcol];
	       
	        printamatint (mat, maxlin,maxcol);
	        preenchematint (mat, maxlin,maxcol);
	        printamatint (mat, maxlin,maxcol);
	    }

	    public static void preenchematint(int mat[][], int a, int b) {
	        Scanner ler = new Scanner(System.in);
	        int preenche;

	        for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                System.out.println("Digite o valor da posição [" + i + "] [" + j + "]");
	                preenche = ler.nextInt();
	                mat[i][j] = preenche;
	            }
	        }
	    }
	   
	    public static void printamatint (int mat[][], int a, int b){
	           for (int i = 0; i < a; i++) {
	            for (int j = 0; j < b; j++) {
	                System.out.printf("%d \t", mat[i][j]);
	            }
	            System.out.println("");
	        }
	    }

	}
