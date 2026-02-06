package AtividadeConta;

public abstract class Conta {

	private double saldo;
	private int numero;

	//Contrutor
	public Conta(int numero) {
		this(numero,0);
	}
	
    // sobrecarga de construtor 
	public Conta (int numero, double saldo) {
		this.setNumero(numero);;
		this.setSaldo(saldo);
	}
	
    // Métodos get e set
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	//Métodos
	public void creditar (float valor) {
		if (valor >= 0) {
		this.setSaldo(saldo - valor);
		}
	}
	
	public void debitar (float valor) {
		if (valor >= 0) {
	    this.setSaldo(saldo +valor);
		}
	}
	
	public void transferir(Conta c, float valor) {
		this.creditar(valor);
		this.debitar(valor);
	}
	

}
