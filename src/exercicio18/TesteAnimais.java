package exercicio18;

public class TesteAnimais {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("cachorro", 5, "late", "corre");

		cachorro.Info();

		Cavalo cavalo = new Cavalo("cavalo", 8, "relincha", "corre");

		cavalo.Info();

		Preguica preguica = new Preguica("preguica", 3, "emite sons de alta-frequência pelas narinas", "escala");

		preguica.Info();
	}

}
