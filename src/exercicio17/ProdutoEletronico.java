package exercicio17;

public class ProdutoEletronico {

	private String nome;
	private String codigo;
	private float valor;
	private int estoque;

	public ProdutoEletronico(String nome, String codigo, float valor, int estoque) {
		this.nome = nome;
		this.codigo = codigo;
		this.valor = valor;
		this.estoque = estoque;
	}

	public void Info() {
		System.out.println("\t\tInformações:\nNome do produto: " + nome + "\nCódigo do Produto: " + codigo
				+ "\nValor do produto: R$" + valor + "\nQuantidade em estoque: " + estoque);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

}
