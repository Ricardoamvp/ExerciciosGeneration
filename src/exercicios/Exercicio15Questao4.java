package exercicios;

import java.util.Scanner;

public class Exercicio15Questao4 {
	public static void main(String[] args) {
		
		float num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		num = leia.nextFloat();
		
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par e sua raiz é " + Math.sqrt(num));
		}else {
			System.out.println("O número " + num + " é ímpar e ele elevado ao quadrado é " + num * num);
		}
		
	}

}
