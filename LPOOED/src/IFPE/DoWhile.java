package IFPE;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		//divisão
		int cont = 1;
		int parar = 0;
		
		Scanner scan = new Scanner (System.in);
		
		do {
			System.out.println("Digite um n°: ");
			float x = scan.nextFloat();
			
		    System.out.println("Digite seu divisor: ");
		    float y = scan.nextFloat();
		    
		    if(y == 0) {
		    	System.out.println("Divisor invalido");
		    	continue;
		    }
		    
		    x/=y;
		    System.out.println("Resultado: " + x);
		    
		    if (cont == 5){
		    	break;
		    }
		    System.out.println("Digite 1 para parar ou 0 para continuar");
		    parar = scan.nextInt();
		    
		    cont++;
		    
		} while (parar != 1);
		
		scan.close();		
		
	}

}
