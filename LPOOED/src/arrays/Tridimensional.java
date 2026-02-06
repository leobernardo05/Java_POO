package arrays;

import java.util.Scanner;

public class Tridimensional {
	public static void main(String[] args) {
		int qtAlunos;

	       int qtUnidades = 4;

	       int qtTurmas = 3;

	       Scanner scan = new Scanner(System.in);

	       float notas[][][] = new float[qtTurmas][][];

	       

	       for(int turma = 0; turma < qtTurmas; turma++) {

	           System.out.println("Turma "+(turma+1));

	           System.out.println("Informe a quantidade de alunos");

	           qtAlunos = scan.nextInt();

	           notas[turma] = new float[qtAlunos][qtUnidades];

	           for(int aluno = 0; aluno < qtAlunos; aluno++) {

	               System.out.println("Aluno "+(aluno+1));

	               for(int unidade = 0; unidade < qtUnidades; unidade++)

	               {

	                   System.out.println("Nota na unidade "+(unidade+1)+":");

	                   notas[turma][aluno][unidade] = scan.nextFloat();

	               }

	           }

	       }

	       

	       

	       System.out.println("Médias dos alunos por turma:");

	       for(int turma = 0; turma < qtTurmas; turma++) {

	           System.out.println("Turma "+(turma+1));

	           for(int aluno = 0; aluno < notas[turma].length; aluno++) {

	               float media = 0;

	               for(int unidade = 0; unidade < qtUnidades; unidade++) {

	                   media += notas[turma][aluno][unidade];

	               }

	               media /= qtUnidades;

	               System.out.println("Média aluno "+(aluno+1)+": "+media);

	           }

	       }

	       

	       System.out.println("Médias das unidades por turma:");

	       for(int turma = 0; turma < qtTurmas; turma++) {

	           System.out.println("Turma "+(turma+1));

	           for(int unidade = 0; unidade < qtUnidades; unidade++) {

	               float media = 0;

	               for(int aluno = 0; aluno < notas[turma].length; aluno++) {

	                   media += notas[turma][aluno][unidade];

	               }

	               media /= notas[turma].length;

	               System.out.println("Média da unidade "+(unidade+1)+": "+media);

	           }

	       }
	}

}
