package arrays;

public class multidimencionais {
	public static void main(String[] args) {
		float [][] notas = { 
				{7.90f,8.3f,9,10},
				{1,2,3.9f,5.8f}				
		};
		
		for(int i = 0;i < notas.length;i++) {
			//declaração de notas
			for (int j = 0;j < notas[i].length;j++) {
				System.out.print(notas[i][j]+ " | ");
			}
			System.out.println();
		}
		
	}

}
