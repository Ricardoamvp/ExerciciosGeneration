package exercicio17;

public class Patinete {

	private String marca;
	private String modelo;
	private String material;
	private int rodas;
	private int faixaEtaria;

	public Patinete(String modelo, String marca, String material, int rodas, int faixaEtaria) {

		this.modelo = modelo;
		this.marca = marca;
		this.material = material;
		this.rodas = rodas;
		this.faixaEtaria = faixaEtaria;
	}

	public void Info() {
		System.out.println("O patinete " + modelo + " da " + marca + " é feito com " + material + ", possui " + rodas
				+ " rodas e é indicado para pessoas com cerca de " + faixaEtaria + " anos.");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getRodas() {
		return rodas;
	}

	public void setRodas(int rodas) {
		this.rodas = rodas;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

}
