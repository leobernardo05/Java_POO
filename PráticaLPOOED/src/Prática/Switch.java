package Prática;

import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		int a = 1; 
		Scanner x = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 5:");
		a = x.nextInt();
		
		switch (a) {
		       case 1:
		       System.out.println("Dia:" + "Segunda");
		       break;
		       case 2:
		    	   System.out.println("Dia:" + "Terça");
		    	   break;
		       case 3:
		    	   System.out.println("Dia:" + "Quarta");
		    	   break;
		       case 4:
		    	   System.out.println("Dia:" + "Quinta");
		    	   break;
		       case 5:
		    	   System.out.println("Dia:" + "Sexta");
		    	   break;
		       default:
		    	   System.out.println("Numero invalido");
		    	   
		    x.close();
		}
		
	}

}
