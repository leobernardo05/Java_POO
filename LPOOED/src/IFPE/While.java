package IFPE;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		//soma
		int parar = 0; 
		
		Scanner scan = new Scanner (System.in);
		
        
		while (parar != 1)
		{
			System.out.println("Digite um numero: ");
			int x = scan.nextInt();
			System.out.println("Digite a soma: ");
            int soma = scan.nextInt();
            x+=soma;
            System.out.println("Resultado = " + x);
            System.out.println("Digite 1 para parar ou 0 para continuar: ");
            parar = scan.nextInt();
            
		}
		    scan.close();
		
	}

}
