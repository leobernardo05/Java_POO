package IFPE;

import java.util.Scanner;

public class For {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
         
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite qual tabuda você quer: ");
		int a = scan.nextInt();
		
		System.out.println("Digite o inicio da sua tabuada: ");
		int x = scan.nextInt();
		
		System.out.println("Digite até onde sua tabuada vai: ");
		int y = scan.nextInt();
		
		for (   ; x <= y ; x++ ) 
		{
			System.out.println("\n" + a + "*" + x + "=" + (x*y));
			
		}
		
		scan.close();
		
	}

}
