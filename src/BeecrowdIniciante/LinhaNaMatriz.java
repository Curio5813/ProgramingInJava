package BeecrowdIniciante;

import java.util.Scanner;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Locale;


public class LinhaNaMatriz {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		int l;
		
		String t;
		
		l = Integer.parseInt(teclado.nextLine());
		t = teclado.next();
		
		char c = t.charAt(0);
		
		double[][] matriz = new double[12][12];
		double soma;
		OptionalDouble media;
		
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 12; j++) {
				matriz[i][j] = teclado.nextDouble();
				
			}
		}
		if(c == 'S') {
			
			soma = Arrays.stream(matriz[l]).sum();
			System.out.printf("%.1f\n", soma);

		}
		else if(c == 'M') {
			
			media = Arrays.stream(matriz[l]).average();
			System.out.printf("%.1f\n",  media.orElse(0.0));
		}
		
		teclado.close();
		
	}

}
