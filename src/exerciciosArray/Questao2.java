package exerciciosArray;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {

		int[] num = new int[6];
		int somapar = 0, quantimpar = 0;

		Scanner leia = new Scanner(System.in);

		for (int x = 0; x < 6; x++) {
			System.out.println("\nEntre com um n�mero: ");
			num[x] = leia.nextInt();

			if (num[x] % 2 == 0) {
				System.out.println(num[x] + " <-- � um n�mero par");
				somapar = somapar + num[x];
			} else {
				System.out.println(num[x] + " <-- � um n�mero �mpar");
				quantimpar++;
			}
		}
		System.out.println("\nSomat�rio dos pares: " + somapar);
		System.out.println("\nQuantidade de �mpares: " + quantimpar);
	}

}
