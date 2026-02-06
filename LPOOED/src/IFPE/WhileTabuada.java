package IFPE;

import java.util.Scanner;

public class WhileTabuada {
	
	public static void main(String[] args) {
		int parar = 0;
		
		Scanner scan = new Scanner (System.in);
		
		while (parar != 1) {
			
		
		System.out.println("Digite qual tabuada você quer: ");
		int mult = scan.nextInt();
		
		System.out.println("Digite onde inicia a tabuada do " + mult + ":");
		int x = scan.nextInt();
		
		System.out.println("Digite até onde vai a tabuado do " + mult + ":");
		int y = scan.nextInt();
		
		while (x <= y) 
		{
			System.out.println("\n" + x + "*" + mult + "="  + (x*mult));
			x++;
			
		}
		
	       System.out.println("Digite 1 para parar ou 0 para continuar: ");
	       parar = scan.nextInt();
		
	    }
		scan.close();
		System.out.println("Fim!");

		
     }
	
}	
