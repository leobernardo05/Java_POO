package IFPE;

import java.util.Scanner;

public class Bhaskara {

	public static void main(String[] args) {
		// bhaskara

		Scanner scan = new Scanner(System.in);

		float a;
		float b;
		float c;
		float x1, x2;

		System.out.println("Digite o valor de A:");
		a = scan.nextFloat();

		System.out.println("Digite o valor de B:");
		b = scan.nextFloat();

		System.out.println("Digite o valor de C:");
		c = scan.nextFloat();

		double delta = b * b - 4 * a * c;

		if (delta >= 0) {

			x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);

		} else
			System.out.println("solução não real");

		scan.close();

	}

}
