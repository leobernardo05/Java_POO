package AtividadeFiguras;

import java.util.Scanner;

public class TesteFiguras {
	public static void main(String[] args) throws FiguraInvalidaException {

		Scanner scan = new Scanner(System.in);

		// Quantidade de figuras
		System.out.println("Quantas figuras você quer calcular?");
		int x = scan.nextInt();

		// Vetor para armazenar quatidade de figuras
		IFigura[] figuras = new IFigura[x];

		int opcao = 0;

		// laço para perguntar ao usuário qual o tipo de figura e os valores da figura
		// que escolheu
		for (int i = 0; i < figuras.length; i++) {

			// laço para certificar se escolheu a forma geometrica certa
			while (true) {
				System.out.println("Qual forma geométrica você quer calcular? \n" + "Digite 1 para Quadrado \n"
						+ "Digite 2 para Retângulo \n" + "Digite 3 para Círculo");
				opcao = scan.nextInt();

				if (opcao == 3 || opcao == 2 || opcao == 1) {
					break; // sai do laço e continua
				} else {
					System.out.println("valor invalido, digite novamente!");
				}
			}

			// figuras
			if (opcao == 1) {
				System.out.println("Quadrado");
				System.out.println("Lado:");
				double lado = scan.nextDouble();
				try {
					figuras[i] = new Quadrado(lado);
				} catch (FiguraInvalidaException e) {
					System.out.println(e.getMessage());
					i--;
					continue;
				}

			} else if (opcao == 2) {
				System.out.println("Retângulo");
				System.out.println("Base:");
				float base = scan.nextFloat();
				System.out.println("Altura:");
				float altura = scan.nextFloat();

				try {
					figuras[i] = new Retangulo(base, altura);
				} catch (FiguraInvalidaException e) {
					System.out.println(e.getMessage());
					i--;
					continue;
				}
			} else if (opcao == 3) {
				System.out.println("Círculo");
				System.out.println("Raio:");
				float raio = scan.nextFloat();

				try {
					figuras[i] = new Circulo(raio);
				} catch (FiguraInvalidaException e) {
					System.out.println(e.getMessage());
				}
			}
		}

		// Exibir resultados e calculos
		for (int i = 0; i < figuras.length; i++) {

			// quebra de linha
			System.out.println();

			// Exibição de resultado e calculos
			System.out.println("Nome:" + figuras[i].getnome());
			System.out.println("Area: " + figuras[i].getarea());
			System.out.println("Perimetro: " + figuras[i].getperimetro());
			if (figuras[i] instanceof Quadrado) {
				System.out.println("Diagonal: " + ((Quadrado) figuras[i]).getdiagonal());
			} else if (figuras[i] instanceof Retangulo) {
				System.out.println("Diagonal: " + ((Retangulo) figuras[i]).getdiagonal());
			}
		}

		scan.close();
	}

}
