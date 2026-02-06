package POOCarro;

public abstract class Carro {
	
	public void frear () {
		System.out.println("freando o carro...");
	}
	
	public void acelerar () {
		System.out.println("acelerando carro...");
	}
	
	public abstract void imprime();

}
