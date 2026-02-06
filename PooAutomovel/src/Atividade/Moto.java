package Atividade;

public class Moto extends Automovel {

	// variáveis da moto
	int valorAtualMarcha;
	int cilindradas;

	// construtor
	public Moto(String cor, String cpfDono, float preco, int cilindradas, int valorAtualMarcha) {
		super(cor, cpfDono, preco);
		this.cilindradas = cilindradas;
		this.setValorMarcha(valorAtualMarcha);
	}

	// metódos get e set
	public void setValorMarcha(int valorMarchaAtual) {
		if (valorMarchaAtual >= 0 && valorMarchaAtual <= 6) {
			this.valorAtualMarcha = valorMarchaAtual;
		}
	}

	public int getValorMarcha() {
		return valorAtualMarcha;
	}

	public void setcilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	// métodos
	public void Acelerar() {
		System.out.println("Moto acelerando...");
	}

	public void Frear() {
		System.out.println("Moto freando...");
	}

	public void Abastecer() {
		System.out.println("Moto abastecendo...");
	}

	public void passarMarcha() {
		setValorMarcha(valorAtualMarcha+1);
		System.out.println("Passando marcha, valor atual: " + valorAtualMarcha);
	}

	public void reduzirMarcha() {
		setValorMarcha(valorAtualMarcha-1);
		System.out.println("Reduzindo marcha, valor atual: " + valorAtualMarcha);
	}

	// Método imprimir
	public String toString() {
		return "Cor: " + cor + " | " + "CPF do Dono: " + cpfDono + " | " + "Preço: " + preco + " | "
				+ "Clindradas da moto: " + cilindradas + " | " + "Valor da marcha: " + valorAtualMarcha;
	}

}
