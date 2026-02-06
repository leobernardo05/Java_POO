package POOCarro;

public class Prisma extends Chevrolet {
		
	public void frear (boolean abs) {
		if (abs)
			System.out.println("Método frear abs");
		else 
			System.out.println("Freio comum prisma");
	}
	
	@Override
	public void imprime() {
		System.out.println("Prisma");
	}

}
