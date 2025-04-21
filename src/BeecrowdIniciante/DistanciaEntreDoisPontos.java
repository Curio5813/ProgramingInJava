package BeecrowdIniciante;


import java.util.Scanner;

import java.util.Locale;


public class DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		double x1, y1, x2, y2, distancia;
		
		x1 = Double.parseDouble(teclado.next());
		y1 = Double.parseDouble(teclado.nextLine());
		x2 = Double.parseDouble(teclado.next());
		y2 = Double.parseDouble(teclado.nextLine());
		
		distancia = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		
		System.out.printf("%.4f\n", distancia);
		
		teclado.close();

	}

}
