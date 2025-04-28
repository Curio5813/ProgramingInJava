package BeecrowdIniciante;

import java.util.Scanner;


public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(i + " x " + n + " = " + i * n);
		}
		
		teclado.close();
		
	}

}
