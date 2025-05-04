package BeecrowdIniciante;

import java.util.Scanner;


public class FatorialSimples {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int num, fat = 1;
		
		num = Integer.parseInt(teclado.nextLine());
		
		for(int i = 1; i <= num; i++) {
			
			fat *= i;
		}
		
		System.out.println(fat);
		
		teclado.close();
		
	}

}
