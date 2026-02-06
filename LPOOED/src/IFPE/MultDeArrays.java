package IFPE;

import java.util.Scanner;

public class MultDeArrays {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int[] vetor = new int [10];
		
		for(int i = 0;i < vetor.length;i++) 
		{
			System.out.println("Digite o valor:");
			vetor[i]=scan.nextInt();
			vetor[i]*=2;
		}

		for(int i = 0;i < vetor.length;i++)
		{
			System.out.print(vetor[i]+" | ");
		}
		
		scan.close();
	}

}
