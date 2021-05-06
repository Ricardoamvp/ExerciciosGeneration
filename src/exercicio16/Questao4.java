package exercicio16;

import java.util.Scanner;

public class Questao4 {

	/*
	 * Uma empresa desenvolveu uma pesquisa para saber as características
	 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as
	 * opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa
	 * era agressiva). Pede-se para elaborar um sistema que permita ler os dados de
	 * 150 pessoas, calcule e mostre: (WHILE) - o número de pessoas calmas; - o
	 * número de mulheres nervosas; - o número de homens agressivos; - o número de
	 * outros calmos; - o número de pessoas nervosas com mais de 40 anos; - o número
	 * de pessoas calmas com menos de 18 anos.
	 */

	public static void main(String[] args) {

		int idade, sexo, fp, contpc = 0, contmn = 0, contha = 0, contoc = 0, contpn40 = 0, contpc18 = 0, x = 1;

		Scanner leia = new Scanner(System.in);

		while (x <= 6) {
			System.out.println("\nEntre com a sua idade: ");
			idade = leia.nextInt();
			System.out.println("\nSexo: \n1-Feminino\n2-Masculino\n3-Outros");
			sexo = leia.nextInt();
			System.out.println("\nFator Psicológico:\n1-Calma/o/e\n2-Nervosa/o/e\n3-Agressivos/as/es");
			fp = leia.nextInt();

			if (fp == 1) {
				contpc++;
			}
			if (sexo == 1 && fp == 2) {
				contmn++;
			}
			if (sexo == 2 && fp == 3) {
				contha++;
			}
			if (sexo == 3 && fp == 1) {
				contoc++;
			}
			if (fp == 2 && idade > 40) {
				contpn40++;
			}
			if (fp == 1 && idade < 18) {
				contpc18++;
			}
			x++;
		}
		System.out.println("\nQuantidade de pessoas calmas: " + contpc);
		System.out.println("\nQuantidade de mulheres nervosas: " + contmn);
		System.out.println("\nQuantidade de homens agressivos: " + contha);
		System.out.println("\nQuantidade de outros calmas: " + contoc);
		System.out.println("\nQuantidade de pessoas nervosas com mais de 40 anos: " + contpn40);
		System.out.println("\nQuantidade de pessoas calmas com menos de 18 anos: " + contpc18);
	}

}