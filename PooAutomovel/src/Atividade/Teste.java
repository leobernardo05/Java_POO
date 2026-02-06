package Atividade;

public class Teste {

	public static void main(String[] args) {

		System.out.println("Automóvel: ");
		Automovel Auto1 = new Automovel("Azul", "111.111.111-11", 1000000);
		System.out.println(Auto1);

		System.out.println();

		System.out.println("Avião: ");
		Aviao Avi1 = new Aviao("Branco", "222.222.222.22", 9000000);
		System.out.println(Avi1);

		System.out.println();

		System.out.println("Carro: ");
		Carro Car1 = new Carro("Prata", "333.333.333.33", 100000, true, 2);
		System.out.println(Car1);

		System.out.println();

		System.out.println("Moto: ");
		Moto Mot1 = new Moto("Preta", "444.444.444.44", 20000, 150, 2);
		System.out.println(Mot1);

		System.out.println();

		System.out.println("Ferrari: ");
		Ferrari Fer1 = new Ferrari("Vermelha", "555.555.555.55", 2000000, true, 2);
		System.out.println(Fer1);
		Fer1.passarMarcha();
		Fer1.passarMarcha();
		System.out.println("Ferrari apos passar marca 2x: ");
		System.out.println(Fer1);
		Fer1.reduzirMarcha();
		System.out.println("Ferrari apos reduzir marcha 1x: ");
		System.out.println(Fer1);

		System.out.println();

		System.out.println("Uno: ");
		Uno Uno1 = new Uno("Verde", "850.111.560.69", 25000, false, 3);
		System.out.println(Uno1);

	}

}
