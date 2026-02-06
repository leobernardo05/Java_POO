package LpooedPoli;

public class Retangulo implements IFiguraGeometrica {

	private float base;
	private float altura;

	public Retangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public String getNome() {
		return "Retangulo";
	}

	public float getArea() {
		return base * altura;
	}

	public float getPerimetro() {
		return (base * altura) * 2;
	}

}
