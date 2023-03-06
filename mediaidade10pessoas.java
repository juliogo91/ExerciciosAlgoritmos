package exerciciosalgoritmo;

import java.util.Scanner;

public class mediaidade10pessoas {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int id1, id2, id3, id4, id5, id6, id7, id8, id9, id10;
		double media;

		System.out.println("Digite a idade da pessoa 1: ");
		id1 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 2: ");
		id2 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 3: ");
		id3 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 4 : ");
		id4 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 5 : ");
		id5 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 6 : ");
		id6 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 7 : ");
		id7 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 8 : ");
		id8 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 9 : ");
		id9 = ler.nextInt();
		System.out.println("Digite a idade da pessoa 10 : ");
		id10 = ler.nextInt();
		media = (id1 + id2 + id3 + id4 + id5 + id6 + id7 + id8 + id9 + id10)/10;
		System.out.println("A média das idades é : + media");

		ler.close();
	}
}