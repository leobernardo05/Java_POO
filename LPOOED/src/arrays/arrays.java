package arrays;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		
		int[] impar = new int[101];
		int v = 1;
		
		for(int i = 0;i < impar.length;i++) {
			impar[i] = v;
			v+=2;
			
		}
		for(int i = 0;i < impar.length;i++) {
			System.out.print(impar [i] + "|");
		}
		System.out.println();
		
		int menor = 0;
		int maior = 0;
		double media = 0;
		for (int i = 0; i < impar.length;i++) {
			if (impar[i] < menor) {
				menor = impar[i];
			}
			if (impar[i] > maior) {
				maior = impar[i];
			}
			media+=impar[i];
		}
		media/=impar.length;
		System.out.println("Menor " + menor);
		System.out.println("Maior " + maior);
		System.out.println("Media " + media);
		
		
	}
	    
}
