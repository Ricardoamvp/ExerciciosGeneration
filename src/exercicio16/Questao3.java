package exercicio16;

import java.util.Scanner;

public class Questao3 {

	/*
	 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	 * idade for =-99. (WHILE)
	 */

	public static void main(String[] args) {

		int idade, total21 = 0, total50 = 0, x;

		Scanner leia = new Scanner(System.in);

		System.out.println("Entre com a idade: ");
		idade = leia.nextInt();

		while (idade != -99) {
			if (idade < 21) {
				total21 = total21 + 1;
			} else if (idade > 50) {
				total50++;
			}
			System.out.println("Entre com a idade: ");
			idade = leia.nextInt();
		}
		System.out.println("Total de pessoas com menos de 21 anos: " + total21);
		System.out.println("Total de pessoas com mais de 50 anos: " + total50);

	}
}