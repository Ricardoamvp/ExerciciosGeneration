package exercicio16;

import java.util.Scanner;

public class Questao2 {

	// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

	public static void main(String[] args) {

		int num, q, totalpar = 0, totalimpar = 0;

		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos números você deseja inserir? ");
		q = leia.nextInt();

		for (int x = 0; x < q; x++) {
			System.out.println("\nInsira outro número: ");
			num = leia.nextInt();

			if (num % 2 == 0) {
				totalpar++;
			} else {
				totalimpar++;
			}

		}

		System.out.println("Total de números pares: " + totalpar);
		System.out.println("Total de números ímpares: " + totalimpar);

	}

}
