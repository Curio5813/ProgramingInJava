package BeecrowdIniciante;


import java.util.Scanner;

import java.util.Locale;

public class FormulaDeBhaskara {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double a, b, c, delta, r1, r2;
		
		a = Double.parseDouble(teclado.next());
		b = Double.parseDouble(teclado.next());
		c = Double.parseDouble(teclado.nextLine());
		
		delta = b * b - 4 * a * c;
		
		if(delta < 0.0 || a == 0) {
			System.out.println("Impossivel calcular");
		}
		else if(delta >= 0.0) {
			r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
		teclado.close();
		
	}

}
