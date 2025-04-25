package BeecrowdIniciante;

import java.util.Scanner;


public class NumerosPositivos {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		int cont = 0;
		
		double valor;
		
		for(int i = 0; i < 6; i++) {
			valor = Double.parseDouble(teclado.nextLine());
			if(valor > 0) {
				cont += 1;
			}
		}
		
		System.out.println(cont + " valores positivos");
		
		teclado.close();
	}

}
