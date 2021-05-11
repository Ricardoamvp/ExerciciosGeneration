package exercicio17;

public class Banco {
	
	private String nome;
	private String cpf;
	private String conta;
	private double saldo;
	
	public Banco (String nome, String cpf, String conta, double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public void Info() {
		System.out.println("\t\tDados Bancários: \nNome: " + nome + "\nCPF: " + cpf + "\nConta: " + conta + "\nSaldo: R$" + saldo);
	}
	

}
