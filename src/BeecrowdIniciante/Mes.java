package BeecrowdIniciante;

import java.util.Scanner;


public class Mes {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String[] meses = {"January", "February", "March", "April", "May", "June", 
		                  "July", "August", "September", "October", "November", "December"};
		
		int mes;
		
		mes = Integer.parseInt(teclado.nextLine());
		
		for(int i = 1; i <= 12; i++) {
			if(i == mes) {
				System.out.println(meses[i - 1]);
				break;
			}
		}
		
		teclado.close();

	}

}

