package exercicio17;

public class Funcionario {

	private String nome;
	private String cpf;
	private String cargo;
	private float salario;

	public Funcionario(String nome, String cpf, String cargo, float salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
		this.salario = salario;
	}

	public void Info() {
		System.out.println(
				"\t\tInformações: \nNome: " + nome + "\nCPF: " + cpf + "\nCargo: " + cargo + "\nSalario: R$" + salario);
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

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

}
