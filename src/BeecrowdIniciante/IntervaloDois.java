package BeecrowdIniciante;

import java.util.Scanner;


public class IntervaloDois {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, x, cont1 = 0, cont2 = 0;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			x = Integer.parseInt(teclado.nextLine());
			if(x >= 10 && x <= 20) {
				cont1 += 1;
			}
			else {
				cont2 += 1;
			}
			
		}
		
		System.out.println(cont1 + " in");
		System.out.println(cont2 + " out");
		
		teclado.close();
		
	}

}
