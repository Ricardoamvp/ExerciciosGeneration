package exercicio18;

public class TesteAnimais {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("cachorro", 5, "latindo", "correndo");

		cachorro.emitirSom();
		cachorro.movimento();

		Cavalo cavalo = new Cavalo("cavalo", 8, "relinchando", "correndo");

		cavalo.emitirSom();
		cavalo.movimento();

		Preguica preguica = new Preguica("preguica", 3, "grunhindo", "escalando");

		preguica.emitirSom();
		preguica.movimento();
	}

}
