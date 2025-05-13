package Personal;

import java.util.Scanner;


public class TrianguloDeFloyd {
	
	public static void main(String[] args) {
		
		int n, a = 1, cont = 1, b = a + cont;
		
		Scanner teclado  = new Scanner(System.in);
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			
			for(int j = a; j < b; j++) {
			
				System.out.print(j + " ");
			}
			System.out.println();
			a = b;
			cont += 1;
			b = a + cont;
					
		}
		
	}

}
