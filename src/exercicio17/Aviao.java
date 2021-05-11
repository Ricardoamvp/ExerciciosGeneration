package exercicio17;

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

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
		System.out.println("\t\tInformações:\nQuantidade de turbinas: " + turbinas + "\nQuantidade de assentos: "
				+ assentos + "\nVelocidade máxima: " + velocidademax + " km/h");
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
