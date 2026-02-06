package Arrays;


import java.util.Scanner;

public class multidimensional {
	
         //curso java!!!!
	     //curso java!!!!
	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);
	     
	     System.out.println("Quantos alunos? ");
	     int qtdeAlunos = scan.nextInt();
	     
	     System.out.println("Quantas notas? ");
	     int qtdeNotas = scan.nextInt();
         
	     double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
	     
	     double total = 0;
	     // "i" percorre a quantidade alunos
	     for (int i = 0;i < notasDaTurma.length;i++) {
	    	 
	    	 // "j" percorre a quantidade de notas	    	 
	    	 for(int j = 0;j < notasDaTurma[i].length;j++) {
	    		 System.out.println ("informe a nota " + (j+1) + " do aluno " + (i+1));
	    		 notasDaTurma[i][j] = scan.nextDouble();
	    		 total += notasDaTurma[i][j];
	    	 }
	    	 System.out.println();
	     }
	     double media = total/(qtdeAlunos * qtdeNotas);
	     System.out.println("Média da turma é " + media);
	     
	     
	     
	     scan.close();
	}

}
