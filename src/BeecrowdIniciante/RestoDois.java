package BeecrowdIniciante;

import java.util.Scanner;


public class RestoDois {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 1; i <= 10_000; i++) {
			if(i % n == 2) {
				System.out.println(i);
			}
		}
		
		teclado.close();
	}

}
