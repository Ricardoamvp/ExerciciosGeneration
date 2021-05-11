package exercicio17;

/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

public class Cliente {

	private String nome;
	private String cpf;
	private String email;
	private int idade;

	public Cliente(String nome, String cpf, String email, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
	}

	public void Info() {
		System.out.println(
				"\t\tInformações:\nNome: " + nome + "\nCPF: " + cpf + "\nEmail: " + email + "\nIdade: " + idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
