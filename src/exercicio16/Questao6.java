package exercicio16;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {

		int num, soma = 0, q = 0;
		Scanner leia = new Scanner(System.in);

		do {
			System.out.print("Insira um n�mero inteiro: ");
			num = leia.nextInt();

			if (num % 3 == 0 && num != 0) {
				soma += num;
				q++;
			} else {
				System.out.println("Este n�mero n�o � m�ltiplo de tr�s\n");
			}
		} while (num != 0);
		
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + soma / q);

	}
}
