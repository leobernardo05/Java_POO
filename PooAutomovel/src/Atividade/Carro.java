package Atividade;

public class Carro extends Automovel {

	// Variáveis do carro
	int valorMarchaAtual;
	boolean ehconversivel;

	// Construtor
	public Carro(String cor, String cpfDono, float preco, boolean ehconversivel, int valorMarchaAtual) {
		super(cor, cpfDono, preco);
		this.setehconversivel(ehconversivel);
		this.setValorMarcha(valorMarchaAtual);
	}

	// Métodos get e set
	public int getValorMarcha() {
		return this.valorMarchaAtual;
	}

	public void setValorMarcha(int valorMarchaAtual) {
		if (valorMarchaAtual > 0 && valorMarchaAtual <= 6) {
			this.valorMarchaAtual = valorMarchaAtual;
		}
	}

	public void setehconversivel(boolean ehconversivel) {
		if (ehconversivel == true) {
			System.out.println("É conversível");
		} else if (ehconversivel == false) {
			System.out.println("Não é conversível");
		}
	}

	public boolean isConversivel() {
		return this.ehconversivel;
	}

	// Métodos
	public void Acelerar() {
		System.out.println("Carro acelerando...");
	}

	public void Frear() {
		System.out.println("Carro freando...");
	}

	public void Abastecer() {
		System.out.println("Carro abastecendo...");
	}

	public void passarMarcha() {
		setValorMarcha(valorMarchaAtual + 1);
		System.out.println("Passando marcha, valor atual: " + valorMarchaAtual);
	}

	public void reduzirMarcha() {
		setValorMarcha(valorMarchaAtual - 1);
		System.out.println("Reduzindo marcha, valor atual: " + valorMarchaAtual);
	}

	// Método imprimir
	public String toString() {
		return "Cor: " + cor + " | " + "CPF do Dono: " + cpfDono + " | " + "Preço: " + preco + " | "
				+ "Valor da marcha:" + valorMarchaAtual;
	}
}