package Arrays;

import java.util.Scanner;

public class Prova {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int [][] MinhaVida = new int [5][];
		int Gabi = 0;		
		
		for (int linha = 0;linha < MinhaVida.length; linha++) {
		      System.out.println("Digite a qntd de produtos na loja " + (linha + 1) );
		      int colunas=scan.nextInt();
		      MinhaVida[linha] = new int[colunas];
		      
		      for(int coluna = 0;coluna < MinhaVida[linha].length;coluna++) {
		    	  System.out.println("Digite quantos produtos " + (coluna + 1) + "foram vendidos na loja " + (linha + 1) );
		    	  MinhaVida[linha][coluna] = scan.nextInt();
		      }
		      
		}
		
		for(int linha = 0;linha < MinhaVida.length; linha++) {
			System.out.println("maior qntd de prod vendidos na loja " + (linha +1));
			Gabi = 0;
		    for(int coluna = 0;coluna < MinhaVida[linha].length;coluna++) {
		    	if (MinhaVida[linha][coluna] > Gabi) {
		    		Gabi = MinhaVida[linha][coluna];
		    	}
		    	System.out.println();
		    }

		}
		
	}

}
