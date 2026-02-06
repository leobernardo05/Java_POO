package IFPE;

import java.util.Scanner;

public class Cast {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int x;
		int y;
		
		System.out.println("Digite um valor:");
		x = scan.nextInt();
		System.out.println("Digite outro valor");
		y = scan.nextInt();
		
		x*=2;
		y*=5;
		
        double media = (double) (x+y)/2; //uso do cast
        System.out.println("Media da multiplicação:" + media);
        
        scan.close();
				
	}
	

}
