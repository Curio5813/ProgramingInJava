package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Locale;


public class ImpostoDeRenda {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		float rendimentos;
		
		rendimentos = Float.parseFloat(teclado.nextLine());
		
		if(0 <= rendimentos && rendimentos <= 2000.00) {
			System.out.println("Isento");
		}
		else if(2000.01 <= rendimentos && rendimentos <= 3000.00) {
			System.out.printf("R$ %.2f\n", (rendimentos - 2000) * 0.08 );
		}
		else if(3000.01 <= rendimentos && rendimentos <= 4500.00) {
			System.out.printf("R$ %.2f\n",  (3000 - 2000 )* 0.08 + (rendimentos - 3000) * 0.18);
		}
		else if(rendimentos > 4500.00) {
			System.out.printf("R$ %.2f\n", (3000 - 2000) * 0.08 + 
					(4500 - 3000) * 0.18 + (rendimentos - 4500) * 0.28);
		}
		
		teclado.close();
	}

}
