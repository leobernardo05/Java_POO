package AtividadeFiguras;

public class Retangulo implements IFigura, IQuadrilaterolado {

	protected double base;
	protected double altura;

	// construtor
	public Retangulo(double base, double altura) throws FiguraInvalidaException {

		if (base <= 0 && altura <= 0)
			throw new FiguraInvalidaException("Base e altura menor ou igual a zero, comece denovo!");

		if (altura <= 0)
			throw new FiguraInvalidaException("Altura menor ou igual a 0, comece denovo!");

		if (base <= 0)
			throw new FiguraInvalidaException("Base menor ou igual a 0, comece denovo!");

		this.base = base;
		this.altura = altura;

	}

	// metodos herdados
	public double getdiagonal() {
		return (Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2)));
	}

	public double getperimetro() {
		return ((altura * 2) + (base * 2));
	}

	public double getarea() {
		return (base * altura);
	}
	
	public String getnome () {
		return "Retangulo";
	}
	
	

}
