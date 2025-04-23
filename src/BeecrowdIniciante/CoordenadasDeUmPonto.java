package BeecrowdIniciante;

import java.util.Scanner;


public class CoordenadasDeUmPonto {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double x, y;
		
		x = Double.parseDouble(teclado.next());
		y = Double.parseDouble(teclado.next());
		
		if(x == 0 && y == 0) {
			System.out.println("Origem\n");
		}
		if(x > 0 && y > 0) {
			System.out.println("Q1\n");
		}
		if(x < 0 && y > 0) {
			System.out.println("Q2\n");
		}
		if(x < 0 && y < 0) {
			System.out.println("Q3\n");
		}
		if(x > 0 && y < 0) {
			System.out.println("Q4\n");
		}
		if(x == 0 && y > 0 || y < 0) {
			System.out.println("Eixo Y\n");
		}
		if(x > 0 || x < 0 && y == 0.0) {
			System.out.println("Eixo X\n");
		}
		
		teclado.close();
		
	}

}
