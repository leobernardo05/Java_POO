package Prática;

		import java.util.Scanner;

		public class Giba{
			
			public static void main(String[] args) {
				//divisão
				int cont = 1;
				int parar = 0;
				
				Scanner scan = new Scanner (System.in);
				
				while (parar != 1 || cont != 5) {
					
					System.out.println("Digite um n°: ");
					float x = scan.nextFloat();
					
				    System.out.println("Digite seu divisor: ");
				    float y = scan.nextFloat();
				    
				    if(y == 0) {
				    	System.out.println("Divisor invalido");
				    	break;
				    }
				    
				  
				    x/=y;
				    System.out.println("Resultado: " + x);
				  
				    
				    if (cont == 5){
				    	break;
				    }
				    System.out.println("Digite 1 para parar ou 0 para continuar");
				    parar = scan.nextInt();
				    
				    cont++;
				    
				
				scan.close();		
				
			}
				
 
			}
		}

