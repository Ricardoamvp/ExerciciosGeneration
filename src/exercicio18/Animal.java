package exercicio18;

public class Animal {

	private String nome;
	private int idade;
	private String som;
	private String movimentacao;

	public Animal(String nome, int idade, String som, String movimentacao) {
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.movimentacao = movimentacao;
	}

	public void emitirSom() {
		System.out.println(nome + " está " + som);
	}
	
	public void movimento() {
		System.out.println(nome + " está " + movimentacao);
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getMovimentacao() {
		return movimentacao;
	}

	public void setMovimentacao(String movimentacao) {
		this.movimentacao = movimentacao;
	}

}
