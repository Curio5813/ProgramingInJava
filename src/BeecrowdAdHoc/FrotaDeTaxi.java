package BeecrowdAdHoc;

import java.util.Scanner;
import java.util.Locale;


public class FrotaDeTaxi {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		teclado.useLocale(Locale.US);
		
		
		float p_a, p_g, r_a, r_g, km_a, km_g;
		
		p_a = teclado.nextFloat();
		p_g = teclado.nextFloat();
		r_a = teclado.nextFloat();
		r_g = teclado.nextFloat();
		
		
		km_a = p_a / r_a;
		km_g = p_g / r_g;
		
		if(km_g <= km_a) {
			System.out.println("G");
		}
		else {
			System.out.println("A");
		}
		
		teclado.close();
		
	}

}
