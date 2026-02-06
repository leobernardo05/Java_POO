package IFPE;

public class Operaçoes {
	
	public static void main(String[] args) {
		// 1) ++ e --
		int x = 1;
		x++;
		int y = 6;
		y--;
		System.out.println(" ++ = " + x + "\n -- = " + y);
		
		// 2) /,*e %
		float f = 5;
		float z = 3;
		float res = (f*z)/2;
		System.out.println("2) " + res);
		System.out.println("2) " + res % 2);
		
		// 3) + e -
		short g = 8;
		g+=2;
		short o = 6;
		o-=1;
		System.out.println("+ = " + g + "\n- = " + o);
		
		// 4) ==, !=, && e ||
		System.out.println(2 < 3 && 6 != 1); //
		System.out.println(3 < 1 || 1 > 0);
		System.out.println(!(3 < 1));
		System.out.println(2 < 3 && 6 == 1);
		System.out.println(3 == 1 || 1 < 0);
		System.out.println(!(3 > 1));
				
		
		
		
		
		
		
	}

}
