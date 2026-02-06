package Prática;

import java.util.Scanner;

public class nelessssssss {
	public static void main(String[] args) {	
			Scanner scan = new Scanner (System.in);
			
			System.out.println("Digite um numero: ");
			char a = scan.next().charAt(0);
			
			System.out.println("Digite um numero: ");
			int b = scan.nextInt();
			
			System.out.println("Digite um numero: ");
			int c = scan.nextInt();
					
			switch (a) {
			      case 1:
			      System.out.println("Dia: Domingo");
			      break;
			      case 2:
			    	  System.out.println("Dia:  Segunda");
			    	  break;
			      case 3:
			    	  System.out.println("Dia: Terça");
			    	  break;
			      case 4:
			    	  System.out.println("Dia: Quarta");
			    	  break;
			      case 5:
			    	  System.out.println("Dia: Quinta");
			    	  break;
			      case 6:
			    	  System.out.println("Dia: Sexta");
			    	  break;
			      case 7:
			    	  System.out.println("Dia: Sabádo");
			    	  break;
			      
			      default: 
			    		  System.out.println("Numero invalido");
			    	  break;
			     		
			      }
	              	scan.close();

	}
}