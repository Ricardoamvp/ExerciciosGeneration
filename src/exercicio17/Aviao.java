package exercicio17;

/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/

public class Aviao {

	private int turbinas;
	private int assentos;
	private float velocidademax;

	public Aviao(int turbinas, int assentos, float velocidademax) {
		this.turbinas = turbinas;
		this.assentos = assentos;
		this.velocidademax = velocidademax;
	}

	public void Info() {
		System.out.println("\t\tInforma��es:\nQuantidade de turbinas: " + turbinas + "\nQuantidade de assentos: "
				+ assentos + "\nVelocidade m�xima: " + velocidademax + " km/h");
	}

	public int getTurbinas() {
		return turbinas;
	}

	public void setTurbinas(int turbinas) {
		this.turbinas = turbinas;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public float getVelocidademax() {
		return velocidademax;
	}

	public void setVelocidademax(float velocidademax) {
		this.velocidademax = velocidademax;
	}

}
