package exerciciosalgoritmo;

import java.util.Scanner;

public class lista2condicionalex2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int codigocidade;

		System.out.print("Digite o c�digo da cidade:\n");
		codigocidade = ler.nextInt();

		if (codigocidade == 61) {

			System.out.print("Bras�lia \n");

		} else if (codigocidade == 71) {
			System.out.print("Salvador \n");

		} else if (codigocidade == 11) {
			System.out.print("S�o Paulo \n");

		} else if (codigocidade == 21) {
			System.out.print("Rio de Janeiro \n");

		} else if (codigocidade == 32) {
			System.out.print("Juiz de Fora \n");

		} else if (codigocidade == 19) {
			System.out.println("Campinas");

		} else if (codigocidade == 27) {
			System.out.println("Vit�ria");

		} else if (codigocidade == 31) {
			System.out.println("Belo Horizonte");

		} else {
			System.out.println("DDD n�o cadastrado.");
		}

		ler.close();
	}
}
