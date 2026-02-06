package chamaaa;

public class TesteMain {
	public static void main(String[] args) {

		Quadrado q1 = new Quadrado(2);
		System.out.println(q1.getNome());
		System.out.println(q1.getArea());
		System.out.println(q1.getPerimetro());
		
		System.out.println();

		Retangulo r1 = new Retangulo(5, 6);
		System.out.println(r1.getNome());
		System.out.println(r1.getArea());
		System.out.println(r1.getPerimetro());
		
		System.out.println();
		
		Circulo c1 = new Circulo(3);
		System.out.println(c1.getNome());
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimetro());

	}

}
