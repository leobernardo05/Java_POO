package arrays;

import java.util.Scanner;

public class AlunosUnidades {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float soma;
		float[][] nota = new float [5][4];
		
		for(int aluno = 0;aluno < nota.length;aluno++) {
			
			for(int unid = 0;unid < nota[aluno].length;unid++) {
				System.out.println("Digite a nota do aluno " + (aluno + 1) + " na unidade " + (unid + 1));
				nota[aluno][unid] = scan.nextFloat();
			}
			
		}
		for(int aluno = 0; aluno < nota.length;aluno++) {
			System.out.println("Aluno " + (aluno + 1));
			soma = 0;
			for(int unid = 0;unid < nota[aluno].length;unid++) {
				System.out.println("Unidade " + (unid + 1) + " do aluno " + (aluno + 1) + ":" + nota[aluno][unid]);
				soma+=nota[aluno][unid];
			}
			soma/=nota[aluno].length;
			System.out.println("media do aluno " + soma);
		}
           scan.close();
	}
	

}
