package LpooedPoli;

import java.util.Scanner;

public class TesteMain {

	public static void main(String[] args) {
		
		IFiguraGeometrica[] figuras = new IFiguraGeometrica[5];
		Scanner scan = new Scanner (System.in);
		
		int opcao;
		
		for (int i = 0; i < figuras.length ; i++) {

			System.out.println("Qual forma geometrica você quer calcular? \n"
				+ "Digite 1 para Quadrado; \n"
				+ "Digite 2 para Círculo; \n"
				+ "Digite 3 pra Retângulo;" );
		opcao = scan.nextInt();
		
		if (opcao == 1) 
		{
			System.out.println("Lado:");
			float lado = scan.nextFloat();
			figuras [i] = new Quadrado (lado);	
		} 
		else if (opcao == 2) 
		{
			System.out.println("Base:");
			float base = scan.nextFloat();
			System.out.println("Altura:");
			float altura = scan.nextFloat();
			figuras [i] = new Retangulo (base, altura);
		}	
		else 
			System.out.println("Raio:");
		float raio = scan.nextFloat();
		figuras [i] = new Circulo (raio);	
		}
		
		
		
	}

}


