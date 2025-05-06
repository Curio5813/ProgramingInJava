package BeecrowdIniciante;

import java.util.Scanner;
import java.util.Locale;


public class RaizQuadradaDeDez {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int n;
		
		n = Integer.parseInt(teclado.nextLine());
		
		double sqrt_dez = 3, denominador = 6;
		
		for(int i = 0; i < n; i++) {
			
			if(i >= 1) {
				denominador = 6 + (1 / denominador);
			}
			
			sqrt_dez = 3 + (1 / denominador);
			
		}
		
		System.out.printf("%.10f\n", sqrt_dez);
		
		teclado.close();
	}

}
