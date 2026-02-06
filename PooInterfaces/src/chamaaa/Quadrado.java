package chamaaa;

public class Quadrado implements IFiguraGeometrica {
	
	private float lado;
	
	public Quadrado (float lado) {
		this.lado = lado;
	}
	
    public String getNome () {
    	return "Quadrado";
    	
    }
	
	public float getArea () {
		return lado*lado;
	}
	
	public float getPerimetro () {
		return lado*4;
	}
	
	

}
