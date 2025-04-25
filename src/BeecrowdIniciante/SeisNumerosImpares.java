package BeecrowdIniciante;

import java.util.Scanner;


public class SeisNumerosImpares {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, cont = 0;
		
		num = Integer.parseInt(teclado.nextLine());
		
		while(cont < 6) {
			if(num % 2 != 0) {
				System.out.println(num);
				cont += 1;
			}
			num += 1;
		}
		
		teclado.close();
	}

}

