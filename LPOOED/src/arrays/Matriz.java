 package arrays;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//dimensoes 
		float[][] notas = new float[3][];
		
		for(int linha = 0;linha<notas.length;linha++)  
		{
			System.out.println("Linha " + (linha + 1) + " qt de colunas: " );
			int colunas = scan.nextInt();	
			notas[linha] = new float[colunas];
			
			for(int coluna = 0;coluna < notas[linha].length;coluna++) 
			{
				System.out.println("Digite o valor da coluna" + (coluna+1) + ":");
				notas[linha][coluna] = scan.nextFloat();
				
			}
		}
	    
		for(int linha = 0;linha < notas.length ;linha++) {
			
			for(int coluna = 0;coluna < notas[linha].length;coluna++) {
			System.out.print(notas[linha][coluna]+" | " );

			}	
			System.out.println();
	    }
	
	      scan.close();
	}
	
	

}
