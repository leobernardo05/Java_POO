package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesvioPadrao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetor = new int[3];
		
		double menor;
		double maior;
		double media = 0;
		double soma = 0;
		double dividendo = 0;
		double desvio = 0;
		
		for (int i = 0;i < vetor.length ;i++) {
			System.out.println("Digite o numero " + (i+1) + ":" );
			vetor[i]=scan.nextInt();
		}
		menor = vetor[0];
		maior = vetor[0];
		
		for (int i = 0;i < vetor.length;i++) {
			
			soma+= vetor[i];
			
			if (menor > vetor [i]) {
				menor = vetor[i];
			}
			
			if (maior < vetor [i]) {
				maior = vetor [i];
			}
			
		}
		media = soma/vetor.length;
		
		for(int i = 0;i < vetor.length ;i++) {
			
			dividendo = (vetor[i]-media)*(vetor[i]-media)/vetor.length;
			
		}
		
		desvio = Math.sqrt(dividendo);
		
		System.out.println("Valores -> " + Arrays.toString(vetor));
		System.out.println("Menor -> " + menor);
		System.out.println("maior -> " + maior);
		System.out.println("media -> " + media);
		System.out.println("desvio padrao -> " + desvio);
	    
		scan.close();
	}
	
	   

}
