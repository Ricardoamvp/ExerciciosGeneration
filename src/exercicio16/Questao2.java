package exercicio16;

import java.util.Scanner;

public class Questao2 {

	// Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)

	public static void main(String[] args) {

		int num, q, totalpar = 0, totalimpar = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos n�meros voc� deseja inserir? ");
		q = leia.nextInt();

		for (int x = 0; x < q; x++) {
			System.out.println("\nInsira outro n�mero: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				totalpar++;
			} else {
				totalimpar++;
			}

		}

		System.out.println("Total de n�meros pares: " + totalpar);
		System.out.println("Total de n�meros �mpares: " + totalimpar);

	}

}
