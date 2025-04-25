package BeecrowdIniciante;

import java.util.Scanner;
import java.util.Locale;


public class PositivosEMedia {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		
		float numero, media, cont = 0, soma = 0;
		
		for(int i = 0; i < 6; i++) {
			numero = Float.parseFloat(teclado.nextLine());
			if(numero > 0) {
				cont += 1.0;
				soma += numero;
			}
			
		}
		
		media = (float) (soma / cont);
		
		System.out.printf("%.0f valores positivos\n", cont);
		System.out.printf("%.1f\n", media);
		
		teclado.close();
				
	}

}
