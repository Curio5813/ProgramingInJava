package BeecrowdIniciante;

import java.util.Scanner;

import java.util.Locale;


public class Lanche {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		int codigo, qtd;
		
		double total;
		
		codigo = Integer.parseInt(teclado.next());
		qtd = Integer.parseInt(teclado.next());
		
		if(codigo == 1) {
			total = qtd * 4.00;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		if(codigo == 2) {
			total = qtd * 4.50;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		if(codigo == 3) {
			total = qtd * 5.00;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		if(codigo == 4) {
			total = qtd * 2.00;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		if(codigo == 5) {
			total = qtd * 1.50;
			System.out.printf("Total: R$ %.2f\n", total);
		}
		
		teclado.close();
		
	}

}
