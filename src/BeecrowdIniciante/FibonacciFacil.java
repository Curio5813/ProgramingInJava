package BeecrowdIniciante;

import java.util.Scanner;


public class FibonacciFacil {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, a = 0, b = 1, p = 1;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			if(i == n - 1) {
				System.out.println(a);
				break;
			}
			System.out.printf(a + " ");
			
			a = b;
			b = p;
			p = a + b;
			
		}

	}

}
