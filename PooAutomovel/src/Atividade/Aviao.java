package Atividade;

public class Aviao extends Automovel {

	// Construtor
	public Aviao(String cor, String cpfDono, float preco) {
		super(cor, cpfDono, preco);
	}

	// Métodos
	public void Abastecer() {
		System.out.println("Avião abastecendo...");
	}

	public void Decolar() {
		System.out.println("Avião decolando...");
	}

	public void Pousar() {
		System.out.println("Avião pousando...");
	}

	// Método imprimir
	public String toString() {
		return "Cor: " + cor + " | " + "CPF do Dono: " + cpfDono + " | " + "Preço: " + preco;
	}

}
