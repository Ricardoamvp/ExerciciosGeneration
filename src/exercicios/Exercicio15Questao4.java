package exercicios;

import java.util.Scanner;

public class Exercicio15Questao4 {
	public static void main(String[] args) {
		
		float num;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira um n�mero: ");
		num = leia.nextFloat();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero " + num + " � par e sua raiz � " + Math.sqrt(num));
		}else {
			System.out.println("O n�mero " + num + " � �mpar e ele elevado ao quadrado � " + num * num);
		}
		
	}

}
