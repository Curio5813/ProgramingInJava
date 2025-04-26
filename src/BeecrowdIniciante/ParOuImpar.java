package BeecrowdIniciante;

import java.util.Scanner;


public class ParOuImpar {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		long n, x;
		
		n = Long.parseLong(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			x = Long.parseLong(teclado.nextLine());
			if(x % 2 == 0 && x != 0) {
				if(x > 0) {
					System.out.println("EVEN POSITIVE");
				}
				else if(x < 0) {
					System.out.println("EVEN NEGATIVE");
				}
			}
			else if(x % 2 != 0 && x != 0) {
				if(x > 0) {
					System.out.println("ODD POSITIVE");
				}
				else if(x < 0) {
					System.out.println("ODD NEGATIVE");
				}
			}
			else if(x == 0) {
				System.out.println("NULL");
			}
		}
		
		teclado.close();
	}

}
