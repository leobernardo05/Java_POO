package arrays;


public class Array {
	public static void main(String[] args) {
		
		
		int[] vetor = new int [10];
		int v = 1;
		
		for(int i = 0; i < vetor.length; i++) 
		{
		   vetor[i] = v;
		   v+=1;
		}
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "|");
		}
		
		

	}


}
