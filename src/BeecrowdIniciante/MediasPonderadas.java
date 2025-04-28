package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Locale;


public class MediasPonderadas {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		double valor1, valor2, valor3, media;
		
		n = Integer.parseInt(teclado.nextLine());
		
		for(int i = 0; i < n; i++) {
			
			valor1 = Float.parseFloat(teclado.next());
			valor2 = Float.parseFloat(teclado.next());
			valor3 = Float.parseFloat(teclado.nextLine());
			
			media = (valor1 * 2.0 + valor2 * 3.0 + valor3 * 5.0) / 10.0;
			
			System.out.printf("%.1f\n", media);
			
		}
		
		teclado.close();
		
	}

}
