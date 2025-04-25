package BeecrowdIniciante;

import java.util.Scanner;


public class NumerosImpares {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		numero = Integer.parseInt(teclado.nextLine());
		
		for(int i = 1; i <= numero; i++) {
			if(i % 2 != 0) {
				
				System.out.println(i);
			}
		}
		
		teclado.close();
	}

}
