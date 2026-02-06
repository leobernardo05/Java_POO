package Atividade;

public class Ferrari extends Carro {

	public Ferrari(String cor, String cpfDono, float preco, boolean ehconversivel, int valorMarchaAtual) {
		super(cor, cpfDono, preco, ehconversivel, valorMarchaAtual);
	}

	// Método imprimir
	public String toString() {
		return "Cor: " + cor + " | " + "CPF do Dono: " + cpfDono + " | " + "Preço: " + preco + " | " + " | "
				+ "Valor da marcha: " + valorMarchaAtual;
	}
}
