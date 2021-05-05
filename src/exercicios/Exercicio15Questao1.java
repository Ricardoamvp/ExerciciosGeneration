package exercicios;

import java.util.Scanner;

public class Exercicio15Questao1 {
	public static void main(String[] args) {

		int num1, num2, num3;

		Scanner leia = new Scanner(System.in);

		System.out.println("Insira 3 valores: ");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("O maior número é o número " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("O maior número é o número " + num2);
		} else {
			System.out.println("O maior número é o número " + num3);
		}

	}

}
