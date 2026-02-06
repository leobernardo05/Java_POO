package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AtividadeArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetor = new int[2];
		String[] nome = new String[3];
		float[] nota = new float[4];
		// numero
		for (int x = 0; x < vetor.length; x++) {
			System.out.println("Digite um nº:");
			vetor[x] = scan.nextInt();
		}
		for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x] + "|");
		}
		System.out.println();
		// nomes
		for (int y = 0; y < nome.length; y++) {
			System.out.println("Digite um nome:");
			nome[y] = scan.next();
		}
		System.out.println(Arrays.toString(nome));
		// notas
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Digite uma nota:");
			nota[i] = scan.nextFloat();
		}
		System.out.println(Arrays.toString(nota));
		scan.close();

	}

}
