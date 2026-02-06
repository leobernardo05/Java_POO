package IFPE;

import java.util.Scanner;

public class Decrescente {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Digite um valor:");
		a = scan.nextInt();
		System.out.println("Digite um valor:");
		b = scan.nextInt();
		System.out.println("Digite um valor:");
		c = scan.nextInt();
		
		if (a > b && b > c)
			System.out.println(a + "\n" + b + "\n" + c );
		  else if (a < b && a > c)
			  System.out.println(b + "\n" + a + "\n" + c);
		       else if (c > a && a > b)
			        System.out.println(c + "\n" + a + "\n" + b);
		            else if (c > b && b > a)
		            	System.out.println(c + "\n" + b + "\n" + a);
		                 else if (a > c && c > b)
		                	 System.out.println(a + "\n" + c + "\n" + b);
		                      else
		                    	  System.out.println(b + "\n" + c + "\n" + a);
		
		scan.close();
	}

}
