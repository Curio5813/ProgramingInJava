package BeecrowdIniciante;

import java.util.Scanner;
import java.util.Locale;


public class RaizQuadradaDeDois {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n;
		double sqrt_dois = 1, denominador = 2;
		
		n = Integer.parseInt(teclado.nextLine());
		
		
		for(int i = 0; i < n; i++) {
			
			if(i >= 1) {
				denominador = 2 + 1 / (denominador);
			}
			
			sqrt_dois = 1 + (1 / denominador);
		}
		
		System.out.printf("%.10f\n", sqrt_dois);
		
		teclado.close();
		
	}

}
