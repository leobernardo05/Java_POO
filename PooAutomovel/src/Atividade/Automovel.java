package Atividade;

public class Automovel {

	// Variáveis do automóvel
	protected String cor;
	protected String cpfDono;
	protected float preco;

	// Construtor
	public Automovel(String cor, String cpfDono, float preco) {
		this.cor = cor;
		this.cpfDono = cpfDono;
		this.setPreco(preco);
	}

	// Métodos get e set
	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getCpfDono() {
		return this.cpfDono;
	}

	public void setCpfDono(String cpfDono) {
		this.cpfDono = cpfDono;
	}

	public float getPreco() {
		return this.preco;
	}

	public void setPreco(float preco) {
		if (preco > 0) {
			this.preco = preco;

		}

	}

	// Método imprimir
	public String toString() {
		return "Cor: " + cor + " | " + "CPF do Dono: " + cpfDono + " | " + "Preço: " + preco;
	}
}