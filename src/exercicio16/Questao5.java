package exercicio16;

import java.util.Scanner;

public class Questao5 {

	/*
	 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero
	 * igual a zero. No final, mostre a soma dos n�meros digitados.(DO...WHILE)
	 */

	public static void main(String[] args) {

		int num, soma = 0;

		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("\nInsira um valor: ");
			num = leia.nextInt();

			soma += num;
		} while (num != 0);

		System.out.println("A soma do n�meros �: " + soma);

	}

}
