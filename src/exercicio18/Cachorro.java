package exercicio18;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String som, String movimentacao) {
		super(nome, idade, som, movimentacao);
	}

	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("au au");
	}

}
