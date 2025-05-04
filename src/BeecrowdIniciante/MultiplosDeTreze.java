package BeecrowdIniciante;

import java.util.Scanner;


public class MultiplosDeTreze {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int num1, num2, soma = 0;
		
		num1 = Integer.parseInt(teclado.nextLine());
		num2 = Integer.parseInt(teclado.nextLine());
		
		if(num1 <= num2) {
			
			for(int i = num1; i <= num2; i++) {
				
				if(i % 13 != 0) {
					soma += i;
				}
			}
			
		}
		else if(num1 > num2) {
					
			for(int i = num2; i <= num1; i++) {
						
				if(i % 13 != 0) {
					soma += i;
				}
			}
			
		}
		
		System.out.println(soma);
		
		teclado.close();
		
	}

}
