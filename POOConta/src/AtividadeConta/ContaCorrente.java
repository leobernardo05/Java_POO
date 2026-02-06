package AtividadeConta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int numero) {
			this(numero,0);
		}

	public ContaCorrente (int numero, double saldo) {
			this.setNumero(numero);
			this.setSaldo(saldo);
		}

}
