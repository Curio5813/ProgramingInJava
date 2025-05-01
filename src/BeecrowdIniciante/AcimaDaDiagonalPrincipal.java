package BeecrowdIniciante;

import java.util.Scanner;
import java.util.Locale;


public class AcimaDaDiagonalPrincipal {
	
	static double[][] matrix = new double[12][12];
	
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String texto = teclado.nextLine();
		
		char tipo = texto.charAt(0);
		
		ReceberValores(matrix);
		
		if(tipo == 'S') {
			System.out.printf("%.1f\n", Soma());
		}
		else if(tipo == 'M') {
			System.out.printf("%.1f\n", Soma() / 66.0);
		}
		
		teclado.close();
		
	}
	static double[][] ReceberValores(double matrix[][]) {
		
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 12; j++) {
				matrix[i][j] = Double.parseDouble(teclado.nextLine());
			}
		}
		
		return matrix;
	}
	static double Soma() {
		
		double soma = 0;
		
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 12; j++){
				if(i < j) {
					soma += matrix[i][j];
				}
			}
		}
		return soma;
	}
	
}
