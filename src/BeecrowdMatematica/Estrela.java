package BeecrowdMatematica;

import java.util.Scanner;


public class Estrela {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int n, estrelas = 0;
		
		while (teclado.hasNextLine()) {
			
			n = Integer.parseInt(teclado.nextLine());
			
			if(n >= 3 && n <= 4) {
				System.out.println(1);
			}
			else if(n == 5) {
				System.out.println(2);
			}
			
			else if(n % 5 == 0 && n % 6 == 0) {
				int soma = n / 5;
				int diff = n / 6;
				int total = diff - (soma - diff);
				System.out.println(total);
			}
			else if(n % 3 == 0 && n % 6 != 0) {
				System.out.println(n / 3);
				
			}
			else if(n % 3 == 0 && n % 6 == 0) {
				System.out.println(n / 6);
			}
			else if(n % 5 == 0) {
				System.out.println(n / 5);
			}
			else {
				n = (int) Math.floor(n / 2);
				System.out.println(n);
			}
			
		}
		
		teclado.close();
	}

}
