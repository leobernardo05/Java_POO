package AtividadeFiguras;

public class Quadrado implements IFigura, IQuadrilaterolado {

	protected double lado;

	// construtor
	public Quadrado(double lado) throws FiguraInvalidaException {

		if (lado <= 0)
			throw new FiguraInvalidaException("Lado menor ou igual a 0, comece denovo!");

		this.lado = lado;
	}

	// metodos get
	public double getdiagonal() {
		return (lado * Math.sqrt(2));

	}

	public double getperimetro() {

		return (lado * 4);
	}

	public double getarea() {

		return (Math.pow(lado, 2));
	}
	
	public String getnome () {
		return "Quadrado";
	}

}
