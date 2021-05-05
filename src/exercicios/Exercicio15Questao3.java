package exercicios;

import java.util.Scanner;

public class Exercicio15Questao3 {
	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual sua idade? ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Você está na categoria infantil");
		} else if (idade >= 15 && idade <= 17) {
			System.out.println("Você está na categoria juvenil");
		} else if (idade >= 18 && idade <= 25) {
			System.out.println("Você está na categoria adulta");
		} else {
			System.out.println("Você não poderá participar deste torneio");
		}
	}
}
