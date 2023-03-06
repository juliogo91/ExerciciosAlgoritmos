package exerciciosalgoritmo;

import java.util.Scanner;

public class logicasequencial8 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int Qts;
        double presunto, queijo, hamburguer;
        
        System.out.println("Digite a quantidade de Sanduiches para fazer: ");
        Qts = ler.nextInt();
        
        presunto = Qts * 0.05;
        queijo = Qts * 0.1;
        hamburguer = Qts * 0.1;
        
        System.out.println("A quantidade de presunto: " + presunto);
        System.out.println("A quantidade de queijo: " + queijo);
        System.out.println("A quantidade de hambúrguer: " + hamburguer);
        
      
		ler.close();
	}
}