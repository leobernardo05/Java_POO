package IFPE;

import java.util.Scanner;

public class triangulo {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int x;
		int y;
		int z;
		
		System.out.println("Digite o valor de um lado do triangulo:");
		x = scan.nextInt();
		System.out.println("Digite o valor de um lado do triangulo:");
		y = scan.nextInt();
		System.out.println("Digite o valor de um lado do triangulo:");
		z = scan.nextInt();
		
		if (x == y && x != z)
			System.out.println("isoceles");
		else if (x != y && x != z )
			System.out.println("escaleno");
		else 
			System.out.println("equilatero");
		
		scan.close();
	}

}
