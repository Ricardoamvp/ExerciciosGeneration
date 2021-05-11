package exercicio17;

import java.util.Scanner;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class ClienteObjeto {
	public static void main(String[] args) {
		
		String nome, cpf, email;
		int idade;
		
		Scanner leia = new Scanner(System.in);

		Cliente cliente = new Cliente("x", "y", "z", 0);
		
		System.out.println("Insira seu nome: ");
		nome = leia.next();
		System.out.println("Insira seu cpf: ");
		cpf = leia.next();
		System.out.println("Insira seu email: ");
		email = leia.next();
		System.out.println("Insira seu idade: ");
		idade= leia.nextInt();
		
		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		cliente.setIdade(idade);
		
		
		cliente.Info();

	}
}
