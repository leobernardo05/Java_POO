package LpooedPoli;

public class Circulo implements IFiguraGeometrica{

	private float raio;

	public Circulo(float raio) throws Exception {
		if (raio == )
		this.raio = raio;
	}

	public String getNome() {
		return "Circulo";
	}

	public float getArea() {
		return (float) (Math.PI * raio * raio);
	}

	public float getPerimetro() {
		return (float) (Math.PI * raio * 2);
	}

}
