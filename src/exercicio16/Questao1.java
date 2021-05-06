package exercicio16;

public class Questao1 {

	/*
	 * Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos
	 * resto = 5. (FOR)
	 */

	public static void main(String[] args) {

		int num = 1000;

		for (int x = 0; x < 999; x++) {
			if (num % 11 == 5) {
				System.out.println(num);
			}
			num++;

		}

	}

}
