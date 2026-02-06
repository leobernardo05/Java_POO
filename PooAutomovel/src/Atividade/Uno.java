package Atividade;

public class Uno extends Carro {

	public Uno(String cor, String cpfDono, float preco, boolean ehconversivel, int valorMarchaAtual) {
		super(cor, cpfDono, preco, ehconversivel, valorMarchaAtual);
	}

	// Método imprimir
	public String toString() {
		return "Cor: " + cor + " | " + "CPF do Dono: " + cpfDono + " | " + "Preço: " + preco + " | " + " | "
				+ "Valor da marcha: " + valorMarchaAtual;
	}

}
