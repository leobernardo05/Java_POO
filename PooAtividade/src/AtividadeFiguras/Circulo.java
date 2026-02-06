package AtividadeFiguras;

public class Circulo implements IFigura {

	private double raio;
	

	// construtor
	public Circulo(double raio) throws FiguraInvalidaException {

		if (raio <= 0)
			throw new FiguraInvalidaException("raio menor ou igual a 0, comece denovo!");

		this.raio = raio;

	}

	// metodos IFigura
	public double getperimetro() {
		return (2 * Math.PI * raio);
	}

	public double getarea() {
		return (Math.PI * Math.pow(raio, 2));

	}
	
	public String getnome() {
		return "Círculo";
	}
	

}
