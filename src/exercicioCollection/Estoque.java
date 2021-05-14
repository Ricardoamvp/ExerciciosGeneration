package exercicioCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estoque {
	public static void main(String[] args) {

		List<Integer> estoque = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		int opc = 0;

		do {
			System.out.println(
					"\n\t\tOpções: \n1-Armazenar dados \n2-Remover dados \n3-Atualizar dados \n4-Apresentar dados");
			opc = scanner.nextInt();

			switch (opc) {

			case 1:

				int num = 0;
				do {
					System.out.println("Insira o valor que deseja adicionar ou insira uma valor negativo para sair");
					num = scanner.nextInt();
					if (num > 0) {
						estoque.add(num);
					}
				} while (num >= 0);

				break;

			case 2:

				System.out.println("Insira a posição do produto que você deseja remover");
				int remov = scanner.nextInt();
				estoque.remove(remov);
				break;

			case 3:

				System.out.println("Qual a posição do valor que será substituído");
				int posi = scanner.nextInt();
				System.out.println("Insira o novo valor");
				int novo = scanner.nextInt();
				estoque.set(posi, novo);
				break;

			case 4:

				for (Integer list : estoque) {
					System.out.print("\n" + list);

				}
				break;
			}
		} while (opc != 0);

		System.out.println("Fim do Programa");
		scanner.close();
	}
}
