package arrays;

import java.util.Scanner;

public class multidimencionais_scan {
     public static void main(String[] args) {
		 
    	 Scanner scan = new Scanner(System.in);
		 
    	 int vetor [][] = new int [2][4]; 
    	 
    	 for (int i = 0;i<vetor.length;i++) {    		 
    		    
    		 for (int j = 0;j<vetor[i].length;j++) {
    			 System.out.println("Digite o numero da linha " + (i+1) + " e coluna " + (j+1));
                 vetor[i][j] = scan.nextInt();
    		 }
    		     		 
    	 }
    	 for(int i = 0; i < vetor.length; i++){

    	         for(int j = 0; j < vetor[i].length; j++) {
    	         System.out.print(vetor[i][j]+" | ");
    	 }

    	 System.out.println();

    	 }
    	 scan.close();
	}
}
