package IFPE;

import java.util.Scanner;

public class DesvioPadrao {
	public static void main(String[] args) {
		double soma = 0;
		Scanner scan = new Scanner (System.in);
		double[] vetor = new double[3];
		
		for(int i = 0;i < vetor.length;i++) 
		{
			System.out.println("Digite um valor:");
			vetor[i] = scan.nextDouble();
		}
		
		for(int i = 0;i < vetor.length;i++) 
		{
			soma+=vetor[i];
		}
		System.out.println("Soma = " + soma);
		soma/=3;
		System.out.println("media =" + soma);
		
		
		
		
		
	}

}
